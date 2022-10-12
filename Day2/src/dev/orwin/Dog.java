package dev.orwin;

public class Dog extends Animal{
    int legs = 4;
    String color = "brown";
    boolean warmBlooded = true;
    String diet = "human food";
    boolean teeth = false;
    int eyes = 8;

    //This is my fantastic no-args constructor
    public Dog() {
    }

    //This is out all args constructor, all classes START with a no-args constructor, so if I want to be able to customize my object on creation I need to
    // write/generate an all args. BUT if you do this, it will delete the automatic no-args, and you will need to create it
    public Dog(int legs, String color, boolean warmBlooded, String diet, boolean teeth, int eyes) {
        this.legs = legs;
        this.color = color;
        this.warmBlooded = warmBlooded;
        this.diet = diet;
        this.teeth = teeth;
        this.eyes = eyes;
    }

    // This will override the "toString()" method from the Object class
    // And we can do this automatically through right-clicking, and hitting generate
    @Override
    public String toString() {
        // This is the general syntax of an object
        return "Dog{" +
                "legs=" + legs +
                ", color='" + color + '\'' +
                ", warmBlooded=" + warmBlooded +
                ", diet='" + diet + '\'' +
                ", teeth=" + teeth +
                ", eyes=" + eyes +
                '}';
    }

    @Override
    void movement() {
        System.out.println("Prance!");
    }

    @Override
    void emote() {
        System.out.println("Bow wow");
    }

    void fetch(){
        System.out.println("Its a good boy!");
    }
}
