package db;

import java.util.List;

public interface DAO<T> {
	T get(int actorID);
	List<T> getALL();
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);
}

