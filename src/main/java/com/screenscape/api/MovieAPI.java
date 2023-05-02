package com.screenscape.api;

import com.screenscape.dto.MovieDTO;
import com.screenscape.exception.ScreenScapeException;
import com.screenscape.service.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieAPI {
    @Autowired
    MovieServiceImpl movieService;

    @Autowired
    private Environment environment;

    @GetMapping("/movie")
    public ResponseEntity<List<MovieDTO>> getAllMovies() throws ScreenScapeException{
        List<MovieDTO> list = movieService.getAllMovies();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/movie")
    public ResponseEntity<String> addMovie(@RequestBody MovieDTO movieDTO) throws ScreenScapeException{
        Integer movieId = movieService.addMovie(movieDTO);
        String successMessage = environment.getProperty("API.Movie_Added_SUCCESS")+movieId;
        return new ResponseEntity<>(successMessage,HttpStatus.CREATED);
    }
}
