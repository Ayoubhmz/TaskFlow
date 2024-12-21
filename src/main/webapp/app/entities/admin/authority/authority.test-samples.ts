import { IAuthority, NewAuthority } from './authority.model';

export const sampleWithRequiredData: IAuthority = {
  name: '7ca44edc-25b1-4110-806f-45e6ff2ced64',
};

export const sampleWithPartialData: IAuthority = {
  name: 'b6fa6569-9d5d-47eb-94d1-d9a3d9d42964',
};

export const sampleWithFullData: IAuthority = {
  name: 'a271f26f-b8f8-4b7e-9885-4622a40fc51d',
};

export const sampleWithNewData: NewAuthority = {
  name: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
