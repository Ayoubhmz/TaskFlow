import { Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authority',
    data: { pageTitle: 'taskFlowApp.adminAuthority.home.title' },
    loadChildren: () => import('./admin/authority/authority.routes'),
  },
  {
    path: 'comment',
    data: { pageTitle: 'taskFlowApp.comment.home.title' },
    loadChildren: () => import('./comment/comment.routes'),
  },
  {
    path: 'notification',
    data: { pageTitle: 'taskFlowApp.notification.home.title' },
    loadChildren: () => import('./notification/notification.routes'),
  },
  {
    path: 'project',
    data: { pageTitle: 'taskFlowApp.project.home.title' },
    loadChildren: () => import('./project/project.routes'),
  },
  {
    path: 'task',
    data: { pageTitle: 'taskFlowApp.task.home.title' },
    loadChildren: () => import('./task/task.routes'),
  },
  {
    path: 'user-profile',
    data: { pageTitle: 'taskFlowApp.userProfile.home.title' },
    loadChildren: () => import('./user-profile/user-profile.routes'),
  },
  /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
];

export default routes;
