// TS has a lot of support for OOP

// TS only has 3 access modifiers: public(same as not putting anything), private(class only), protected(inherited classes)

class Person{
    public fname: string;
    lname: string; //this is ALSO public
    private age: number;

    constructor(fname:string, lname:string, age:number){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }

    public sayHello(){
        console.log(`Hello my name is ${this.fname} ${this.lname} and I am ${this.age} years old`);
        
    }

}

const Patrick : Person = new Person("Patrick", "Orwin", 25);

class Dog{
    constructor(public owner:string, public name:string){}
}
const fido:Dog = new Dog("Rob", "Fido");
console.log(fido);

