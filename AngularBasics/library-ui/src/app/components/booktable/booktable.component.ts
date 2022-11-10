import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/models/book';
import { BookserviceService } from 'src/app/services/bookservice.service';

@Component({
  selector: 'app-booktable',
  templateUrl: './booktable.component.html',
  styleUrls: ['./booktable.component.css']
})
export class BooktableComponent implements OnInit {

  constructor(private bookService: BookserviceService) { }

  books: Book[] = [];

  // ngOnInit is a method that is called when teh compoent is first rendered
  // It is really helpful for getting information when the component loads like making an http request
  ngOnInit(): void {
    (async () =>{
      //This delays how long it takes the functions to run. The first arugment is the function you want to delay
      //the second arumgent is the amount of Miliseconds you want to delay it by
      setTimeout( async() => this.books = await this.bookService.getAllBooks(), 1000);
    })();
  }

  

}
