// JS has 3 scopes
// Scopes are determined by the keyword you use when creating a variable, let, const, var, or nothing
// nothing (not adding a keyword)(same as default in Java) makes the variable globally scoped
// dont use it, bad idea
// var is function scoped (it is nearly deprecated, no really uses it)
// let and const are block scope

function a(){
    x = 100; //If i dont use a keyword infront of my variable, it is global scoped and can be used ANYWHERE in my application
    // you almost never want global scoped variables
    console.log(x);

}
a();
console.log(x); //100

function b(){
    let y = 1000; //block scoped. It cannot leave the curly cracketss it is declared in
    y = 600; // let variables can be reassigned
    console.log(y);
}
b();
//console.log(y);// This will ACTUALLY THROW AN ERROR! Isnt that amazing!
function c(){
    const z = 5000;
    //z = 90; //This will error out our code, because you CANNOT reassign const values
    console.log(z);
}
c();

// var should never be used
// var is the only keyword that allows hoisting of variables. Global, const and let do not 
// Hoisting is the moving of variables/functions from lower in the code to higher
// JS reads through a file twice. The first is to allocate memory for variables and functions, the second is to execute them
function d(){
    console.log(j);//undefined
    var j = 200;
}
d();