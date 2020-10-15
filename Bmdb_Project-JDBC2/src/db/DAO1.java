package db;

import java.util.List;

import business.Movie;

public interface DAO1<T> {
	T get(int movieID);
	List<T> getALL();
	List<Movie> findByGenre(String genre);
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
}

