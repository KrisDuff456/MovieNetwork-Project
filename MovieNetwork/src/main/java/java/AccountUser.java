package java;
import java.sql.*;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import database.Account;
import database.Address;

@Path("/signup")
public class AccountUser {
	
	@POST
	@Produces("Application/json")
	@Path("/add")
	public void addUser(Account user) {
		String DB_URL = "jdbc:mysql://127.0.0.1:3306/filmenterprise";
		String USER = "root";
		String PASS = "password";
		
        String sql = "INSERT INTO account(accountID,email,password,first_name,last_name,dateOfBirth)"
        		+ " VALUES(?,?,?,?,?,?)";
        
			try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1,user.getAccountID());
				stmt.setString(2,user.getEmail());
				stmt.setString(3,user.getPassword());
				stmt.setString(4,user.getFirst_name());
				stmt.setString(5,user.getLast_name());
				stmt.setString(6,user.getEmail());
				
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}	
	}
	@POST
	@Produces("Application/json")
	@Path("/add")
	public void addaddress(Address address) {
		String DB_URL = "jdbc:mysql://127.0.0.1:3306/filmenterprise";
		String USER = "root";
		String PASS = "password";
		
        String sql = "INSERT INTO address(AddressID,House_Number,Postcode,PhoneNumber,City,Street,Country)"
        		+ " VALUES(?,?,?,?,?,?,?)";
        
			try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1,address.getAddressID());
				stmt.setInt(2,address.getHouseNum());
				stmt.setString(3,address.getPostCode());
				stmt.setInt(4,address.getPhoneNumber());
				stmt.setString(5,address.getStreet());
				stmt.setString(6,address.getCity());
				stmt.setString(6,address.getCountry());
				
			} catch (SQLException se) {
				se.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}	
	}
}
