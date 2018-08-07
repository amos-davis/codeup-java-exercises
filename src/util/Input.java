package util;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
   private static Scanner sc = new Scanner(System.in);
   private static Scanner sc2 = new Scanner(System.in);



//    public void setScanner(Scanner scanner) {
//        this.sc = scanner.n;
//    }


    public String getString() {
       System.out.println("Provide a string, please.");
        String str = sc.next();
        return str.toLowerCase().trim();
   }

    public static String getString(String prompt) {
        System.out.println(prompt);
        String str = sc.next();
        return str.toLowerCase().trim();
    }

    public boolean yesNo(){
       String result = getString("Type yes or no (y/n)\"");
       return (result.equals("y") || result.equals("yes"));
    }

    public static int getInt() {
        System.out.println("Enter your viewing preference here:  ");
            try {
                System.out.println("Message before...");
                int userResponse = sc2.nextInt();
                Integer.valueOf(userResponse);
                System.out.println("message after..");
                return userResponse;
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong. That is not a valid input.");
            }
        return 0;
    }

    public static int getInt(int min, int max) {
            boolean continueInput = true;
            System.out.println("Enter a integer between " + min + " and " + max);
            int UserInput = sc.nextInt();

                do {
                    if (UserInput < min || UserInput > max) {
                        getInt(min, max);
                    }
                } while (continueInput);
                return UserInput;
    }


    public static double getDouble() {
        System.out.println("Enter your viewing preference here: (Decimals are accepted. ");
        try {
            System.out.println("Pre - Message...");
            double userResponse = sc2.nextDouble();
            Double.valueOf(userResponse);
            System.out.println("Post - message..");
            return userResponse;
        } catch (InputMismatchException e) {
            System.out.println("That's not right. Try a valid entry. ");
        }
        return 0.0;
    }

    public static double getDouble(double min, double max) {
        boolean tryAgain = true;
        System.out.println("Enter a decimal number between " + min + " and " + max);
        double UserNumber = sc.nextDouble();

        do {
            if (UserNumber < min || UserNumber > max) {
                getDouble(min, max);
            }
        } while (tryAgain);
        return UserNumber;
    }




}