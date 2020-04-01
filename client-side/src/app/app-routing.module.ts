import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from './components/user/home/home.component';
import {LoginComponent} from './components/user/login/login.component';
import {RegisterComponent} from './components/user/register/register.component';
import {ProfileComponent} from './components/user/profile/profile.component';
import {StudentComponent} from './components/student/student/student.component';
import {TeacherComponent} from './components/teacher/teacher/teacher.component';
import {ManagerComponent} from './components/manager/manager/manager.component';
import {NotFoundComponent} from './components/error/not-found/not-found.component';
import {UnathorizedComponent} from './components/error/unathorized/unathorized.component';

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent},
  {path: 'profile', component: ProfileComponent},
  {path: 'student', component: StudentComponent},
  {path: 'student/:id', component: StudentComponent},
  {path: 'teacher', component: TeacherComponent},
  {path: 'manager', component: ManagerComponent},
  {path: '404', component: NotFoundComponent},
  {path: '401', component: UnathorizedComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
