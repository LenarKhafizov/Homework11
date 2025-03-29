package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void addMovieTest(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 4");
        String[] expected = { "Фильм 1","Фильм 2", "Фильм 3", "Фильм 4" };
        String[] actual = manager.findAllMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesLimitTest(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 5");
        String[] expected = { "Фильм 5", "Фильм 4","Фильм 3", "Фильм 2", "Фильм 1" };
        String[] actual = manager.findLastMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesAboveTest(){
        MovieManager manager = new MovieManager(6);
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 5");
        String[] expected = { "Фильм 5", "Фильм 4","Фильм 3", "Фильм 2", "Фильм 1" };
        String[] actual = manager.findLastMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesLessTest(){
        MovieManager manager = new MovieManager(6);
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 5");
        String[] expected = { "Фильм 5", "Фильм 4","Фильм 3", "Фильм 2", "Фильм 1" };
        String[] actual = manager.findLastMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesZeroTest(){
        MovieManager manager = new MovieManager(0);
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 5");
        String[] expected = { };
        String[] actual = manager.findLastMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMoviesOneTest(){
        MovieManager manager = new MovieManager(1);
        manager.addMovie("Фильм 1");
        manager.addMovie("Фильм 2");
        manager.addMovie("Фильм 3");
        manager.addMovie("Фильм 4");
        manager.addMovie("Фильм 5");
        String[] expected = { "Фильм 5" };
        String[] actual = manager.findLastMovies();
        Assertions.assertArrayEquals(expected, actual);
    }

}
