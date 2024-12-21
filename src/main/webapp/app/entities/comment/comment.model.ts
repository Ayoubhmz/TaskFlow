import dayjs from 'dayjs/esm';
import { ITask } from 'app/entities/task/task.model';

export interface IComment {
  id: number;
  content?: string | null;
  timestamp?: dayjs.Dayjs | null;
  task?: Pick<ITask, 'id' | 'title'> | null;
}

export type NewComment = Omit<IComment, 'id'> & { id: null };
