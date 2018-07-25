public class Bob {
    public static void main(String[] args) {
        String converseWithBob = "what about this,";

        if (converseWithBob.endsWith("?")) {
            System.out.println("Sure.");
        } else if (converseWithBob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (converseWithBob.equals(" ")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
    }
}
