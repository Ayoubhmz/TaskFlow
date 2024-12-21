import dayjs from 'dayjs/esm';

import { IComment, NewComment } from './comment.model';

export const sampleWithRequiredData: IComment = {
  id: 14630,
  content: 'swanling circular',
  timestamp: dayjs('2024-12-21T09:52'),
};

export const sampleWithPartialData: IComment = {
  id: 12951,
  content: 'wire to very',
  timestamp: dayjs('2024-12-21T07:03'),
};

export const sampleWithFullData: IComment = {
  id: 24575,
  content: 'geez ordinary quirkily',
  timestamp: dayjs('2024-12-21T12:34'),
};

export const sampleWithNewData: NewComment = {
  content: 'eek dimly',
  timestamp: dayjs('2024-12-21T08:38'),
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
