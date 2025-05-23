public class Main {
    public static void main(String[] args){

        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        hello();

        positiveOrNegative(number);

        bartender(name);



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

     // Ik had hierboven ook gewoon if-else kunnen gebruiken natuurlijk, maar als de gebruiker dan 0 invoert, wordt het dan niet fout?

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
                System.out.println("Pilsje");
                break;
            default:
                System.out.println("Ain't seen ya in my bar before!");
                break;
        }
     }

     public static void sum(int input1, int input2){


     }

}

