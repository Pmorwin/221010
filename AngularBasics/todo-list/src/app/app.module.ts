import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutComponent } from './components/about';
import { CompletedListComponent } from './components/completed-list';
import { CreateToDoFormComponent } from './components/create-todo-form';
import { PendingListComponent } from './components/pending-list';
import { PokeDexComponent } from './components/pokedex';
import { ToDoMainComponent } from './components/todo-main';
import { ToDoService } from './services/todo-service';

@NgModule({
  declarations: [
    AppComponent,
    ToDoMainComponent,
    AboutComponent,
    CreateToDoFormComponent,
    PendingListComponent,
    CompletedListComponent,
    PokeDexComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [ToDoService],
  bootstrap: [AppComponent]
})
export class AppModule { }
