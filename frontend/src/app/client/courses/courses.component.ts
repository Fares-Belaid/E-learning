import { Component, OnInit } from '@angular/core';
import { CoursService } from 'src/app/services/cours.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {
  public courses=[];
  constructor(private coursService : CoursService) { }

  ngOnInit(): void {
    this.courses=this.coursService.getCours();
  }

}
