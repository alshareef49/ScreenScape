package com.screenscape.service;

import com.screenscape.dto.MovieDTO;
import com.screenscape.entity.Movie;
import com.screenscape.exception.ScreenScapeException;
import com.screenscape.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<MovieDTO> getAllMovies() throws ScreenScapeException {
        Iterable<Movie> list = movieRepository.findAll();
        List<MovieDTO> movieDTOS = new ArrayList<>();
        list.forEach(m->{
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setMovieId(m.getMovieId());
            movieDTO.setMovieName(m.getMovieName());
            movieDTO.setCategory(m.getCategory());
            movieDTO.setLanguage(m.getLanguage());
            movieDTO.setLive(m.isLive());
            movieDTOS.add(movieDTO);
        });
        if(movieDTOS.isEmpty()){
            throw new ScreenScapeException("Service.MOVIE_NOT_FOUND");
        }
        return movieDTOS;
    }

    @Override
    public Integer addMovie(MovieDTO movieDTO) throws ScreenScapeException {
        Movie movie = new Movie();
        movie.setMovieName(movieDTO.getMovieName());
        movie.setCategory(movieDTO.getCategory());
        movie.setLanguage(movieDTO.getLanguage());
        movie.setLive(movieDTO.isLive());
        movieRepository.save(movie);
        return movie.getMovieId();
    }
}
