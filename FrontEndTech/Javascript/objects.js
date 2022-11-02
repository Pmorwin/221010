// JS used to have no classes
// JS did have objects via object literals
// Objects are key value pairs
// They should remind you a lot of JSON

let patrick = { fname:"Patrick", lname:'Orwin', age:25, isTrainer:true};

//objects are always mutable
patrick.age = 20; //you can change the values at any time
patrick.height = "6'4";// you can add properties whenever

let patrickJSON = JSON.stringify(patrick); //This turns JS objects into JSON Objects
console.log(patrickJSON);

let kubanJSON = `{"fname":"Kuban", "lname":"Dzhumagalov", "age":29, "isTrainer":false, "height":"5'10"}`;
let kubanObject = JSON.parse(kubanJSON);
console.log(kubanObject);

// Objects can have functions attached to them. In that case it is a mathod that uses this keyword if waranted

let tommy = {
    fname:"Tommy",
    sayHello: function(){
        console.log("Hi I am " + this.fname + ". Nice to meet you!");
    }
}

//You can reasign a function like this! The more you know (rainbow) 
tommy.sayHello = function(){console.log("I am a stinky stinky meanie")};

tommy.sayHello();

let tommyJSON = JSON.stringify(tommy);
console.log(tommyJSON);// Functions are excluded from JSONs. JSONs are they primary format for data and supposed to be
// **langauge agnostic**. The idea with JSONs is that ANY lanauge and use them. 

//accessing the properties of an object can be similar to Java with dot notation
console.log(tommy.fname);//Tommy

//You can also use bracket notation
console.log(tommy['fname'])//Tommy
