import { Component } from "@angular/core";

//Parent child relationship
// Todo main is the parent of about, and form, as well as anything else we are going to be adding
@Component({
    template:`
        <h2>Awesome ToDo App!</h2>
        <about author="Rob Hammet"></about>
        <todo-form></todo-form>
        <pending></pending>
        <completed></completed>
    `,
    selector:"todo-main"
})
export class ToDoMainComponent{

}