import { Component } from "@angular/core";
import { ToDo } from "../models/todo";
import { ToDoService } from "../services/todo-service";


@Component({
    template:`
        <h4>Make a To Do</h4>
        <label for="todoInput">Add Description</label>
        <input name="todoInput" type="text" [(ngModel)] ="desc">
        <button (click)="createToDo()">Create To Do</button>
    `,
    selector:"todo-form"
})
export class CreateToDoFormComponent{
    //We need to add our services to this component
    constructor(private todoService: ToDoService){};

    desc:string = "";

    createToDo(){
        const todo:ToDo = new ToDo(Math.random(),this.desc,false)
        this.todoService.addToDo(todo);    
    }

}