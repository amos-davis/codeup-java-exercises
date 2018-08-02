package Java_Playground;

import java.util.Scanner;

public class CountVowels {



    public static void main(String[] args) {
//        countAs();
//        countEs();
        countIs();
//        countAs();
    }

    public static int countAs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a word: ");
        String userInput = sc.next();

        int count = 0;

        for(int i = 0; i < userInput.length() - 1; i++) {
//            if(userInput.toLowerCase().charAt(i) == 'a') {
//                count = count + 1;
//            }
            Character currentLetter = userInput.charAt(i);

            if(currentLetter.toString().equalsIgnoreCase("a") ) {
//                count = count + 1;

            }
        }
        System.out.println("count:"+ count);
        return count;
    }

    public static int countEs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a word: ");
        String userInput = sc.next();

        int count = 0;

        for(int i = 0; i < userInput.length() - 1; i++) {
            if(userInput.toLowerCase().charAt(i) == 'e') {
                count = count + 1;
            }
        }
        System.out.println("count:"+ count);
        return count;
    }

    public static int countIs() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide a word: ");
        String userInput = sc.next();

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int a = 0; a < userInput.length() - 1; a++) {
            if (userInput.toLowerCase().charAt(a) == 'a') {
                countA = countA + 1;
            }
        }

        for (int e = 0; e < userInput.length() - 1; e++) {
            if (userInput.toLowerCase().charAt(e) == 'a') {
                countE = countE + 1;
            }
        }

        for (int i = 0; i < userInput.length() - 1; i++) {
            if (userInput.toLowerCase().charAt(i) == 'i') {
                countI = countI + 1;
            }
        }

        for (int o = 0; o < userInput.length() - 1; o++) {
            if (userInput.toLowerCase().charAt(o) == 'a') {
                countO = countO + 1;
            }
        }

        for (int u = 0; u < userInput.length() - 1; u++) {
            if (userInput.toLowerCase().charAt(u) == 'a') {
                countU = countU + 1;
            }
        }
                System.out.println("countA is " + countA);
                System.out.println("countE is " + countE);
                System.out.println("countI is " + countI);
                System.out.println("countO is " + countO);
                System.out.println("countU is " + countU);
                return countA + countE + countI + countO + countU;


    }



}
