import { Routes } from '@angular/router';
import { CoursesComponent } from 'src/app/client/courses/courses.component';
import { HomeComponent } from 'src/app/client/home/home.component';

import { LoginComponent } from '../../pages/login/login.component';
import { RegisterComponent } from '../../pages/register/register.component';

export const AuthLayoutRoutes: Routes = [
    { path: 'login',          component: LoginComponent },
    { path: 'register',       component: RegisterComponent },
    { path: 'home',           component: HomeComponent },
    { path: 'courses',           component: CoursesComponent }
    
];
