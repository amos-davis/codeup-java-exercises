import java.util.Scanner;

import static java.lang.Math.pow;

public class MethodsExercises {

    public static void main(String[] args) {

        System.out.println(addition(3,5));
        System.out.println(subtraction(1000, 900));
        System.out.println(multiplication(12,11));
        System.out.println(division(500,25));

        System.out.println(modulus(12,5));

        System.out.println(getInteger(1, 10));


        runFactorial();


        System.out.println("Welcome to the dice roll game");
        playGame();
    }

//   -----Methods Exercise Number 1:

    public static int addition (int numberA, int numberB) {
        return numberA + numberB;
    }

    public static int subtraction (int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static int multiplication (int a, int b) {
        return a * b;
    }

    public static int division (int c, int d) {
        return c / d;
    }

    public static int modulus (int mod1, int mod2) {
        return mod1 % mod2;
    }

//    -------Methods Exercise Number 2:


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        boolean userContinues = true;
        int userInput = 0;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            userInput = sc.nextInt();

            if (userInput > min && userInput < max) {
                userContinues = false;
            }
        } while (userContinues);
        return userInput;
    }

//         --------Methods Exercise Number 3:------------
    public static void runFactorial() {
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;

        do {
            System.out.println(factorialDisplay());
            System.out.println("Do you want to continue?");
            String userAnswer = sc.next();
            if(!userAnswer.equalsIgnoreCase("y")) {
                keepGoing = false;
            }
        } while (keepGoing);
    }

    public static long factorialDisplay() {
            Scanner sc = new Scanner(System.in);
//            boolean keepGoing = true;
//            sc.nextInt();

//        do {
            System.out.print("Give me a number between 1 and 10: ");
            int userEntry = sc.nextInt();
//            sc.nextInt(;
            long calc = calculateFactorial(userEntry);
        return calc;
//            if(userEntry >= 1 && userEntry <= 10) {
//                return calc;
//            } else {
//                keepGoing = false;
//                System.out.println("Not a valid entry.");
//            }

//        } while (keepGoing);
//      return sc.nextInt();
    }


    public static int calculateFactorial(int userInput) {
        int i;
        int factorial = 1;
        for (i = 1; i <= userInput; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

//}
// }
//    --------Methods Exercise Number 4:-------
    public static void playGame() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many sides does your dice have?");
        int numberOfSides = sc.nextInt();

        int dieOne = rollDice(numberOfSides);
        int dieTwo = rollDice(numberOfSides);

        System.out.println("You rolled " + dieOne + " and " + dieTwo + ".");
        System.out.println("Total is: " + (dieOne + dieTwo));

    }
//
    public static int rollDice(int numberOfSides) {
        int random = (int)(Math.random() * numberOfSides + 1);
        return random;
    }


}
