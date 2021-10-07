package io.datajek.springbasics.movierecommmendersystem.lesson3;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
	
	public static void main(String[] args) {
//		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);   
		
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
	
	
	}

}
