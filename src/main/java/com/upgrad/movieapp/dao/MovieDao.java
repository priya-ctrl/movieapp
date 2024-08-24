package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Movie;
import org.hibernate.type.descriptor.java.IntegerJavaType;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The Data Access Object Layer - which will be used to connect with the database
 */
public interface MovieDao extends JpaRepository<Movie, Integer> {

}
