package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class WriteDataToDatabase {

	public static void main(String[] args) throws SQLException {
		
		
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//getConnection to the database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bantisql","root","rootqspiderbanti");
		
		Statement stat = connection.createStatement();
		String query = "insert into myadvselenium(first_name,last_name,address)values('Sam','khanuja','panagarh')";
		int result = stat.executeUpdate(query);
		
		if(result==1) {
			
			System.out.println("data updated");
		}
		else
		{
			System.out.println("data not updated");
		}
		connection.close();
	}

}
