import { Injectable } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

import dayjs from 'dayjs/esm';
import { DATE_TIME_FORMAT } from 'app/config/input.constants';
import { ITask, NewTask } from '../task.model';

/**
 * A partial Type with required key is used as form input.
 */
type PartialWithRequiredKeyOf<T extends { id: unknown }> = Partial<Omit<T, 'id'>> & { id: T['id'] };

/**
 * Type for createFormGroup and resetForm argument.
 * It accepts ITask for edit and NewTaskFormGroupInput for create.
 */
type TaskFormGroupInput = ITask | PartialWithRequiredKeyOf<NewTask>;

/**
 * Type that converts some properties for forms.
 */
type FormValueOf<T extends ITask | NewTask> = Omit<T, 'deadline' | 'createdDate'> & {
  deadline?: string | null;
  createdDate?: string | null;
};

type TaskFormRawValue = FormValueOf<ITask>;

type NewTaskFormRawValue = FormValueOf<NewTask>;

type TaskFormDefaults = Pick<NewTask, 'id' | 'deadline' | 'createdDate'>;

type TaskFormGroupContent = {
  id: FormControl<TaskFormRawValue['id'] | NewTask['id']>;
  title: FormControl<TaskFormRawValue['title']>;
  description: FormControl<TaskFormRawValue['description']>;
  status: FormControl<TaskFormRawValue['status']>;
  priority: FormControl<TaskFormRawValue['priority']>;
  deadline: FormControl<TaskFormRawValue['deadline']>;
  createdDate: FormControl<TaskFormRawValue['createdDate']>;
  project: FormControl<TaskFormRawValue['project']>;
  assignedTo: FormControl<TaskFormRawValue['assignedTo']>;
};

export type TaskFormGroup = FormGroup<TaskFormGroupContent>;

@Injectable({ providedIn: 'root' })
export class TaskFormService {
  createTaskFormGroup(task: TaskFormGroupInput = { id: null }): TaskFormGroup {
    const taskRawValue = this.convertTaskToTaskRawValue({
      ...this.getFormDefaults(),
      ...task,
    });
    return new FormGroup<TaskFormGroupContent>({
      id: new FormControl(
        { value: taskRawValue.id, disabled: true },
        {
          nonNullable: true,
          validators: [Validators.required],
        },
      ),
      title: new FormControl(taskRawValue.title, {
        validators: [Validators.required, Validators.minLength(3)],
      }),
      description: new FormControl(taskRawValue.description, {
        validators: [Validators.maxLength(1000)],
      }),
      status: new FormControl(taskRawValue.status, {
        validators: [Validators.required],
      }),
      priority: new FormControl(taskRawValue.priority, {
        validators: [Validators.required],
      }),
      deadline: new FormControl(taskRawValue.deadline),
      createdDate: new FormControl(taskRawValue.createdDate, {
        validators: [Validators.required],
      }),
      project: new FormControl(taskRawValue.project),
      assignedTo: new FormControl(taskRawValue.assignedTo),
    });
  }

  getTask(form: TaskFormGroup): ITask | NewTask {
    return this.convertTaskRawValueToTask(form.getRawValue() as TaskFormRawValue | NewTaskFormRawValue);
  }

  resetForm(form: TaskFormGroup, task: TaskFormGroupInput): void {
    const taskRawValue = this.convertTaskToTaskRawValue({ ...this.getFormDefaults(), ...task });
    form.reset(
      {
        ...taskRawValue,
        id: { value: taskRawValue.id, disabled: true },
      } as any /* cast to workaround https://github.com/angular/angular/issues/46458 */,
    );
  }

  private getFormDefaults(): TaskFormDefaults {
    const currentTime = dayjs();

    return {
      id: null,
      deadline: currentTime,
      createdDate: currentTime,
    };
  }

  private convertTaskRawValueToTask(rawTask: TaskFormRawValue | NewTaskFormRawValue): ITask | NewTask {
    return {
      ...rawTask,
      deadline: dayjs(rawTask.deadline, DATE_TIME_FORMAT),
      createdDate: dayjs(rawTask.createdDate, DATE_TIME_FORMAT),
    };
  }

  private convertTaskToTaskRawValue(
    task: ITask | (Partial<NewTask> & TaskFormDefaults),
  ): TaskFormRawValue | PartialWithRequiredKeyOf<NewTaskFormRawValue> {
    return {
      ...task,
      deadline: task.deadline ? task.deadline.format(DATE_TIME_FORMAT) : undefined,
      createdDate: task.createdDate ? task.createdDate.format(DATE_TIME_FORMAT) : undefined,
    };
  }
}
