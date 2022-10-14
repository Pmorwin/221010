## Java Classes
- The best way I can think to describe one is as a blueprint or template for an object
- Classes contain variables (fields) and behaviors (methods)
    - Fields are variables that store information about the class
    - Methods are blocks of code that represent some action that our class can take
        - Other languages refer to these as functions, but in Java, we say Method
- You can think of the variables like the attirubutes of a class and the methods as what it can do
- Fields and methods together are know as memebers
- Best practice for naming your classes is using upper-case CamelCase
    -Eg. ThisIsMyClass
- A class can extend another through using the "extends" keyword
    - Classes can **ONLY** entend 1 other class

## Java Objects
- Objects are an "instance" of a class
    - Objects are houses as classes are to blueprints. 
    - Class = Blueprint, Object = House
- Objects are created using the class in its initial state
    - Unless you use a constructor to alter the inital state of the object

## Constrctors
- Constructors are a special type of method that initialize (create) objects
- Specifically it assigns values to an objects variables
- Every class will have a constructor on creation (no-args)
    - The complier will automatically add a default "no-args" in your class for you if you dont add one yourself
    - **BUT** if you add/provide your own constructor, the complier will eleminate the deafult no-args. So you will manually need to add it
- **Super** is a keyword used in constructors
    - This refers 
- **this** is a keyword
    - **this** will either assign a vlaue, or call another constructor when used
        - If you call another constructor, this is considered Constructor chaining
    - The first line of any constructor is super() (wether you put it there or not), if its not there the complier will add it for you




## Class/Object/Constructor Relationship
- Classes are the blueprints to your Objects
- Objects are the embodiment of the class
    - A tangible representation of the class
    - There are lots of dogs, but only 1 buster
- Constructors **ACTUALLY** create the object
    - We can customize our construtors to meet our needs
    - All classes have a no-args automaticall
    - If you create another constructor, you will have to manually add the no-args, because it is deleted
    - Constructors can **ONLY** deal with variables that exist in the class itself
    
## Variable Scope
- Variable scope define where a variable can be seen/accessed in the code
- There are 4 variable scopes in Java
    - Class Scope (static): Static variables must be declared inside a Class. These static variables are accessible to all objects of that class
        - A change in the value of a class scoped variable is reflected in **ALL** other objects of that class
        - If you change anything in one, you change it in all of them
    - Instance Scope (Object): The variable is non-static and is accessible anywhere within the object
        - Can also be called field variables
        - A change in one value of a non-static variable will **ONLY** be reflected in that specific object
        - If you change anything in one, it is only changed in that one
    - Method Scope: Variables declared in a method
        - These variables are only visible within that method
        - This includes the variables that are used as the parameters (arugments) given to the method
    - Block Scope: A block scope variable is a variable that has been declared within a "block" of code (inside of two curly braces)
        - Method scope, is a sub-set of block
        - For loops are a great example of block scope, we generally use i for iterating, and it is scoped for the block only, so we can use it over and over again
- Something that helps me visualize "Scope" is a sniper. 
    - Cant see things in between buildings down scope
        - For instance, if you create a for loop in a method, any variables created in that for loop are "below the line of sight" of the method

       ```java 
        public class Dog{
            String Color = "blue";// This is instance scoped
            static String species = "canine"; // This is static scoped

            public void randomMethod(String potato){// potato is method scope (technically block scope)
                System.out.println(potato); // This is here for the sake of using the variable potato
                for(int i = 0; i < N; i++){ //i is block scope
                    int x = 0; //block scope
                    //potato is visible here
                }
            // x isnt visible here
            // i isnt visible here either
            }

            if(Color == "blue"){
                int ww = 5; //This is block scoped
            }
            // potato isn't visible here

        }
        ```

## Access Modifers
- Methods AND Variables are declared with access modifers. These access modifiers determine where in our code, they can be "viewed".
- There are 4 access modifiers that you need to be keenly aware of, 3 of them you we use very often, 1 you have already been using
    - Public : Visable Everywhere
    - Protected : Visable to anything within the package (folder) AND any children of things from that package, even if they arent in the same package.
        - If my Dog class is in package A, and its variables are protected, I CAN use them in package B **IF** I inherit the Dog class
    - (default) : Visable to anything within the package (folder)
        - If my Dog class is in package A, and its variables are default, I CANNOT use them in package B, even if I inherit the Dog class    
    - Private : Only availible within the specific class it is created in


## Non-access Modifers
- Methods are able to have non-access modifers, that are NOT required to be added. You declare them in the method signature and it comes right after your access modifer.
    - Static: This makes makes the member it belongs to apart of the class as opposed to being apart of the object
        ```java
        public class Game{
            public static void test(){

            }
            public void play(){

            }
        }
        public class Driver{
            public static void main(String[] args){
                test();//To call static methods, you just write the name of the method
                
                
                Game game = new Game(); // You only need to create this for non-static methods
                game.play();//To call non-static methods, you need to create and use an object of that class

            }
        }
        ```
    - Final: Very self explanitory, methods and variables with this non-access modifer cannote be changed
        - Variables are unable to be reassigned
        - Classes cannot be inherited
        - Methods cannot be overridden
    - Abstract: This is when you concrete methods from a class, to make it easier to impliment that class in different situations. It is very similar to an interface
        - This is TECHNICALLY only for the sake of convience 
    
## Constructors 
- Constructors are a special type of method are are used specifically to create Objects
- They assign values to the objects variables, based on the arguemnts they recieve

## Java Methods
- Define the behaviors of a class/object
    - They are what your class/object can do
- Methods can be thought of as a block of code that can used multiple times (repeatable block of code)
- Often you use Methods to manipulate date in some way or to move data between layers of your code
- Method are conventionally named using lower-case camelCase
    - Eg. thisIsMyMethod();
- Anatomy of a method:
    - [Acess Modifier] [Non-Access Modifier (optional)] [Return Type] [Name] (parameters/arguments){}