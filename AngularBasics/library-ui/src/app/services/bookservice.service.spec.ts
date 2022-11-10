import { TestBed } from '@angular/core/testing';

import { BookserviceService } from './bookservice.service';

describe('BookserviceService', () => {
  let service: BookserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BookserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
