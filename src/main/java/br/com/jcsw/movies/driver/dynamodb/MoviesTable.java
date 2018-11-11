package br.com.jcsw.movies.driver.dynamodb;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "movies")
public class MoviesTable {

  private String imdb;
  private Integer year;
  private String title;
  private String code;

  @DynamoDBHashKey(attributeName = "imdb")
  public String getImdb() {
    return imdb;
  }

  public void setImdb(String imdb) {
    this.imdb = imdb;
  }

  @DynamoDBRangeKey(attributeName = "year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @DynamoDBAttribute(attributeName = "title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @DynamoDBAttribute(attributeName = "code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
