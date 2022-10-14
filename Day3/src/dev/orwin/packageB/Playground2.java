package dev.orwin.packageB;


import dev.orwin.packageA.Game;

//Extending a class means that the fields and methods for that class
// Now belong to the class that extended the original

//Playground2 now **OWNS** the methods and variables of Game
public class Playground2 extends Game{
    public static void main(String[] args) {
        Game game = new Game();//This will not work for protected things

        //This will allow me to use protected methods and variables
        Playground2 test = new Playground2();
        System.out.println(test.author);
        test.test();
        play();
    }
}
