import { Component, Input } from "@angular/core";



@Component({
    template:`
        <p>The To Do app is a simple application for tracking 
            things you need To Do! <sub>It was created by {{author}}</sub></p>
        <h5>Features include</h5>
        <ul>
            <li>Making To Dos</li>
            <li>Completing To Dos</li>
        </ul>
    `,
    selector:"about"
})
export class AboutComponent{
    @Input() author:string = "Patrick Orwin";
}