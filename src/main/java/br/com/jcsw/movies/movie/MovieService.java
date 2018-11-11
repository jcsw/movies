package br.com.jcsw.movies.movie;

import br.com.jcsw.movies.entity.Movie;

public interface MovieService {

  Movie retrieveMovie(String imdb, Integer year);
}
