package business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

private static method {



@Override
public boolean add(Movie m) {
	boolean success = false;
	String sql = "insert into actor (FirstName,LastName,Gender,BirthDate) " + 
			"values (?, ?, ?, ?)";
	try (Connection conn = getConnection();
		 PreparedStatement ps = conn.prepareStatement(sql)) {
		ps.setString(1, a.getFirstName());
		ps.setString(2, a.getLastName());
		ps.setString(3, a.getGender());
		ps.setString(4, a.getBirthDate().toString());
		ps.executeUpdate();
		success = true;
	} catch (SQLException e) {
		System.out.println("Error adding actor!");
		e.printStackTrace();
	}
	return success;
}
}	
	


