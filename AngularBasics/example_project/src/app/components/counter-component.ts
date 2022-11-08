import { Component } from "@angular/core";


@Component({
    template:`
        <h4>Counter Value {{value}}</h4>

        <button (click)="add(1)">Add 1</button>
        <button (click)="add(10)">Add 10</button>

    `,
    selector:"counter"
})
export class CounterComponent{
    value: number = 0;

    add(num :number){
        this.value += num;
    }

}