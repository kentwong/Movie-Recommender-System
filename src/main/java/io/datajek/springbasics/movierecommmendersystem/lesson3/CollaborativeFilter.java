package io.datajek.springbasics.movierecommmendersystem.lesson3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter {
	
	@Override
	public String[] getRecommendations(String movie) {
		// TODO Auto-generated method stub
		return new String[] {};
	}
}
