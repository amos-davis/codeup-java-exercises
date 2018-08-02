package util;



import java.util.Scanner;

public class Input {

//    private Scanner scanner;
//    public Input() {
//        this.scanner = new Scanner(System.in);
//    }
   private Scanner scanner = new Scanner(System.in);


   public String getString(String prompt) {
       System.out.println("Type: ");

       return this.scanner.nextLine().toLowerCase().trim();
   }

    public static String getString(){
       return "Give me a number: ";
    }

    public boolean yesNo(){
       String result = this.getString("Type yes or no (y/n)\"");
       return (result.equals("y") || result.equals("yes"));
    }

    public static void getInt() {

        System.out.println("Enter your viewing preference here:  ");
//        int userResponse = sc2.nextInt();
//        return userResponse;
    }


}