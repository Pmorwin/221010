package dev.orwin;

import java.util.Objects;

public class Dog extends Animal{
    private String color = "brown";
    boolean warmBlooded = true;
    String diet = "human food";
    boolean teeth = false;
    int eyes = 8;
    boolean goodBoy = true; //This is NOT inherited from out parent class

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return legs == dog.legs && warmBlooded == dog.warmBlooded && teeth == dog.teeth && eyes == dog.eyes && Objects.equals(color, dog.color) && Objects.equals(diet, dog.diet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legs, color, warmBlooded, diet, teeth, eyes);
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

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWarmBlooded() {
        return warmBlooded;
    }

    public void setWarmBlooded(boolean warmBlooded) {
        this.warmBlooded = warmBlooded;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public boolean isTeeth() {
        return teeth;
    }

    public void setTeeth(boolean teeth) {
        this.teeth = teeth;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    void fetch(){
        System.out.println("Its a good boy!");
    }
}
