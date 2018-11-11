package br.com.jcsw.movies.movie;

import br.com.jcsw.movies.entity.Movie;

public interface MovieRepository {

  Movie findByImdbAndYear(String imdb, Integer year);
}
