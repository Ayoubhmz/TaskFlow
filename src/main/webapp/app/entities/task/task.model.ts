import dayjs from 'dayjs/esm';
import { IProject } from 'app/entities/project/project.model';
import { IUser } from 'app/entities/user/user.model';
import { TaskStatus } from 'app/entities/enumerations/task-status.model';
import { TaskPriority } from 'app/entities/enumerations/task-priority.model';

export interface ITask {
  id: number;
  title?: string | null;
  description?: string | null;
  status?: keyof typeof TaskStatus | null;
  priority?: keyof typeof TaskPriority | null;
  deadline?: dayjs.Dayjs | null;
  createdDate?: dayjs.Dayjs | null;
  project?: Pick<IProject, 'id' | 'name'> | null;
  assignedTo?: Pick<IUser, 'id' | 'login'> | null;
}

export type NewTask = Omit<ITask, 'id'> & { id: null };
