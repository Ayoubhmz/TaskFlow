import dayjs from 'dayjs/esm';

import { INotification, NewNotification } from './notification.model';

export const sampleWithRequiredData: INotification = {
  id: 2156,
  message: 'via dazzling unusual',
  timestamp: dayjs('2024-12-20T21:37'),
  isRead: true,
};

export const sampleWithPartialData: INotification = {
  id: 22297,
  message: 'blah',
  timestamp: dayjs('2024-12-20T17:19'),
  isRead: false,
};

export const sampleWithFullData: INotification = {
  id: 16981,
  message: 'presell old in',
  timestamp: dayjs('2024-12-21T12:33'),
  isRead: false,
};

export const sampleWithNewData: NewNotification = {
  message: 'yesterday',
  timestamp: dayjs('2024-12-20T21:33'),
  isRead: true,
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
