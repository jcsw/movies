package br.com.jcsw.movies.controller;

import br.com.jcsw.movies.entity.Movie;
import br.com.jcsw.movies.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieRestController {

  @Autowired
  private MovieService movieService;

  @GetMapping(path = "/movie/{imdb}/{year}")
  ResponseEntity<Movie> getMovie(@PathVariable String imdb, @PathVariable Integer year) {
    Movie movie = movieService.retrieveMovie(imdb, year);

    if(movie == null) {
      return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(movie);
  }
}
