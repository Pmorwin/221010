import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { firstValueFrom } from 'rxjs';
import { Book } from '../models/book';

@Injectable({
  providedIn: 'root'
})
export class BookserviceService {

  constructor(private http: HttpClient) { }

  async getAllBooks():Promise<Book[]>{
    const observable = this.http.get<Book[]>("http://localhost:8080/books");
    const books = await firstValueFrom(observable); //This pulls the value out of our observable which (technically) is a promise, but is eventually a Book[]
    return books;
  }

  async registerBook(book: Book):Promise<Book>{
    const observable = this.http.post<Book>("http://localhost:8080/books",book);
    const savedBook = await firstValueFrom(observable);
    return savedBook
  }

}
