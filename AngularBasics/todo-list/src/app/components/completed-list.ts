import { Component } from "@angular/core";
import { ToDo } from "../models/todo";
import { ToDoService } from "../services/todo-service";


@Component({
    template:`
        <h4>Completed To Dos</h4>

        <ul>
            <li *ngFor="let t of todos">{{t.desc}}</li>
        </ul>
    `,
    selector:"completed"
})
export class CompletedListComponent{

    constructor(private todoService:ToDoService){};

    todos: ToDo[] = this.todoService.completedTodos;


}