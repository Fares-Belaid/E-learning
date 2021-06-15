import { Component, OnInit } from '@angular/core';
import { Etudiant } from 'src/app/models/etudiant';
import { EtudiantService } from 'src/app/services/etudiant.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-etudiant',
  templateUrl: './create-etudiant.component.html',
  styleUrls: ['./create-etudiant.component.css']
})
export class CreateEtudiantComponent implements OnInit {

  etudiant: Etudiant = new Etudiant();

  constructor(private etudiantService: EtudiantService, private router: Router) { }

  ngOnInit(): void {
  }


  saveEtudiant(){
    this.etudiantService.CreateEtudiant(this.etudiant).subscribe(data =>{
      console.log(data)
      this.goToEtudiantList();
    },
    error => console.log(error))
  }

  goToEtudiantList(){
    this.router.navigate(['/etudiant']);
  }

  onSubmit(){
    console.log(this.etudiant);
    this.saveEtudiant();
  }
}
