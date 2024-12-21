import { IUserProfile, NewUserProfile } from './user-profile.model';

export const sampleWithRequiredData: IUserProfile = {
  id: 27280,
  fullName: 'shrilly vestment',
};

export const sampleWithPartialData: IUserProfile = {
  id: 4121,
  fullName: 'frightfully',
  phoneNumber: 'times verve',
};

export const sampleWithFullData: IUserProfile = {
  id: 3512,
  fullName: 'finally',
  phoneNumber: 'sheathe',
  bio: 'during jealously yogurt',
};

export const sampleWithNewData: NewUserProfile = {
  fullName: 'simple searchingly whoever',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
