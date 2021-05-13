import { ComponentFixture, TestBed } from '@angular/core/testing';

import { QuestionQuizComponent } from './question-quiz.component';

describe('QuestionQuizComponent', () => {
  let component: QuestionQuizComponent;
  let fixture: ComponentFixture<QuestionQuizComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ QuestionQuizComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(QuestionQuizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
