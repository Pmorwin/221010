// Java Arrays: size cant be changed, only 1 data type at a time
// JS Arrays: automatically resized and they ANY data type
// They are typically made using the array literal syntax
// Arrays in JS are closer to Lists in Java
let nums = [10,20,30,40,50];

// for(let i = 0; i < nums.length; i++){
//     console.log(nums[i]);
// }

//enhanced for loop
for(let num of nums){
    console.log(num);
}

let arr = [null, "Hi there", 9, {fname:'Patrick',lname:'Orwin'}, 25]//We can put anything inside
console.log(arr);

//we can add to the end of an array
arr.push(true);
console.log(arr);

// remove from the end of an array
arr.pop();
console.log(arr);

//insert at index
arr.splice(1,0,"Spliced!");
console.log(arr);

//assign a new value to a given index
arr[4] = "Mike Ox"
console.log(arr);

arr[20]="What will happen?";
console.log(arr);//resizes to the "correct size" puts nothing inbetween
console.log(typeof arr[19]);//empty values are defaulted to undefined

// JS has no form of encapsulation
// There is no way in JS to prevent the accidental changing of data
// Encapsulation requires you to go out of your way to change data. They are public getters and setters, so anyone
// working on the code **CAN** change the values. So it isnt "security"
let names = ["Tommy", "Rob","Patrick"];
names.length = 90; //This is fine in js
console.log(names);