// JS has insanely aggressive type coercion
// JS will compares apples to oranges even if they actually are both bananas that are pretending to be grapes

console.log(8 == "8");// true JS will coerce the string 8 into a number then compare them
console.log(0 == "0"); //true
console.log(0 == ""); //true
console.log(0 == false); //true
console.log("false" == false); //false
console.log(null == false); //false
console.log(null == null);//true
let result = 100/"roach"; //this wont error out. JS is fine with this. 
//JS peforms the division and goes "Hey, this isnt a number"
console.log(result);//NaN 
console.log(typeof "dog"); //string
console.log(typeof result);// obviously a number
console.log(result == false);//false
console.log(result == result);//false, NaN will **ALWAYS** return false in a comparison
//Why? JS

//Truthy and Falsy values
// All values in JS are truthy (they will be converted into the boolean true)
// EXCEPT for the 6 falsy values

// These include
Boolean(0);
Boolean("");
Boolean(false);
Boolean(null);
Boolean(undefined);
Boolean(NaN);
//These are the only values that are falsy in JS
// An easy way to remember them is they all "stand for" nothingness

// === strict equality (this compares the datatype as well) (use it, dont use == like ever)
console.log(2 == "2"); //true
console.log(2 === "2"); //false
// === compares both the datatype and the value 