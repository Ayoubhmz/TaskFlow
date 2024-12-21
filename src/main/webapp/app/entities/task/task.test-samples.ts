import dayjs from 'dayjs/esm';

import { ITask, NewTask } from './task.model';

export const sampleWithRequiredData: ITask = {
  id: 31782,
  title: 'smoggy',
  status: 'IN_PROGRESS',
  priority: 'LOW',
  createdDate: dayjs('2024-12-21T11:18'),
};

export const sampleWithPartialData: ITask = {
  id: 9331,
  title: 'hmph menacing',
  description: 'instead dilate gadzooks',
  status: 'TODO',
  priority: 'LOW',
  deadline: dayjs('2024-12-21T07:19'),
  createdDate: dayjs('2024-12-20T18:53'),
};

export const sampleWithFullData: ITask = {
  id: 24929,
  title: 'ifX',
  description: 'ownership yet',
  status: 'TODO',
  priority: 'MEDIUM',
  deadline: dayjs('2024-12-20T16:45'),
  createdDate: dayjs('2024-12-21T02:09'),
};

export const sampleWithNewData: NewTask = {
  title: 'vision',
  status: 'TODO',
  priority: 'LOW',
  createdDate: dayjs('2024-12-20T20:44'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
