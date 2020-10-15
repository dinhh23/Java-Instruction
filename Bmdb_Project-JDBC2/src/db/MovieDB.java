package db;

import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB implements DAO1<Movie> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false";
		String username = "bmdb_user";
		String password = "sesame";
		
		Connection conn = DriverManager.getConnection(dbURL,username,password);
		return conn;
	}
				
	@Override
	public Movie get(int movieID) {
		Movie m = null;
		String sql = "select * from movie where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, movieID);
			ResultSet rs = ps.executeQuery();
			// we only expect 1 row
			if (rs.next()) {
				m = getMovieFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}

	@Override
	public List<Movie> getALL() {
		List<Movie> movies = new ArrayList<>();
		//p. 679
		
		String sql = "select * from movie;";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery(sql);) {
			//p. 681 - process result set
			while (rs.next()) {
				Movie m = getMovieFromResultSet(rs);
				movies.add(m);
			}
			
		} catch (SQLException e) {
			System.out.println("Error getting all movies!");
			e.printStackTrace();
			movies = null;
		}
		return movies;
	}

	private Movie getMovieFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String t = rs.getString(2);
		String y = rs.getString(3);
		String r = rs.getString(4);
		String g = rs.getString(5);
		Movie m = new Movie(id,t,y,r,g);
		return m;
	}

	@Override
	public boolean add(Movie m) {
		boolean success = false;
		String sql = "insert into movie (Title,Year,Rating,Director) "
				+ "values (?,?,?,?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getGenre().toString());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error adding movie!");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean update(Movie m) {
		boolean success = false;
		String sql = "update movie set " + 
					 " title = ?," + 
					 " year = ?," + 
					 " rating = ?," + 
					 " genre = ?" + 
					 "  where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getGenre().toString());
			ps.setInt(5, m.getMovieID());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error updating movie!");
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean delete(Movie m) {
		boolean success = false;
		String sql = "delete from movie " + 
				"where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, m.getMovieID());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error deleting movie!");
			e.printStackTrace();
		}
		return success;
	}
	
	// find movie by genre with duplicate p. 679
		@Override
		public List<Movie> findByGenre(String Genre) {
			List<Movie> movies = new ArrayList<>();
					
			String sql = "select * from actor" + " where LastName = ?";
			try (Connection conn = getConnection();
				 PreparedStatement ps = conn.prepareStatement(sql);
				 ) {
				ps.setString(1, Genre);
				ResultSet rs = ps.executeQuery();
				// p. 681 - process result set 
				while (rs.next()) {
					Movie m = getMovieFromResultSet(rs);
					movies.add(m);
				}
				
			} catch (SQLException e) {
				System.out.println("Error getting all actors!");
				e.printStackTrace();
				movies = null;
			}
			return movies;
		}
	
	
	
	


}
