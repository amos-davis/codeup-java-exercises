package Java_Playground;

public class AbstractDemo {
    public static void main(String[] args) {

//        -----An "abstract class" cannot be instantiated or extended----
//        Salary personToPay = new Salary("Tim", "123 Money Street", 34, 87000.34);
//
//        System.out.println("Call mail reference using Salary method.");
//        personToPay.mailCheck();
//
//        Employee personToPay2 = new Salary("Janet", "456 Kid Street", 78, 56000.98);
//
//
//        System.out.println("Call mail reference using Salary method.\n");
//        System.out.println("Calling mail check using Employee reference.");
//        personToPay2.mailCheck();


        int[][] primes = new int[16][16];
        primes[2][2] = 1;

        for(int row = 0; row < primes.length; row++){
            for(int col = 0; col < primes[row].length; col++){
                System.out.print(primes[row][col] + " ");
            }
            System.out.println();
        }




    }
}
