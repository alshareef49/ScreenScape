package com.screenscape.service;


import com.screenscape.dto.MovieDTO;
import com.screenscape.exception.ScreenScapeException;

import java.util.List;

public interface MovieService {
    List<MovieDTO> getAllMovies() throws ScreenScapeException;
    Integer addMovie(MovieDTO movieDTO) throws ScreenScapeException;
}
