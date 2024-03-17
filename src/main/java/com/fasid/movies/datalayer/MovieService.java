package com.fasid.movies.datalayer;

import com.fasid.movies.beans.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {

        return movieRepository.findAll();
    }

    public Optional<Movie> fetchMovie(String imdbId) {

        return movieRepository.findMovieByImdbId(imdbId);
    }

}
