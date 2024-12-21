import { IUser } from 'app/entities/user/user.model';

export interface IUserProfile {
  id: number;
  fullName?: string | null;
  phoneNumber?: string | null;
  bio?: string | null;
  user?: Pick<IUser, 'id' | 'login'> | null;
}

export type NewUserProfile = Omit<IUserProfile, 'id'> & { id: null };
