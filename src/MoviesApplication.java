import movies.Movie;
import movies.MoviesArray;
import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input();
        boolean keepSearching = true;

        System.out.println("How would you like to view your selected movies? \n\n");
        System.out.println("0 - exit\n");
        System.out.println("1 - view all movies\n");
        System.out.println("2 - view movies in the \"Animated\" category\n");
        System.out.println("3 - view movies in the \"Drama\" category\n");
        System.out.println("4 - view movies in the \"Horror\" category\n");
        System.out.println("5 - view movies in the \"Sci-fi\" category\n");
        System.out.println("6 - view movies in the \"Musical\" category\n\n");

//        System.out.println(Arrays.toString( MoviesArray.findAll()));
//        System.out.println(input.getInt());

        while (keepSearching) {
            int userResponse;
            Scanner sc2 = new Scanner(System.in);
            input.getInt();
            userResponse = sc2.nextInt();


//        for(int i = 0; i <= movieList.getName().length(); i++) {
//        }

            for (Movie movieList : MoviesArray.findAll()) {
                if (userResponse == 0) {
                    keepSearching = false;
                } else if (userResponse == 1) {
                    System.out.println(movieList.getName() + " -- " + movieList.getCategory());
                } else if (userResponse == 2 && movieList.getCategory().equalsIgnoreCase("animated")) {
                    System.out.println(movieList.getName());
                } else if (userResponse == 3 && movieList.getCategory().equalsIgnoreCase("drama")) {
                    System.out.println(movieList.getName());
                } else if (userResponse == 4 && movieList.getCategory().equalsIgnoreCase("horror")) {
                    System.out.println(movieList.getName());
                } else if (userResponse == 5 && movieList.getCategory().equalsIgnoreCase("scifi")) {
                    System.out.println(movieList.getName());
                } else if (userResponse == 6 && movieList.getCategory().equalsIgnoreCase("musical")) {
                    System.out.println(movieList.getName());
                }
            }
        }
    }
}
