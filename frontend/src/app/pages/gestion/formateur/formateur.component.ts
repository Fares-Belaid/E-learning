import { Component, OnInit } from '@angular/core';
import { Formateur } from 'src/app/models/formateur';
import { FormateurService } from 'src/app/services/formateur.service';

@Component({
  selector: 'app-formateur',
  templateUrl: './formateur.component.html',
  styleUrls: ['./formateur.component.css']
})
export class FormateurComponent implements OnInit {

  formateurs: Formateur[];

  constructor(private formateurService: FormateurService) { }

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


}