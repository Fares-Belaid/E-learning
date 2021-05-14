import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

declare interface RouteInfo {
    path: string;
    title: string;
    icon: string;
    class: string;
}
export const ROUTES: RouteInfo[] = [
    { path: '/dashboard', title: 'Dashboard',  icon: 'ni-tv-2 text-primary', class: '' },
    { path: '/formateur', title: 'Gérer les formateurs',  icon:'ni-single-02 text-blue', class: '' },
    { path: '/etudiant', title: 'Gérer les étudiants',  icon:'ni-single-02 text-blue', class: '' },
    { path: '/cours', title: 'Gérer les cours',  icon:'ni-book-bookmark text-blue', class: '' },
    { path: '/reclamation', title: 'Gérer les reclamation',  icon:'ni-curved-next text-blue', class: '' },
    { path: '/avis', title: 'Gérer les avis',  icon:'ni-air-baloon text-blue', class: '' },
    { path: '/commentaire', title: 'Gérer les commentaires',  icon:'ni-chat-round text-blue', class: '' },
    { path: '/inscription', title: 'Gérer les inscriptions',  icon:'ni-key-25 text-blue', class: '' },
    { path: '/module', title: 'Gérer les modules',  icon:'ni-book-bookmark text-blue', class: '' },
    { path: '/ressources', title: 'Gérer les ressources',  icon:'ni-collection text-blue', class: '' },
    { path: '/quiz', title: 'Gérer les quizs',  icon:'ni-book-bookmark text-blue', class: '' },
    { path: '/questionQuiz', title: 'Gérer les questions de quiz',  icon:'ni-collection text-blue', class: '' },
    { path: '/solution', title: 'Gérer les solutions',  icon:'ni-bulb-61 text-blue', class: '' }
 

];

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.scss']
})
export class SidebarComponent implements OnInit {

  public menuItems: any[];
  public isCollapsed = true;

  constructor(private router: Router) { }

  ngOnInit() {
    this.menuItems = ROUTES.filter(menuItem => menuItem);
    this.router.events.subscribe((event) => {
      this.isCollapsed = true;
   });
  }
}
