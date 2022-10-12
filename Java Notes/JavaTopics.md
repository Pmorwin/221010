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
    
