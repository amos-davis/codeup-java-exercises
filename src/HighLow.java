import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
        System.out.println("Let\'s play a guessing game.");
        guessNumberGame();

    }

    public static int guessNumberGame() {
        Scanner sc = new Scanner(System.in);
        boolean keepGuessing = true;
        int numToGuess = randomNumber(100);
        int usersGuess = 0;

        System.out.print("I have picked a number between 1 and 100. Can you guess what it is? ");

        do {
            usersGuess = sc.nextInt();

            if (usersGuess == numToGuess) {
                System.out.println("Good Job! You got it!");
                keepGuessing = false;
            } else if (usersGuess < numToGuess) {
                System.out.println("Try HIGHER");
            } else {
                System.out.println("Not quite, go LOWER");
            }
        } while (keepGuessing);
                return usersGuess;
    }

        public static int randomNumber(int num) {
            int computerNumber = (int)(Math.random() * 100 + 1);
            return computerNumber;
        }
}