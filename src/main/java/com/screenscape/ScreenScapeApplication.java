package com.screenscape;

import com.screenscape.dto.MovieDTO;
import com.screenscape.service.MovieServiceImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenScapeApplication implements CommandLineRunner {
	private final static Log LOGGER = LogFactory.getLog(ScreenScapeApplication.class);

	@Autowired
	MovieServiceImpl movieService;
	public static void main(String[] args) {
		SpringApplication.run(ScreenScapeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		getAllMovies();
		addMovie();
	}
	void getAllMovies(){
		try{
			List<MovieDTO> list = movieService.getAllMovies();
			LOGGER.info(list);
		}catch (Exception e){

		}
	}

	void addMovie(){
		try{
			MovieDTO movie = new MovieDTO();
			movie.setMovieName("Suzume");
			movie.setCategory("sci-fi/animation");
			movie.setLanguage("English");
			movie.setLive(true);
			Integer movieId=movieService.addMovie(movie);
			LOGGER.info("Movie is successfully added wit Id: "+movieId);
		}catch (Exception e){
			LOGGER.info(e.getMessage(),e);
		}
	}
}
