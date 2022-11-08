import { Component } from "@angular/core";


@Component({
    template:`
        <h4>Hello what is your name?</h4>
        <input type="text" placeholder="Enter your name!" [(ngModel)] ="name">
        <!-- ^^^ This is two-way binding -->
        <button (click)="greet()">Greet</button>
        <!-- ^^^ This is event binding -->
        <p>Welcome {{name}}</p> 
        <!-- ^^^ This is interpolation -->
    `,
    selector:"greeter"    
})
export class GreeterComponent{
    
    name: string = "";

    greet(){
        alert(`Hello ${this.name} `);
    }
}