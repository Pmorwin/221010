import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookregisterComponent } from './bookregister.component';

describe('BookregisterComponent', () => {
  let component: BookregisterComponent;
  let fixture: ComponentFixture<BookregisterComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookregisterComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BookregisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
