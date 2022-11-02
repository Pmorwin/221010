// JS supports functional OOP
// JS is a functional programming language first.
// Classes are rarely used in most JS and they didnt exist in JS until 2015 (i think, somewhere around then)

function hello(){
    console.log("Hey how are you doing?");
}
hello();

//function with parameters
function greet(name){
    console.log("Hello there " + name);
}

//JS obviously is **VERY VERY** particular of what you put in as the parameter (sarcasm)
greet("Josh");
greet(90);
greet(); //this will pass in undefined for the name
greet("Josh", 90, "BMX X-TREME RIDER");// just ignore the extra parameters
// JS will pretend extra arguemnts arent there

//There is NO overloading in JS. Making a function with the name name, overwrites the same function
//This is an example of Hoisting
function greet(){
    console.log("I don't like this. Crissy wake up!");
}

greet("Josh");


//Hoisting is the process of JS "pulling up" a function in your code. The reason this works, is because JS reads through
// each file twice. It goes through the first time and creates variables and functions and then excutes them the second time.
