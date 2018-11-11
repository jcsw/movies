package br.com.jcsw.movies.movie;

import br.com.jcsw.movies.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class MovieServiceImpl implements MovieService {

  @Autowired
  private MovieRepository movieRepository;

  @Override
  public Movie retrieveMovie(String imdb, Integer year) {
    return movieRepository.findByImdbAndYear(imdb, year);
  }

}
