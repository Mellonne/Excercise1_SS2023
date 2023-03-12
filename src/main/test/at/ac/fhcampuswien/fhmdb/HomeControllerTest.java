package at.ac.fhcampuswien.fhmdb;

import at.ac.fhcampuswien.fhmdb.models.Genre;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import static org.junit.jupiter.api.Assertions.*;

class HomeControllerTest {
    private static HomeController homeController;
    @BeforeAll
    static void inti() { homeController = new HomeController(); }

    @Test
    void movies_and_observableMovies_are_equal(){
        //GIVEN
        homeController.initialize(URL url, ResourceBundle resourceBundle);

        //WHEN & THEN
        assertEquals(homeController.allMovies, homeController.observableMovies);
    }

    @Test
    void movies_are_sorted_correctly_with_current_sortState_none_then_ascending(){
        //GIVEN
        homeController.initialize();
        homeController.sortState = SortState.NONE;

        //WHEN
        homeController.sortMovies();

        //THEN
        List<Movie> expected = Arrays.asList(
                new Movie(
                        "Avatar",
                        "A paraplegic Marine dispatched to the moon Pandora on a unique mission becomes torn between following his orders and protecting the world he feels is his home.",
                        Arrays.asList(Genre.DRAMA, Genre.ROMANCE)
                ),
                new Movie(
                        "Life Is Beautiful",
                        "When an open-minded Jewish librarian and his son become victims of the Holocaust, he uses a perfect mixture of will, humor, and imagination to protect his son",
                        Arrays.asList(Genre.CRIME, Genre.DRAMA, Genre.MYSTERY)
                ),
                new Movie(
                        "Puss in Boots",
                        "An outlaw cat, his childhood egg-friend, and a seductive thief kitty set out in search for the eggs of the fabled Golden Goose to clear his name, restore his lost honor, and regain the trust of his mother and town.",
                        Arrays.asList(Genre.COMEDY, Genre.FAMILY, Genre.ANIMATION)
                ),
                new Movie(
                        "The Usual Suspects",
                        "A sole survivor tells of the twisty events leading up to a horrific gun battle on a boat, which begin when five criminals meet at a seemingly random police lineup.",
                        Arrays.asList(Genre.ANIMATION, Genre.DRAMA, Genre.ACTION)
                )
                new Movie(
                        "The Wolf of Wall Street",
                        "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.",
                        Arrays.asList(Genre.DRAMA, Genre.ROMANCE, Genre.BIOGRAPHY)
                )
        );

        assertEquals(expected, homeController.observableMovies);
    }
}
