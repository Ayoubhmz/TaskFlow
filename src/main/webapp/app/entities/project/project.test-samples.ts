import dayjs from 'dayjs/esm';

import { IProject, NewProject } from './project.model';

export const sampleWithRequiredData: IProject = {
  id: 24824,
  name: 'opposite',
  startDate: dayjs('2024-12-20T22:13'),
  status: 'CANCELLED',
};

export const sampleWithPartialData: IProject = {
  id: 23390,
  name: 'inside upon',
  startDate: dayjs('2024-12-21T03:05'),
  status: 'CANCELLED',
};

export const sampleWithFullData: IProject = {
  id: 27355,
  name: 'while gently',
  description: 'against gadzooks good-natured',
  startDate: dayjs('2024-12-21T13:16'),
  endDate: dayjs('2024-12-21T09:04'),
  status: 'ON_HOLD',
};

export const sampleWithNewData: NewProject = {
  name: 'vivaciously repeatedly hm',
  startDate: dayjs('2024-12-21T12:23'),
  status: 'CANCELLED',
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
