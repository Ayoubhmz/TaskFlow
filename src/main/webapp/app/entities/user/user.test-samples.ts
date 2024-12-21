import { IUser } from './user.model';

export const sampleWithRequiredData: IUser = {
  id: 13929,
  login: 'kyjNy',
};

export const sampleWithPartialData: IUser = {
  id: 14774,
  login: '}@I8Qyg\\H6Z-Ia\\pqe1\\dv9\\^-X',
};

export const sampleWithFullData: IUser = {
  id: 611,
  login: '7',
};
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
