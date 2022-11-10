import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookregisterComponent } from './components/bookregister/bookregister.component';
import { BookviewerComponent } from './components/bookviewer/bookviewer.component';
import { HomepageComponent } from './components/homepage/homepage.component';

const routes: Routes = [
  {path:"home", component: HomepageComponent},
  {path:"viewer", component: BookviewerComponent},
  {path:"register", component: BookregisterComponent},
  {path:"", component: HomepageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
