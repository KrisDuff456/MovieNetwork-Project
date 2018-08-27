package java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.json.JSONString;

import com.google.gson.Gson;

import database.Account;
import database.Address;

//@Path("/sign_up")
public class AccountUser {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/test")
	public void testtest() {
		Gson gson = new Gson();
		return gson.fromJson("WEEE DIDDD ITTT");
	}

	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Path("/newUser")
	public void addUser(@FormParam("first_name") String first_name) {
		System.out.println(first_name);
//		String DB_URL = "jdbc:mysql://127.0.0.1:3306/filmenterprise";
//		String USER = "root";
//		String PASS = "password";
//		PreparedStatement stmt = null;
//		
//        String sqlInsert = "INSERT INTO account(accountID,email,password,first_name,last_name,dateOfBirth)"
//        		+ " VALUES(?,?,?,?,?,?)";
//        
//			try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
//				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//				
//				stmt = conn.prepareStatement(sqlInsert);
//				stmt.setInt(1,user.getAccountID());
//				stmt.setString(2,user.getEmail());
//				stmt.setString(3,user.getPassword());
//				stmt.setString(4,user.getFirst_name());
//				stmt.setString(5,user.getLast_name());
//				stmt.setString(6,user.getEmail());
//				
//				stmt.executeUpdate(sqlInsert);
//				
//			} catch (SQLException se) {
//				se.printStackTrace();
//			} catch (Exception e) {
//				e.printStackTrace();
//			} 
//	}
//	return "{\"result\":\""+  +"\"}";
	}
}
