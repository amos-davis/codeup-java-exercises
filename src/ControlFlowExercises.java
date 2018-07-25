public class ControlFlowExercises {
    public static void main(String[] args) {

        String Fizz = "Fizz";
        String Buzz = "Buzz";

        for (int number = 1; number <= 100; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(Fizz + Buzz);

                    continue;

            } else if (number % 5 == 0) {
                    System.out.println(Buzz);
                    continue;

            } else if (number % 3 == 0) {
                System.out.println(Fizz);
                 continue;
             }
                System.out.println(number);
            }

    }
}