import java.util.Scanner;


public class Bob {
    public static void main(String[] args) {
        System.out.println("Say something to Bob:  ");
        Scanner input = new Scanner(System.in);


        String converseWithBob = input.nextLine();

        if (converseWithBob.endsWith("?")) {
            System.out.println("Sure.");
        } else if (converseWithBob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (converseWithBob.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}

