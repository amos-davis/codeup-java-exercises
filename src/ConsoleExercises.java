
import java.util.Scanner;



public class ConsoleExercises {
    public static void main (String[] args) {
        int userInput;
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter an integer here: ");
//        userInput = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println("You entered: -- > \"" + userInput + "\" <--");
////        ---An error w/ a description appears if input is not an integer----
//        sc.nextLine();
//
//        System.out.print("Enter 3 words here: ");
//        String userWord1;
//        String userWord2;
//        String userWord3;
//
//        userWord1 = sc.next();
//        userWord2 = sc.next();
//        userWord3 = sc.next();
//
//        System.out.println("The words you chose are: " + userWord1 + ",");
//        System.out.println(userWord2 + ", and");
//        System.out.println(userWord3);
//
//        System.out.printf("Your words: %s %s %s", userWord1, userWord2, userWord3);

//        System.out.print("Enter a statement here:");
////                          ----****This only prints out the first word in the sentence string (1st token)****---
////        String userSentence = sc.next();
////                               -----This prints out the whole sentence as a string ------
//        String userSentence = sc.nextLine();
//
//        System.out.println(userSentence);

        System.out.println("Give me the length:");
        String length = sc.nextLine();
        System.out.println("Give me the width:");
        String width = sc.nextLine();

        double area = Double.parseDouble(length) * Double.parseDouble(width);
            System.out.println(area + " = "+length+" x "+width);

            double perimeter = ( 2 * Double.parseDouble(length)) + ( 2 * Double.parseDouble(width));

            System.out.println(perimeter + " = 2x"+length+" + 2x"+width);
    }
}
