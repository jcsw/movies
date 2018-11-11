package br.com.jcsw.movies.driver.dynamodb;

import br.com.jcsw.movies.driver.errors.InfrastructureException;
import br.com.jcsw.movies.entity.Movie;
import br.com.jcsw.movies.movie.MovieRepository;
import com.amazonaws.AmazonClientException;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieRepositoryDynamoDB implements MovieRepository {

  @Autowired
  private DynamoDBMapper dynamoDBMapper;

  @Override
  public Movie findByImdbAndYear(String imdb, Integer year) {

    try {

      MoviesTable moviesTable = dynamoDBMapper.load(MoviesTable.class, imdb, year);

      if(moviesTable != null) {
        return new Movie(
            moviesTable.getImdb(),
            moviesTable.getYear(),
            moviesTable.getTitle(),
            moviesTable.getCode()
        );
      }

    } catch (AmazonClientException ace) {
      throw new InfrastructureException(ace);
    }

    return null;
  }

}
