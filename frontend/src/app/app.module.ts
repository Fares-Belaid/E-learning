import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';

import { AppComponent } from './app.component';
import { AdminLayoutComponent } from './layouts/admin-layout/admin-layout.component';
import { AuthLayoutComponent } from './layouts/auth-layout/auth-layout.component';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app.routing';
import { ComponentsModule } from './components/components.module';
import { FormateurComponent } from './pages/gestion/formateur/formateur.component';
import { EtudiantComponent } from './pages/gestion/etudiant/etudiant.component';
import { CoursComponent } from './pages/gestion/cours/cours.component';
import { ReclamationComponent } from './pages/gestion/reclamation/reclamation.component';
import { AvisComponent } from './pages/gestion/avis/avis.component';
import { CommentaireComponent } from './pages/gestion/commentaire/commentaire.component';
import { InscriptionComponent } from './pages/gestion/inscription/inscription.component';
import { ModuleComponent } from './pages/gestion/module/module.component';
import { QuestionQuizComponent } from './pages/gestion/question-quiz/question-quiz.component';
import { QuizComponent } from './pages/gestion/quiz/quiz.component';
import { RessourcesComponent } from './pages/gestion/ressources/ressources.component';
import { SolutionComponent } from './pages/gestion/solution/solution.component';
import { DataTablesModule } from 'angular-datatables';


@NgModule({
  imports: [
    BrowserAnimationsModule,
    FormsModule,
    HttpClientModule,
    ComponentsModule,
    NgbModule,
    RouterModule,
    AppRoutingModule,
    DataTablesModule,
    HttpClientModule
  ],
  declarations: [
    AppComponent,
    AdminLayoutComponent,
    AuthLayoutComponent,
    FormateurComponent,
    EtudiantComponent,
    CoursComponent,
    ReclamationComponent,
    AvisComponent,
    CommentaireComponent,
    InscriptionComponent,
    ModuleComponent,
    QuestionQuizComponent,
    QuizComponent,
    RessourcesComponent,
    SolutionComponent
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }