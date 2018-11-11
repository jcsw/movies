package br.com.jcsw.movies.driver.dynamodb;

import com.amazonaws.auth.EnvironmentVariableCredentialsProvider;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfiguration {

  @Bean
  AmazonDynamoDB client() {
    return AmazonDynamoDBClientBuilder.standard()
        .withCredentials(new EnvironmentVariableCredentialsProvider())
        .withEndpointConfiguration(new EndpointConfiguration("dynamodb.us-east-1.amazonaws.com", Regions.US_EAST_1.getName()))
        .build();
  }

  @Bean
  DynamoDBMapper dynamoDBMapper() {
    return new DynamoDBMapper(client());
  }

}
