import java.util.Scanner;

import static java.lang.Math.pow;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(addition(3,5));
//        System.out.println(subtraction(1000, 900));
//        System.out.println(multiplication(12,11));
//        System.out.println(division(500,25));
//
//        System.out.println(modulus(12,5));

        System.out.println(getInteger(1, 10));

//        System.out.print(calculateFactorials(3));

//        System.out.println("Welcome to the dice roll game");
//        playGame();
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

//    public static int calculateFactorials(int num) {
//        Scanner sc = new Scanner(System.in);
//        boolean keepGoing = true;
//        int userInput = 0;
//
//        do {
//            System.out.print("Give me a number between 1 and 10: ");
//            userInput = sc.nextInt();
//
//            if (userInput > 1 && userInput < 10) {
//                keepGoing = false;
//
//                for (int i = userInput; i <= 1; i--) {
//                    System.out.println(factorial *= 1);
//                }
//                return userInput;
//            }
//        } while (keepGoing);
//
//
//    pubic static int factorial(int num) {
//        if (num <= 1)
//            return 1;
//        return num * factorial(num - 1);
//}

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

    public static int rollDice(int numberOfSides) {
        int random = (int)(Math.random() * numberOfSides + 1);
        return random;
    }







}
