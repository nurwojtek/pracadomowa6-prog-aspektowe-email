package pl.com.nur.pracadomowa6progaspektoweemail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.com.nur.pracadomowa6progaspektoweemail.model.Movie;
import pl.com.nur.pracadomowa6progaspektoweemail.service.MailAnnotation;
import pl.com.nur.pracadomowa6progaspektoweemail.service.MoviesList;

@Controller
@RequestMapping("/movies")
public class MovieController {

    private MoviesList moviesList;

    public MovieController(MoviesList moviesList) {
        this.moviesList = moviesList;
    }

    @GetMapping
    public  String getMoviesList(Model model) {
        model.addAttribute("movieList", moviesList.getMovieList());
        model.addAttribute("newMovie", new Movie());
        return "movie";
    }

    @MailAnnotation
    @PostMapping
    public String addMovie(@ModelAttribute Movie movie){
        moviesList.addMovie(movie);
        return "redirect:/movies";
    }

}
