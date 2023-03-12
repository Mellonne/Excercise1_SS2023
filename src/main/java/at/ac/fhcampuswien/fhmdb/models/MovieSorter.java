package at.ac.fhcampuswien.fhmdb.models;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Recep To Do : Connect it with the Button
public class MovieSorter {
    public static List<Movie>sortMovies(List<Movie> movies, SortState sortOrder) {
        List<Movie> sortedMovies = new ArrayList<>(movies);

        // Sort the movies based on the title in ascending or descending order
        if (sortOrder == SortState.ASCENDING) {
            Collections.sort(sortedMovies, Comparator.comparing(Movie::getTitle, String.CASE_INSENSITIVE_ORDER));
        } else {
            Collections.sort(sortedMovies, Comparator.comparing(Movie::getTitle, String.CASE_INSENSITIVE_ORDER).reversed());
        }

        return sortedMovies;
    }

}
