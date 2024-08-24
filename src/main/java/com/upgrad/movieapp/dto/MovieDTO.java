package com.upgrad.movieapp.dto;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class MovieDTO {
    private int movieId;
    private String movieName;
    private String movieDescription;
    private LocalDateTime releaseDate;
    private int movieDuration;
    private String moviecoverPhotoUrl;
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
}
