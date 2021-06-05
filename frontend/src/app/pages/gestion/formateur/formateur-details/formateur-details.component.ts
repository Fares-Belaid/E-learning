import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Formateur } from 'src/app/models/formateur';
import { FormateurService } from 'src/app/services/formateur.service';

@Component({
  selector: 'app-formateur-details',
  templateUrl: './formateur-details.component.html',
  styleUrls: ['./formateur-details.component.css']
})
export class FormateurDetailsComponent implements OnInit {

  id: number
  formateur : Formateur
  constructor(private route: ActivatedRoute, private formateurService: FormateurService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.formateur = new Formateur();
    this.formateurService.getFormateurById(this.id).subscribe(data => {
      this.formateur = data;
    });
  }

}
