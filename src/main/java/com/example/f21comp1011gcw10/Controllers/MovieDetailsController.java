package com.example.f21comp1011gcw10.Controllers;

import com.example.f21comp1011gcw10.APIUtility;
import com.example.f21comp1011gcw10.MovieDetails;
import com.example.f21comp1011gcw10.Ratings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MovieDetailsController implements Initializable {

    @FXML
    private Label movieTitleLabel;

    @FXML
    private Label releaseDateLabel;

    @FXML
    private Label runTimeLabel;

    @FXML
    private Label genreLabel;

    @FXML
    private Label writerLabel;

    @FXML
    private Label languageLabel;

    @FXML
    private ListView<String> actorsListView;

    @FXML
    private ListView<Ratings> ratingsListView;

    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            loadMovieDetails("tt0075148");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Given the movieID, this method will call the API/JSON and create a
     * MovieDetails object. That will be used to populate the GUI with the movie
     * details
     * @param movieID - this is the ImdbID
     */
    public void loadMovieDetails(String movieID) throws IOException, InterruptedException {
        MovieDetails movie = APIUtility.getMovieDetails(movieID);
        movieTitleLabel.setText(movie.getTitle());
        releaseDateLabel.setText(movie.getReleaseDate());
        runTimeLabel.setText(movie.getRuntime());
        genreLabel.setText(movie.getGenre());
        writerLabel.setText(movie.getWriter());
        languageLabel.setText(movie.getLanguage());
        actorsListView.getItems().addAll(movie.getActorsArray());
        ratingsListView.getItems().addAll(movie.getRatings());
        try{
            imageView.setImage(new Image(movie.getPoster()));
        }catch(Exception e)
        {
            imageView.setImage(new Image("defaultPoster.png"));
        }
    }
}

