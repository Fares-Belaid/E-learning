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
import { AvisComponent } from 'src/app/pages/gestion/avis/avis.component';
import { CommentaireComponent } from 'src/app/pages/gestion/commentaire/commentaire.component';
import { InscriptionComponent } from 'src/app/pages/gestion/inscription/inscription.component';
import { ModuleComponent } from 'src/app/pages/gestion/module/module.component';
import { QuizComponent } from 'src/app/pages/gestion/quiz/quiz.component';
import { QuestionQuizComponent } from 'src/app/pages/gestion/question-quiz/question-quiz.component';
import { RessourcesComponent } from 'src/app/pages/gestion/ressources/ressources.component';
import { SolutionComponent } from 'src/app/pages/gestion/solution/solution.component';
import { CreateFormateurComponent } from 'src/app/pages/gestion/formateur/create-formateur/create-formateur.component';
import { UpdateFormateurComponent } from 'src/app/pages/gestion/formateur/update-formateur/update-formateur.component';

export const AdminLayoutRoutes: Routes = [
    { path: 'dashboard',      component: DashboardComponent },
    { path: 'user-profile',   component: UserProfileComponent },
    { path: 'tables',         component: TablesComponent },
    { path: 'icons',          component: IconsComponent },
    { path: 'maps',           component: MapsComponent },
    { path: 'formateur',      component: FormateurComponent },
    { path: 'etudiant',           component: EtudiantComponent },
    { path: 'cours',           component: CoursComponent },
    { path: 'inscription',           component: InscriptionComponent },
    { path: 'avis',           component: AvisComponent },
    { path: 'commentaire',           component: CommentaireComponent },
    { path: 'module',           component: ModuleComponent },
    { path: 'quiz',           component: QuizComponent },
    { path: 'questionQuiz',           component: QuestionQuizComponent },
    { path: 'ressources',           component: RessourcesComponent },
    { path: 'solution',           component: SolutionComponent },
    { path: 'reclamation',           component: ReclamationComponent },
    { path: 'create-formateur',           component: CreateFormateurComponent },
    { path: 'update-formateur/:id',           component: UpdateFormateurComponent }


];
