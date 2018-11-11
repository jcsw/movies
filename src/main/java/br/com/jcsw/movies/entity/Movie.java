package br.com.jcsw.movies.entity;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Movie {

  public String imdb;

  public Integer year;

  public String title;

  public String code;

  public Movie(String imdb, Integer year, String title, String code) {
    this.imdb = imdb;
    this.year = year;
    this.title = title;
    this.code = code;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this) //
        .append("imdb", imdb) //
        .append("year", year) //
        .append("title", title) //
        .append("code", code) //
        .toString();
  }
}
