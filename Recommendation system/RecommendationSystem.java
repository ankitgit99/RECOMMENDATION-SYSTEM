import java.io.*;
import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> movies = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("movies.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String genre = data[0];
                String movie = data[1];

                movies.putIfAbsent(genre, new ArrayList<>());
                movies.get(genre).add(movie);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error reading file!");
            sc.close();
            return;
        }

        System.out.println("===== Movie Recommendation System =====");
        System.out.println("Choose a Genre:");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Sci-Fi");

        int choice = sc.nextInt();

        String selectedGenre = "";

        switch (choice) {
            case 1:
                selectedGenre = "Action";
                break;
            case 2:
                selectedGenre = "Comedy";
                break;
            case 3:
                selectedGenre = "Sci-Fi";
                break;
            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        System.out.println("\nRecommended Movies:");

        for (String movie : movies.get(selectedGenre)) {
            System.out.println("- " + movie);
        }

      sc.close();
    }
}