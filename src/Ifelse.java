public class Ifelse {
    public static void main(String[] args) {

        int number = 5;
        evenOrOdd(number);
        number = 8;
        evenOrOdd(number);
        System.out.println("");

        int grade = 4;
        grader(grade);
        grade = 10;
        grader(grade);
        System.out.println("");

        String text = "Early bird gets the worm";
        textLengthChecker(text);
        text = "Whatever";
        textLengthChecker(text);
        System.out.println("");

        int year = 700;
        yearChecker(year);
        year = 2020;
        yearChecker(year);


    }

    // Opdracht 1

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is uneven");
        }
    }
    // Opdracht 2

    public static void grader(int grade){
        if(grade > 1 && grade <= 5){
            System.out.println("That's an F...");
        } else if (grade == 6) {
            System.out.println("You got a D. You can do better!");
        } else if (grade == 7) {
            System.out.println("You got a C. Keep up the good work!");
        } else if (grade == 8) {
            System.out.println("You got a B! Nicely done! ");
        } else if (grade == 9 || grade == 10) {
            System.out.println("You got an A! A for effort!");
        }
    }

    // Opdracht 6

    public static void textLengthChecker(String text){
        int lengthOfText = text.length();
        if(lengthOfText < 10){
            System.out.println("The text is short.");
        } else if (lengthOfText >= 10 && lengthOfText < 20){
            System.out.println("The text is medium-long");
        } else {
            System.out.println("The text is long.");
        }
    }

    // Opdracht 7

    public static void yearChecker(int year){
        if (year % 100 == 0 && year % 400 == 0){
            System.out.println("It's a leap year!");
        } else if (year % 4 == 0 && year % 100 == 0){
            System.out.println("Not a leap year!");
        } else if (year % 4 == 0){
            System.out.println("It's a leap year!");
        }
    }




}
