package at.ac.fhcampuswien.fhmdb;

import static org.junit.jupiter.api.Assertions.*;
import at.ac.fhcampuswien.fhmdb.models.Movie;
import at.ac.fhcampuswien.fhmdb.models.SortState;
import at.ac.fhcampuswien.fhmdb.ui.MovieCell;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

class HomeControllerTest {

}

    private static HomeController homeController;


    @Mock

    private JFXComboBox genreComboBox;



    @BeforeAll

    static void init() {
        homeController = new HomeController();
    }


    @Test
    void movies_and_observableMovies_are_equal() {


//GIVEN
   homeController.initializeState();


//WHEN & THEN

        assertEquals(homeController.allMovies, homeController.observableMovies);
@Test

void movies_and observableMovies_are_equal() {





@Test
void testFilterEventually(){
        }

@Test

void movies_are_sorted correctly_with_current_sortState_none_than_ascending() {
        homeController. initializeState();
        homeController. initializeState = SortState.NONE;

//WHEN
        state_none_then ascending()) {

//GIVEN

        homeCastroller.sortstats SortState.BORE:

//THEN

        List<Movie> expected = Array.aslist(

        new Movie(

        Arrays.asList(
        new Movie(
        "CatsVenture",
        "A cute cat on an adventure.",
