import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from 'src/app/models/book';
import { BookserviceService } from 'src/app/services/bookservice.service';

@Component({
  selector: 'app-bookform',
  templateUrl: './bookform.component.html',
  styleUrls: ['./bookform.component.css']
})
export class BookformComponent implements OnInit {

  constructor(private bookService:BookserviceService, private router: Router) { }

  title: string = "";
  author: string = "";
  savedId: number = 0;

  ngOnInit(): void {
  }


  async register(){
    const book: Book = {id:0, title:this.title, author:this.author,returnDate:0}
    const savedBook: Book = await this.bookService.registerBook(book);
    this.savedId = savedBook.id;

    setTimeout( () => this.router.navigateByUrl("/home"), 2000);
  
  }


}
