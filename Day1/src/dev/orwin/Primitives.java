package dev.orwin;

    // Java primitives are one of the few things that Java has that ARENT Object
    // Java is NOT fully OOP, because primitives exist
    // Primitives are our data types
    // Generally speaking they are "simple"

public class Primitives {

    public static void main(String[] args) {

        boolean b = true; //Possible States? True or False
        byte o = 10; // How big? -128 -> 127, 1 byte is 1 byte of memory. FUN FACT!
        short s = 10; // -32768 -> 32767 2 bytes
        char c = 'c'; // YOU FALLEN FOR THE TRAP AGAIN!  -32768 -> 32767. Chars are numbers in disguise
        int i = 10; //How big is it? 32 bits -2.1 billon -> 2.1 billon - 1 // This TAKES up 32 bits of memory
        long l = 10l; //64 bits, or 8 bytes (1 byte is 8 bits) Whole numbers, need to add an l if it is bigger then an int
        float f = 10.0f; //Float is special, you have to put an f after the number, because Java defaults it to a double otherwise.
        double dd = 10.0; // Decimals and like long, it is also 64 bits/8btyes, you need to add a d if it is bigger then an int


        // Int, Double, Boolean are going to be the main 3 primitives you use. You could worry about memory allocation
        // but for what we are building, it wont matter


        // System.out.println(c);
        //Alt + shift + (arrow keys) lets you move lines of code up and down


        // To help with readability you can add "_" underscores to numbers
        long population = 7_000_000_000l;
        double pop = 70000000000.0d; //EVERYTHING DEAFULTS TO INT
        System.out.println(population);


        //Casting, to change a datatype of a variable to a different datatype
        // Creating a float is "technically" casting it, because it defaults to double
        // When casting, it is always safe to store values from a smaller primitive to a larger primitive
        byte bb = 5;
        int bc = (int)bb;
        //Casting is done through adding the () parentheses and the datatype inside

        // It is NOT safe to cast from a bigger datatype to a smaller data type
        int ww = 1232132; //Objectively not 5
        byte op = (byte)ww;
        System.out.println(op);//Gives us 4

        int test = 5;





        // YOU FELL FOR THE TRAP!!!!!
        // STRINGs ARE NOT PRIMTIVES, they are objects!!!!!
        // Strings are very special objects
        // Strings are "immutable" which means they cant be changed
        // Strings are very special :)

        String potato = "potato";
        potato = potato.concat("s");
        System.out.println(potato);

        // The reason you have to re-define the reference variable to change a string, is because of memory
        // Strings are very special in memory and they are part of the reason that Java can be more memory efficient when doing big computations
        // Strings dont have a standardized place in memoery
        // Strings reside in the string pools, which is memory made up of "unused memory"
        // The String pool will gather up all your allocated but unused memory, and actually use it. So that things dont go to waste


        // The mutable form of String is StringBuilder and StringBuffer
        String dog = "doggo"; // vvvvvvvvv
        String cat = "doggo"; //These point to the exact same spot in memory
        StringBuilder doggo = new StringBuilder("doggo"); //  vvvvvvvvvvvvvvvvvv
        StringBuilder catto = new StringBuilder("doggo"); //These point to different spaces in memory

        // StringBuilder and StringBuffer are *almost* identical
        // StringBuilder is faster, but it ISNT Thread Safe, so you cant use it when multi-threading
        // StringBuffer IS thread safe
        // The ONLY reason StringBuffer ISNT deprecated (to not be usable anymore) is because of threading



    }







}
