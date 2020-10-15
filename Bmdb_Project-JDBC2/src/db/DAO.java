package db;

import java.util.List;

import business.Actor;

public interface DAO<T> {
	T get(int actorID);
	List<T> getALL();
	List<Actor> findByLastName(String lastName); 
	boolean add(T t);
	boolean update(T t);
	boolean delete(T t);

}

