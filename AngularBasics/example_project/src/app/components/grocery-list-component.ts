import { Component } from "@angular/core";


@Component({
    template:`
        <h2>Grocery List</h2>

        <input type="text" placeholder="Enter your items" [(ngModel)] ="grocery">
        <button (click)="addGrocery()">Add</button>
        

        <ul *ngIf="isListVisible">
            <li *ngFor="let g of groceries"> {{g}} <counter></counter></li>
        </ul>

        <button (click)="toggleList()">Toggle List</button>

    `,
    selector:"grocery-list",
    styleUrls:["grocery.css"]

})
export class GroceryListComponent{
    grocery:string = "";
    groceries: Array<string> = [];
    isListVisible: boolean = true;

    addGrocery(){
        this.groceries.push(this.grocery);        
    }

    toggleList(){
        this.isListVisible = !this.isListVisible;
    }

}