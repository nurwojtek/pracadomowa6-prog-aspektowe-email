package pl.com.nur.pracadomowa6progaspektoweemail.service;

import org.springframework.stereotype.Service;
import pl.com.nur.pracadomowa6progaspektoweemail.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesList {

    private List<Movie> movieList;

    public MoviesList() {
        movieList = new ArrayList();
        movieList.add(new Movie("Gwiezdne wrota", 1994));
        movieList.add(new Movie("Pokot", 2017));
        movieList.add(new Movie("Terminator", 1984));
        movieList.add(new Movie("Czas apokalipsy", 1979));
    }

    public List<Movie> getMovieList(){
        return  movieList;
    }

    public void addMovie(Movie movie) {
        movieList.add(movie);
    }
}
