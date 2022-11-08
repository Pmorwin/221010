//you declare you data type on variables using :type
let fname : string = "Patrick";
let age : number = 19;
fname = "Tommy";

//fname = 19; //Error for type mismatch

let lname = "Orwin"; //This is infered to be string because I didnt declare its datatype
//lname = 9;

//Any IS a data type
let dog : any = 19;
dog = "Rover";


//if you dont put a return type, its assumed to be void
function greet(person : string):void{
    console.log(`Hello ${person}`);
}
greet("kim");
greet(fname);
//greet(); //This wont work because it has no arugments
//greet(fname,lname) //This wont work because we only have the one function with 1 arugment

function add(num1:number, num2:number):number{
    return num1 + num2;
}

