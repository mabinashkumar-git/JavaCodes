package udemy.MavenJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;


public class JDBCConnection {
	
	@Test
	public void connectDatabase() throws SQLException {
		/* host and port no are of the Mysql workbench*/
		String host = "localhost";
		String port = "3306";
		
		 /* There are 3 argements in getconnection() : 1st argument provides the connection, 2nd provides the username
		    to database, 3rd provides the password of the database
		  * In  "jdbc:mysql://" + host + ":" + port + "/QaDataBaseTest" -> QaDataBaseTest is Database name we have given 
		    in sql workbench */
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QaDataBaseTest", "root", "sql8658734399");
		Statement statement = connection.createStatement();
		ResultSet result =  statement.executeQuery("select * from EmployeeInfo where name = 'Kumar';");
		
		/* By default it always points to base index but values are present in next index, now if we do not write 
		   "reult.next()" it will return null values as by default it ppoints to base index */
		while(result.next()) {
			System.out.println("Id :" + result.getInt("id"));
			System.out.println("Location :" + result.getString("location"));
		}
		
		
	}

}
