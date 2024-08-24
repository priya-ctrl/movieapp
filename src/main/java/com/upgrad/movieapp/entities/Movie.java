package com.upgrad.movieapp.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movieId;
    @Column (name ="movie_name",length = 50, nullable = false, unique = true)
    private String movieName;
    @Column (name = "movie_desc", length = 50, nullable = false, unique = true)
    private String movieDescription;
    @Column(name ="movie_release_date",nullable = false)
    private LocalDateTime releaseDate;
    @Column(name ="movie_duration", nullable = false)
    private int movieDuration;
    @Column(name ="movie_cover", length = 500,nullable = false)
    private String moviecoverPhotoUrl;
    @Column(name ="movie_trailerurl", length = 500, nullable = false)
    private String movieTrailerurl;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public String getMoviecoverPhotoUrl() {
        return moviecoverPhotoUrl;
    }

    public void setMoviecoverPhotoUrl(String moviecoverPhotoUrl) {
        this.moviecoverPhotoUrl = moviecoverPhotoUrl;
    }

    public String getMovieTrailerurl() {
        return movieTrailerurl;
    }

    public void setMovieTrailerurl(String movieTrailerurl) {
        this.movieTrailerurl = movieTrailerurl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieDescription='" + movieDescription + '\'' +
                ", releaseDate=" + releaseDate +
                ", movieDuration=" + movieDuration +
                ", moviecoverPhotoUrl='" + moviecoverPhotoUrl + '\'' +
                ", movieTrailerurl='" + movieTrailerurl + '\'' +
                '}';
    }
}


