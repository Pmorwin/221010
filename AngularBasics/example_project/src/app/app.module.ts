import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CounterComponent } from './components/counter-component';
import { GreeterComponent } from './components/greeter-component';
import { GroceryListComponent } from './components/grocery-list-component';
import { HelloComponent } from './components/hello-compoent';

@NgModule({
  declarations: [// These are all your compoents that are registed. They go under declarations
    AppComponent,
    HelloComponent,
    GreeterComponent,
    GroceryListComponent,
    CounterComponent
  ],
  imports: [//These are additional angular modules that you will add here as you need them
    BrowserModule,
    AppRoutingModule,
    FormsModule //Forms Module SHOULD be auto included but isnt, so remember to add it so you can take input data
  ],
  providers: [], //This is any serive you create, we will do this later this week
  bootstrap: [AppComponent] //Initial component to load in the index.html
})
export class AppModule { }
