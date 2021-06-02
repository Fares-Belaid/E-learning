import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Formateur } from 'src/app/models/formateur';
import { FormateurService } from 'src/app/services/formateur.service';

@Component({
  selector: 'app-create-formateur',
  templateUrl: './create-formateur.component.html',
  styleUrls: ['./create-formateur.component.css']
})
export class CreateFormateurComponent implements OnInit {

  formateur: Formateur = new Formateur();

  constructor(private formateurService: FormateurService, private router: Router) { }

  ngOnInit(): void {
  }

  saveFormateur(){
    this.formateurService.CreateFormateur(this.formateur).subscribe(data =>{
      console.log(data)
      this.goToFormateurList();
    },
    error => console.log(error))
  }

  goToFormateurList(){
    this.router.navigate(['/formateur']);
  }

  onSubmit(){
    console.log(this.formateur);
    this.saveFormateur();
  }

}
