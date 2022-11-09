import { Injectable } from "@angular/core";
import { ToDo } from "../models/todo";

// This is a Dependency of compents that wioll inject into their constructor
// This is DEPENDENCY INJECTION
// Services in Angular are SINGLETON (Static in Java), so there is only 1 instance of this service anywhere. 
// We can take advantage of this to allow for the sharing of data between components
@Injectable()
export class ToDoService{
    pendingTodos : ToDo[] = [
        new ToDo(1,"Cut the Grass",false)
    ];

    completedTodos : ToDo[] = [];

    addToDo(todo:ToDo){
        this.pendingTodos.push(todo);
    }

    
    markComplete(id:number){
        for(let i = 0; i < this.pendingTodos.length; i++){
            if(this.pendingTodos[i].id === id){
                this.pendingTodos[i].isComplete = true;
                this.completedTodos.push(this.pendingTodos[i]);
                this.pendingTodos.splice(i,1);
            }
        }
    }


}