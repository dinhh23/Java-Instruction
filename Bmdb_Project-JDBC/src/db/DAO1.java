package db;

import java.util.List;

public interface DAO1<T> {
	T get(int movieID);
	List<T> getALL();
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
}

