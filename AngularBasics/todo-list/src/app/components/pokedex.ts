import { HttpClient } from "@angular/common/http";
import { Component } from "@angular/core";
import { firstValueFrom } from "rxjs";
import { Pokemon } from "../models/pokemon";

@Component({
    template:`
        <h1>Pokedex</h1>
        <input type="text" placeholder="Enter Pokemon Name/Number" [(ngModel)] ="pokename">
        <button (click)="getPokemon()">Get Pokemon</button>

        <div *ngIf="pokemonFound">
            <h4>Name {{pokeman.name}}</h4>
            <h4>Height {{pokeman.height}}</h4>
            <h4>Weight {{pokeman.weight}}</h4>

            <img src="{{pokeman.sprites.front_default}}">
            <img src="{{pokeman.sprites.front_shiny}}">
            <h3>Abilities</h3>
            <ul>
                <li *ngFor="let ability of pokeman.abilities"> {{ability.ability.name}} </li>
            </ul>

        </div>

    `,
    selector:"pokedex"
})
export class PokeDexComponent{

    // HttpClient is a service written by angular for making HTTP Requests
    constructor(private httpClient : HttpClient){};

    pokename : string = "";
    pokemonFound : boolean = false;
    pokeman : any = null;

    async getPokemon(){
        const observable = this.httpClient.get<Pokemon>(`https://pokeapi.co/api/v2/pokemon/${this.pokename}`);
        const body = await firstValueFrom(observable); //This is the NEW angular way
        console.log(body);
        this.pokemonFound = true;
        this.pokeman = body;
    }


}