package com.upgrad.movieapp.controller;

import com.upgrad.movieapp.dto.MovieDTO;
import com.upgrad.movieapp.entities.Movie;
import com.upgrad.movieapp.services.MovieService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value ="/movie_app/v1")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @Autowired
    ModelMapper modelMapper;

    /**
     * Method to create movies
     * 127.0.0.1:8080/movie_app/v1/movies
     */

    @PostMapping(value = "/movies", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createMovie(MovieDTO movieDTO) {

        // convert movieDTO to MovieEntity

        Movie newMovie = modelMapper.map(movieDTO, Movie.class);
        Movie savedMovie = movieService.acceptMovieDetails(newMovie);

        MovieDTO savedMovieDTO = modelMapper.map(savedMovie, MovieDTO.class);

        return new ResponseEntity(savedMovieDTO, HttpStatus.CREATED);
    }

@GetMapping(value = "/movies", consumes = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity getAllMovies(){
    List<Movie> movieList = movieService.getAllMovies();
    List<MovieDTO> movieDTOList = new ArrayList<>();

    for (Movie movie : movieList){
        movieDTOList.add(modelMapper.map(movie, MovieDTO.class));
    }
    return new ResponseEntity(movieDTOList, HttpStatus.OK);
}

@GetMapping(value)
public ResponseEntity getMovieBasedonId(int id){}
}

