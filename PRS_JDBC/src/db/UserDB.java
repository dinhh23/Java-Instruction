package db;

import java.sql.*; 
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserDB implements DAO<User> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false";
		String username = "prs_user";
		String password = "sesame";
		
		Connection conn = DriverManager.getConnection(dbURL,username,password);
		return conn;
	}
				
	@Override
	public User get(int ID) {
		User u = null;
		String sql = "select * from actor where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1,ID);
			ResultSet rs = ps.executeQuery();
			// we only expect 1 row
			if (rs.next()) {
				u = getUserFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	@Override
	public List<User> getALL() {
		List<User> users = new ArrayList<>();
		//p. 679
		
		String sql = "select * from user;";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql);
			 ResultSet rs = ps.executeQuery(sql);) {
			//p. 681 - process result set
			while (rs.next()) {
				User u = getUserFromResultSet(rs);
				users.add(u);
			}
			
		} catch (SQLException e) {
			System.out.println("Error getting all actors!");
			e.printStackTrace();
			users = null;
		}
		return users;
	}

	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1);
		String userName = rs.getString(2);
		String passWord = rs.getString(3);
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phoneNumber = rs.getString(6);
		String email = rs.getString(7);
		String reviewer = rs.getString(8);
		String admin = rs.getString(9);
		User u = new User(id,userName,passWord,firstName,lastName,phoneNumber,email,reviewer,admin);
		return u;
	}
	
	@Override
	public boolean add(User u) {
		boolean success = false;
		String sql = "insert into actor (FirstName,LastName,Gender,BirthDate) " + 
				"values (?, ?, ?, ?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, u.getID());
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPassWord());
			ps.setString(4, u.getFirstName());
			ps.setString(5, u.getLastName());
			ps.setString(6, u.getPhoneNumber());
			ps.setString(7, u.getEmail());
			ps.setString(8, u.getReviewer());
			ps.setString(9, u.getAdmin().toString());;
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error adding actor!");
			e.printStackTrace();
		}
		return success;
	}

	/* @Override
	public boolean update(User u) {
		boolean success = false;
		String sql = "update actor set " + 
					 " firstName = ?," + 
					 " lastName = ?," + 
					 " gender = ?," + 
					 " birthdate = ?" + 
					 "  where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, a.getFirstName());
			ps.setString(2, a.getLastName());
			ps.setString(3, a.getGender());
			ps.setString(4, a.getBirthDate().toString());
			ps.setInt(5, a.getActorID());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error updating actor!");
			e.printStackTrace();
		}
		return success;
	} */

	@Override
	public boolean delete(User u) {
		boolean success = false;
		String sql = "delete from actor " + 
				"where id = ?";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, u.getID());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			System.out.println("Error deleting actor!");
			e.printStackTrace();
		}
		return success;
		
		
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(String user) {
		// TODO Auto-generated method stub
		
	}

	
	}

