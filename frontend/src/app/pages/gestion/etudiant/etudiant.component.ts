import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Etudiant } from 'src/app/models/etudiant';
import { EtudiantService } from 'src/app/services/etudiant.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-etudiant',
  templateUrl: './etudiant.component.html',
  styleUrls: ['./etudiant.component.css']
})
export class EtudiantComponent implements OnInit {

  etudiants: Etudiant[];
  constructor(private etudiantService: EtudiantService, private router: Router) { }

  ngOnInit(): void {
    this.getAllEtudiants();
  }

  private getAllEtudiants(){
    this.etudiantService.getEtudiantList().subscribe(data => {
      console.log(data);
      
      this.etudiants = data;

      console.log(this.etudiants);
    });
  }

  updateEtudiant(id: number){
    this.router.navigate(['update-etudiant',id]);
  }
  createEtudiant(){
    this.router.navigate(['create-etudiant']);
  }
  /*
  deleteFormateur(id: number){
    this.formateurService.deleteFormateur(id).subscribe(data => {
      console.log(data);
      this.getAllFormateurs();
    })
  }*/

  deleteEtudiant(id: number){
    Swal.fire({
      title: 'Are you sure want to remove?',
      text: 'You will not be able to recover this file!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.etudiantService.deleteEtudiant(id).subscribe(data => {
          console.log(data);
          this.getAllEtudiants();
        })
        Swal.fire(
          'Deleted!',
          'Your imaginary file has been deleted.',
          'success'
        )
      } else if (result.dismiss === Swal.DismissReason.cancel) {
        Swal.fire(
          'Cancelled',
          'Your imaginary file is safe :)',
          'error'
        )
      }
    })
  }

  
   
  etudiantDetails(id: number){
    this.router.navigate(['details-etudiant',id]);
  }

}
