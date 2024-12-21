import dayjs from 'dayjs/esm';
import { IUser } from 'app/entities/user/user.model';

export interface INotification {
  id: number;
  message?: string | null;
  timestamp?: dayjs.Dayjs | null;
  isRead?: boolean | null;
  user?: Pick<IUser, 'id' | 'login'> | null;
}

export type NewNotification = Omit<INotification, 'id'> & { id: null };
