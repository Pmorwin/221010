import { Component } from "@angular/core";
import { ToDo } from "../models/todo";
import { ToDoService } from "../services/todo-service";


@Component({
    template:`
        <h4>Pending To Dos</h4>
        <ul>
            <li *ngFor="let t of todos">
                {{t.desc}}
                <button (click)="complete(t.id)">Mark Complete</button>
            </li>
        </ul>
    `,
    selector:"pending"
})
export class PendingListComponent{
    //There is/can ONLY one instance of ToDoService. So they both access it.
    constructor(private todoService:ToDoService){};

    // There are two ways to create Arrays in TS
    // the first is Array<type of array>
    // The second is to Type[]
    // todos: ToDo[] = [
    //     new ToDo(1,"Clean the house",false),
    //     new ToDo(2,"Cook food", false),
    //     new ToDo(3,"Walk our poor suffering dog",false)
    // ] We dont need these hard coded values, lets pull from our Service
    todos: ToDo[] = this.todoService.pendingTodos;


    complete(id:number){
        this.todoService.markComplete(id);
    }
}