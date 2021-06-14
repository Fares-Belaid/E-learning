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
      name:"Programmation Java",
      description:"***************************************************************************************************************",
      image:"/assets/images/java.jpg",
      price:150,
      category:"Informatique",
      favorite:true
    },{
      id:2,
      name:"Spring boot",
      description:"*****************************",
      image:"/assets/images/spring-boot-logo.png",
      price:250,
      category:"Informatique",
      favorite:true
    },{
      id:3,
      name:"PHP",
      description:"*****************************",
      image:"/assets/images/php.png",
      price:50,
      category:"Informatique",
      favorite:false
    }]
    return this.cours;
  
  }
}
