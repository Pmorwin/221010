import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookviewerComponent } from './bookviewer.component';

describe('BookviewerComponent', () => {
  let component: BookviewerComponent;
  let fixture: ComponentFixture<BookviewerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookviewerComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookviewerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
