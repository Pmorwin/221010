import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomepageComponent } from './components/homepage/homepage.component';
import { BookviewerComponent } from './components/bookviewer/bookviewer.component';
import { BookregisterComponent } from './components/bookregister/bookregister.component';
import { AboutComponent } from './components/about/about.component';
import { ContactinfoComponent } from './components/contactinfo/contactinfo.component';
import { BooktableComponent } from './components/booktable/booktable.component';
import { FormsModule } from '@angular/forms';
import { BookformComponent } from './components/bookform/bookform.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomepageComponent,
    BookviewerComponent,
    BookregisterComponent,
    AboutComponent,
    ContactinfoComponent,
    BooktableComponent,
    BookformComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
