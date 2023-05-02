package com.screenscape.repository;


import com.screenscape.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,Integer> {
}
