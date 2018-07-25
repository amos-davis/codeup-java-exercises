public class ControlFlowExercises {
    public static void main(String[] args) {
        byte doubling2s = 0;
        do {
            System.out.println(doubling2s + 2);
            doubling2s += 2;
        } while( doubling2s <= 98);

//        ------This is a "for" loop for the above----
//        for (byte doubling2s = 0; doubling2s <= 98;doubling2s +=2) {
//            System.out.println(doubling2s + 2);
//        }
//
//
//
//
        byte decrementingByFive = 105;
        do {
            System.out.println(decrementingByFive - 5);
            decrementingByFive -= 5;
        } while( decrementingByFive >= -5);
//
////                ------This is a "for" loop for the above----
//        for (byte decrementingByFive = 105; decrementingByFive >= -5;decrementingByFive -= 5) {
//            System.out.println(decrementingByFive - 5);
//        }
//
//
//
//
////        -----Note: for some reason, it does not like "int". Had to do "long" or "double".------
        long squaredNum = 2;
        do {
            System.out.println(squaredNum);
            squaredNum *= squaredNum;
        } while( squaredNum < 1000000);
//
////        ------This is a "for" loop for the above----
//        for (long squaredNum = 2; squaredNum < 1000000;squaredNum *= i) {
//            System.out.println(squaredNum);
//        }
    }
}