package io.datajek.springbasics.movierecommmendersystem.lesson1;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation();
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
	
	
	}

}
