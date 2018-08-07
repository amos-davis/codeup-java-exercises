package util;



import java.util.Scanner;

public class Input {

//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
   private static Scanner sc = new Scanner(System.in);



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
        return 0;
//        int userResponse = sc2.nextInt();
//        return userResponse;
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
    double getDouble() {
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