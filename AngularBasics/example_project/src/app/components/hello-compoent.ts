import { Component } from "@angular/core";



@Component({
    template:`
    <h1>Welcome to my Angular web app</h1>
    <p>This is an awesome web app<sub>created by {{author}}</sub></p>
    
    <button (click)="hello($event)">Hello</button> 
    <!-- This is event binding -->

    `, //This will be our HTML template for the component 
    selector: "hello" //This is the name for our custom HTML tag
})
export class HelloComponent{

    author : string = "Patrick Orwin"; // {{}} is interpolation
    //I call them curly/squigily brackets
    //You may hear them called mustache brackets

    //You *CAN* capture the event if you need to for some reason
    hello(event:MouseEvent){
        // console.log(event);
        // 95% of the time, if you are getting the event you are doing something wrong because that isnt the "Angular way"
        alert("Hello");
    }

}