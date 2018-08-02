import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int maxRows = 15; ***(Adjust this number to enter static # of rows)***

        Scanner sc = new Scanner(System.in);
//        boolean userContinues = true;
//
//        do {
//
//            System.out.println("What number would you like to go up to (from 0 - 15)?");
//            int userNumber = sc.nextInt();
//            sc.nextLine();
//
//
//            System.out.println("Here is your table!\n");
//
////
//            System.out.println("Number | Squared  | Cubed \n");
//            System.out.println("------ | -------  | ----- \n");
//
//
////            for (long wholeNumber = 1; wholeNumber <= userNumber; wholeNumber++) {
////                System.out.println(wholeNumber + "          | " + Math.pow(wholeNumber, 2) + "          | " + Math.pow(wholeNumber, 3));
////            }
////
////                ----The Below "for" loop is the same table, but Refactored----
//                for (int wholeNumber = 1; wholeNumber <= userNumber; wholeNumber++) {
//                    System.out.printf("%-7d", wholeNumber);
//                        System.out.print("|");
//                    System.out.printf("%-10d", wholeNumber * wholeNumber);
//                        System.out.print("|");
//                     System.out.printf("%-9d\n", wholeNumber * wholeNumber * wholeNumber);
//                 }
//
//            System.out.println("Do you want to keep going?");
//            String userAnswer = sc.next();
//
//            if (!userAnswer.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        }   while (userContinues);

//        ----------------------------------------------------------------------------------------------------------
//                *** Problem below is using setup from main and its 2 closing curly braces ***
        boolean userEngages = true;

        do {
            System.out.println("What is your grade?");
            int userNumericGrade = sc.nextInt();
            sc.nextLine();

            if (userNumericGrade >= 88) {
                System.out.println("Congrats! You made and 'A'");
            } else if (userNumericGrade >= 80) {
                System.out.println("You made a 'B'");
            } else if (userNumericGrade >= 67) {
                System.out.println("You made a 'C'");
            } else if (userNumericGrade >= 60) {
                System.out.println("Keep Practicing");
            } else if (userNumericGrade >= 0) {
                System.out.println("Try getting some extra help. You can do this.");
            }

            System.out.println("Do you want to enter another grade?");
            String userAnswer = sc.next();
//
            if (!userAnswer.equalsIgnoreCase("y")) {
                userEngages = false;
            }

        } while (userEngages);
    }
}


