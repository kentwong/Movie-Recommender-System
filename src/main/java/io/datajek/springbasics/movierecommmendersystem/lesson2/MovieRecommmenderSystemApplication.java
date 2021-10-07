package io.datajek.springbasics.movierecommmendersystem.lesson2;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieRecommmenderSystemApplication {

	public static void main(String[] args) {
		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		
		System.out.println(Arrays.toString(result));
	
	
	}

}
