import { Injectable } from '@angular/core';
import { Cours } from '../shared/model/cours';

@Injectable({
  providedIn: 'root'
})
export class CoursService {

  private cours:Array<Cours>
  constructor() { }


  getCours():any{
    this.cours=[{
      id:1,
      name:" Java",
      description:" La technologie Java définit à la fois un langage de programmation orienté objet et une plateforme informatique. ",
      image:"/assets/images/java.png",
      price:150,
      category:"Informatique",
      favorite:true
    },{
      id:2,
      name:"Spring boot",
      description:"Spring est un framework open source pour construire et définir l'infrastructure d'une application Java",
      image:"/assets/images/spring-boot-logo.png",
      price:250,
      category:"Informatique",
      favorite:true
    },{
      id:3,
      name:"PHP",
      description:"PHP: Hypertext Preprocessor, plus connu sous son sigle PHP, est un langage de programmation libre, principalement utilisé pour produire des pages Web dynamiques ",
      image:"/assets/images/php.png",
      price:50,
      category:"Informatique",
      favorite:false
    }]
    return this.cours;
  
  }
}
