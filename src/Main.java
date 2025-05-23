public class Main {
    public static void main(String[] args){

        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();
        System.out.println("");

        positiveOrNegative(number);
        number = -13;
        positiveOrNegative(number);
        System.out.println("");

        postiveOrZeroOrNegativ(number);
        number = 0;
        postiveOrZeroOrNegativ(number);
        System.out.println("");

        bartender(name);
        name = "Renske";
        bartender(name);
        name = "Willem";
        bartender(name);
        System.out.println("");

        sum(input1, input2);
        int input3 = 32;
        int input4 = 3;
        sum(input3, input4);

    }

    public static void hello(){
        System.out.println("Hello, world!");
    }

     public static void positiveOrNegative(int number){
        if (number > 0){
            System.out.println("This number is positive!");
        } else if (number < 0){
            System.out.println("This number is negative!");
        }
     }

    /* Ik had hierboven ook gewoon if-else kunnen gebruiken natuurlijk, maar als de gebruiker dan 0 invoert, wordt het dan niet fout? */

     public static void postiveOrZeroOrNegativ(int number){
         if (number > 0){
             System.out.println("This number is positive!");
         } else if (number < 0){
             System.out.println("This number is negative!");
         } else {
             System.out.println("This number is 0");
         }
     }

     public static void bartender(String name){
        switch (name){
            case "Robert":
                System.out.println("Scotch");
                break;
            case "Renske":
                System.out.println("Jenever");
                break;
            case "Henk":
                System.out.println("Pilske");
                break;
            default:
                System.out.println("Ain't seen ya in my bar before!");
                break;
        }
     }

     public static void sum(int input1, int input2){
         System.out.println("The sum of the given numbers is " + (input1 + input2));
     }

}

