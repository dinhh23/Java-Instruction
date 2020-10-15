package db;

import java.io.*;  
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieTextFile implements DAO1<Movie> {
	private List<Movie> movies = null;
	private Path moviesPath = null;
	private File moviesFile = null;
	private final String FIELD_SEP = "\t";

	public MovieTextFile() {
		moviesPath = Paths.get("movies.txt");
		moviesFile = moviesPath.toFile();
		movies = getALL();		
	}

	@Override
	public Movie get(int movieID) {
		return null;
	}
	
	// get all products from text file if our list is null
	@Override
	public List<Movie> getALL() {
		if (movies != null) {
			return movies;
		}
		movies = new ArrayList<>();
		if (Files.exists(moviesPath)) {	
			try (BufferedReader in = new BufferedReader(new FileReader(moviesFile))) {
				// read products from file into our list 
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String moviesIDStr = fields[0];
					int movieID = Integer.parseInt(moviesIDStr);
					String Title = fields[1];
					String Year = fields[2];
					String Rating = fields[3];
					String Genre = fields[4];
					
					Movie p = new Movie(movieID,Title,Year,Rating,Genre);
					movies.add(p);
					line = in.readLine();
				}			
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}
		
		} else {
			System.out.println(moviesPath.toAbsolutePath()+ " doesn't exist.");
			return null;
		}
		return movies;
	}


	@Override
	public boolean add(Movie p) {
		movies.add(p);
		return saveALL();
	}

	@Override
	public boolean update(Movie m) {
		Movie oldMovie = this.get(m.getMovieID());
		int i = movies.indexOf(oldMovie);
		movies.remove(i);
		movies.add(i,m);
		return saveALL();
	}

	@Override
	public boolean delete(Movie m) {
		movies.remove(m);
		return saveALL();
	}
	
	private boolean saveALL() {
		// after every maintenance (add, update, delete) function, rewrite the text file
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(
				  	           new BufferedWriter(
				               new FileWriter(moviesFile)))) {
		// write all products in the list to the file 
			for (Movie m: movies) {
				out.print(m.getMovieID()+FIELD_SEP);
				out.print(m.getTitle()+FIELD_SEP);
				out.print(m.getYear()+FIELD_SEP);
				out.print(m.getRating()+FIELD_SEP);
				out.println(m.getGenre());           
			}
			return true;
		}
		catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

	
	

	

}
