import java.util.Random;

public class ServerNameGenerator {

//    String[] adjectives = new String[10];
    public static String[] adjectives = {"large", "soft", "loud", "little", "blue", "curly", "short", "straight", "long", "uncomfortable"};
//    adjectives[0] = "big";

//    String[] nouns = new String[10];
    public static String[] nouns = {"chair", "house", "bike", "building", "notebook", "cookie", "plate", "cup", "shirt", "sofa"};

    public static String generateRandomAdjNoun() {
        Random rand = new Random();
//        System.out.println(adjectives[rand.nextInt(adjectives.length - 1)] + "-" + nouns[rand.nextInt(nouns.length - 1)]);
        return adjectives[rand.nextInt(adjectives.length)] + "-" + nouns[rand.nextInt(nouns.length)];
    }

    public static void main(String[] args) {
        System.out.println(generateRandomAdjNoun());;
    }
}
