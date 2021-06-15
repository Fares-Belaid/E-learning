import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Etudiant } from 'src/app/models/etudiant';
import { EtudiantService } from 'src/app/services/etudiant.service';

@Component({
  selector: 'app-etudiant-details',
  templateUrl: './etudiant-details.component.html',
  styleUrls: ['./etudiant-details.component.css']
})
export class EtudiantDetailsComponent implements OnInit {

  id: number
  etudiant : Etudiant
  constructor(private route: ActivatedRoute, private etudiantService: EtudiantService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.etudiant = new Etudiant();
    this.etudiantService.getEtudiantById(this.id).subscribe(data => {
      this.etudiant = data;
    });
  }

}
