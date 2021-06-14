import { Component, OnInit,Input } from '@angular/core';
import { Cours } from 'src/app/shared/model/cours';

@Component({
  selector: 'app-courses-item',
  templateUrl: './courses-item.component.html',
  styleUrls: ['./courses-item.component.css']
})
export class CoursesItemComponent implements OnInit {

  constructor() { }
  @Input() course: Cours;
  ngOnInit(): void {
  }

}
