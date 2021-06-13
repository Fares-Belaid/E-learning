import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Formateur } from 'src/app/models/formateur';
import { FormateurService } from 'src/app/services/formateur.service';
import Swal from 'sweetalert2';
@Component({
  selector: 'app-formateur',
  templateUrl: './formateur.component.html',
  styleUrls: ['./formateur.component.css']
})
export class FormateurComponent implements OnInit {

  formateurs: Formateur[];

  constructor(private formateurService: FormateurService, private router: Router ) { }

  ngOnInit(): void {
    this.getAllFormateurs();
  }

  private getAllFormateurs(){
    this.formateurService.getFormateurList().subscribe(data => {
      console.log(data);
      
      this.formateurs = data;

      console.log(this.formateurs);
    });
  }

  updateFormateur(id: number){
    this.router.navigate(['update-formateur',id]);
  }
  createFormateur(){
    this.router.navigate(['create-formateur']);
  }
  /*
  deleteFormateur(id: number){
    this.formateurService.deleteFormateur(id).subscribe(data => {
      console.log(data);
      this.getAllFormateurs();
    })
  }*/

  deleteFormateur(id: number){
    Swal.fire({
      title: 'Are you sure want to remove?',
      text: 'You will not be able to recover this file!',
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: 'Yes, delete it!',
      cancelButtonText: 'No, keep it'
    }).then((result) => {
      if (result.value) {
        this.formateurService.deleteFormateur(id).subscribe(data => {
          console.log(data);
          this.getAllFormateurs();
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

  
   
  formateurDetails(id: number){
    this.router.navigate(['details-formateur',id]);
  }
}
