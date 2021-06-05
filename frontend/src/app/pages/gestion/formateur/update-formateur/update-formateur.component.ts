import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Formateur } from 'src/app/models/formateur';
import { FormateurService } from 'src/app/services/formateur.service';

@Component({
  selector: 'app-update-formateur',
  templateUrl: './update-formateur.component.html',
  styleUrls: ['./update-formateur.component.css']
})
export class UpdateFormateurComponent implements OnInit {

  id: number;
  formateur: Formateur = new Formateur();

  constructor(private formateurService: FormateurService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.formateurService.getFormateurById(this.id).subscribe(data => {
      this.formateur = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.formateurService.updateFormateur(this.id, this.formateur).subscribe(data => {
      this.goToFormateurList();
    }, error => console.log(error));
  }

  goToFormateurList(){
    this.router.navigate(['/formateur']);
  }

}
