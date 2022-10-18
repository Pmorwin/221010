import java.util.Scanner;

public class Menu {
    public void displayMenu(){
        boolean on = true;

        // You SHOULD NOT USE THIS FOR P1, JUST USE JAVALIN
        Scanner scan = new Scanner(System.in);
        int count = 0;


        while(on){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~  Welcome to the Employee Reinbursement Entry System  ~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println();
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("~~~~~~  Please select your reinbursement type below  ~~~~~~~");
            System.out.println("~~~~~~  Input the number for your desired selection!  ~~~~~~");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1: LODGING");
            System.out.println("2: TRAVEL");
            System.out.println("3: FOOD");
            System.out.println("4: Miscellaneous");
            System.out.println("5: Exit the Program");
            System.out.println();

            String input = scan.nextLine();

            switch(input){
                case "1":
                    System.out.println("You picked Lodging!");
                    break;
                case "2":
                    System.out.println("You picked Travel!");
                    break;
                case "3":
                    System.out.println("You picked Food!");
                    break;
                case "4":
                    System.out.println("You picked Misc!");
                    break;
                case "5":
                    System.out.println("Exit!");
                    on = false;
                    break;
                default:
                    System.out.println("That was a bad input, try again!");
                    count ++;
                    if(count > 3){
                        System.out.println("You need to touch some grass!");
                        on = false;
                    }
                    break;

            }
        }
    }


}
