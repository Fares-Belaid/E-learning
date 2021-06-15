import { Routes } from '@angular/router';
import { AboutComponent } from 'src/app/client/about/about.component';
import { BlogComponent } from 'src/app/client/blog/blog.component';
import { ContactComponent } from 'src/app/client/contact/contact.component';
import { CoursesComponent } from 'src/app/client/courses/courses.component';
import { EventsComponent } from 'src/app/client/events/events.component';
import { HomeComponent } from 'src/app/client/home/home.component';
import { TeacherComponent } from 'src/app/client/teacher/teacher.component';

import { LoginComponent } from '../../pages/login/login.component';
import { RegisterComponent } from '../../pages/register/register.component';

export const AuthLayoutRoutes: Routes = [
    { path: 'login',          component: LoginComponent },
    { path: 'register',       component: RegisterComponent },
    { path: 'courses',       component: CoursesComponent },
    { path: 'home',           component: HomeComponent },
    { path: 'about',           component: AboutComponent },
    { path: 'teacher',           component: TeacherComponent },
    { path: 'blog',           component: BlogComponent },
    { path: 'events',           component: EventsComponent },
    { path: 'contact',           component: ContactComponent }

];
