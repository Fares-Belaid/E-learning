import { Routes } from '@angular/router';

import { DashboardComponent } from '../../pages/dashboard/dashboard.component';
import { IconsComponent } from '../../pages/icons/icons.component';
import { MapsComponent } from '../../pages/maps/maps.component';
import { UserProfileComponent } from '../../pages/user-profile/user-profile.component';
import { TablesComponent } from '../../pages/tables/tables.component';
import { FormateurComponent } from 'src/app/pages/gestion/formateur/formateur.component';
import { EtudiantComponent } from 'src/app/pages/gestion/etudiant/etudiant.component';
import { CoursComponent } from 'src/app/pages/gestion/cours/cours.component';
import { ReclamationComponent } from 'src/app/pages/gestion/reclamation/reclamation.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'tables',         component: TablesComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'maps',           component: MapsComponent },
    { path: 'formateur',      component: FormateurComponent },
    { path: 'etudiant',           component: EtudiantComponent },
    { path: 'cours',           component: CoursComponent },
    { path: 'reclamation',           component: ReclamationComponent }
];
