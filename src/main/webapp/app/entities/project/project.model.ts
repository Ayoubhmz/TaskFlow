import dayjs from 'dayjs/esm';
import { IUser } from 'app/entities/user/user.model';
import { ProjectStatus } from 'app/entities/enumerations/project-status.model';

export interface IProject {
  id: number;
  name?: string | null;
  description?: string | null;
  startDate?: dayjs.Dayjs | null;
  endDate?: dayjs.Dayjs | null;
  status?: keyof typeof ProjectStatus | null;
  users?: Pick<IUser, 'id' | 'login'>[] | null;
}

export type NewProject = Omit<IProject, 'id'> & { id: null };
