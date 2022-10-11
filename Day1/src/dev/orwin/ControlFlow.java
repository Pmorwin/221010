package dev.orwin;

public class ControlFlow {
    public static void main(String[] args) {
        //If statements are conditionals
        //if (condition) if that condition = true, what follows the if will take place, if it is false, it will not
        String answer = "flase";

        // == is a comparator. But specifically, it looks at the location in memory, not the actual value. So dont use == for objects
        // For objects you want to use .equals()
        System.out.println("(If statements)============================");
        if(answer == "false"){
            System.out.println("It was true!");
        }
        else if(answer == "potato"){
            System.out.println("It was a potato the WHOLE time!");
        }
        else{
            System.out.println("It was false!");
        }

        System.out.println("(Switch statements)============================");
        //This will look at a variable, and based on the variables datatype, you can make cases of that data type
        // Your cases need to be the same data type of what you are looking at
        switch(answer){
            case "true":
                System.out.println("It was true");
                break;
            case "false":
                System.out.println("It was false");
                break;
            case "potato":
                System.out.println("It was a spud");
                break;
            default:
                System.out.println("You did something wrong");
                break;

        }
        System.out.println("(For Loops)============================");
        //There are two ways to may an array, the first is int[] arry = new int[the number here is how big it will be] and the array will be empty
        // or you do int[] array = {you put predefined values in here}
        int[] test = new int[100];//this creates an empty array of size 100
        int[] arry = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,1,2,63,54,654,65,465,46,54,654,654};

        //For loops let you iterate through things, and allow you to perform the same actions over and over again to a data set
        // You will usually see i++ at the end. ++ means that it will add one to the current value
        // ( your interator; run the loop "while" this is true; what happens at the completion of each loop)
        int counter = 0;
        for(int i = 0; i < arry.length; i++){
            counter++;
        }
        System.out.println(counter);


        System.out.println("(For Loops - CodingGame)============================");
        //This is solving todays coding game problem with a forloop
        // Nesting control flow is many of times needed! But be careful, nesting too many for-loops can cause problems!
        int[] values = {10,5,4};
        int total = 0;
        for(int i = 0; i < values.length; i++){
            if(values[i]%2 == 0){
                total += values[i];
                //total = total + values[i];
            }
            else{
                total -= values[i];
                //total = total - values[i];
            }
        }
        System.out.println(total);

        System.out.println("(While Loops)============================");
        int x = 0;
        //While loops are prone to infinite looping, I generally avoid them, because for loops are better
        while(x<10){
            System.out.println("For loops are better");
            x++;
        }

        System.out.println("(Do While Loops)============================");
        x = 0;
        do{
            System.out.println("This is a Do While");
            x++;
        }
        while(x<10);




    }


}
