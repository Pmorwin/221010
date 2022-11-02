//unlike Java you dont need a main method with JS
// It isnt a compiled language so if you have spaghetti code at the bottom, it runs top to bottom and will run
// everything before the spaghetti code and then pail
// JS is an interpreted language

console.log("Hello");
console.log("World");
//semi-colons are technically optional, but there are multiple reasons to add them
// 1st being, dont get bad habbits from JS that you carry back to Java
// Start forgetting to do things here, will result in you not doing them in Java and getting a bunch of errors
// 2nd reason, they are optional for you to place them, because JS will do it for you*
// You have to trust that JS does it correctly

//JS is loosely and dynamically typed
// Opposite to Java which is strictly and statically
// What does strictly and statically mean?
// That means you need to give a data type on variable instatiation AND there is no automatic data coersion
// JS being the opposite of that tho, means that you DONT have to give a datatype and there IS data coersion

let fname = "Patrick"; //I dont need to call this a string when I craete it (Dynamic Typing)
let age = 25; // Dynamic typing

//age = "Orwin" // WHAT? but I thought age was a number... Yea it was, and now its not. Now its a string and this fine in JS

fname += age;// This is also fine, Age even tho it is a number, will be turned into a string and concatinated with my string
// We are generally going to use 2 keywords for variable creation. let and const
// const cant be changed. If you make something const, it cannot be reassigned
// Hint for codinggames. IF you use JS they like to make the variables they give you const

let b1 = true;
let b2 = true;
let result = b1 + b2 + false; //This is converting true == 1 and false == 0 and then adding them, because obviously
console.log(result) // prints out 2
// JS's implicit data coercion leads to A LOT of bugs


