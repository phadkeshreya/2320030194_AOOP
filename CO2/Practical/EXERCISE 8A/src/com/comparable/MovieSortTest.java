package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSortTest {
	public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Shawshank Redemption", 9.3, 1994));
        movies.add(new Movie("The Godfather", 9.2, 1972));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Pulp Fiction", 8.9, 1994));
        movies.add(new Movie("Schindler's List", 8.9, 1993));

        System.out.println("Movies before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies);

        System.out.println("\nMovies after sorting by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
