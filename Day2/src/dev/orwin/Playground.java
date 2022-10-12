package dev.orwin;

public class Playground {

    public static void main(String[] args) {
        Dog buster =  new Dog();
        Dog pepper = new Dog(2,"vomit green",false,"trash",true,1);
        Dog simba = new Dog();

        Dog scar = new Dog();
        Dog mufasa = new Dog();

        // == only looks at the memory address, which is why you use them for primitives.
        System.out.println(scar == mufasa);
        //If you do not overwrite the .equals method in your class, it will ONLY look at the memory address of objects.
        System.out.println(scar.equals(mufasa));

        //We need to change the variables/attributes of an object after creation
        // Getters/setters help you translate received data
        simba.setLegs(3);
        simba.setColor("block");
        simba.setWarmBlooded(true);
        simba.setDiet("Grubs");
        simba.setTeeth(true);
        simba.setEyes(14);

        System.out.println("This is buster, he is a good boy: " + buster); //What will happen if I print this out?

        System.out.println("My dog buster is " + buster.color + " and he has " + buster.eyes + " eyes!");

        System.out.println("This is pepper they are evil: " + pepper);

        System.out.println("This is simba: " + simba);





    }







}
