package ru.netology;

public class MovieManager {
    private String[] movies = new String[0];
    final int lastQuantity;

    public MovieManager(int lastQuantity) {
        this.lastQuantity = lastQuantity;
    }

    public MovieManager() {
        this.lastQuantity = 5;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAllMovies() {
        return movies;
    }

    public String[] findLastMovies() {
        int resultLength = lastQuantity;
        if (resultLength > movies.length) {
            resultLength = movies.length;
        }
        String[] lastMovies = new String[resultLength];
        for (int i=0; i < resultLength; i++){
            lastMovies[i] = movies[movies.length - i - 1];
        }
        return lastMovies;
    }
}
