package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataFromMySql {

	public static void main(String[] args) throws SQLException {
		// Register or load the mysql database	
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//getConnection to the database
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bantisql","root","rootqspiderbanti");
		
		Statement stat = connection.createStatement();
		
		String selectQuery=" select * from myadvselenium";
		 ResultSet result = stat.executeQuery(selectQuery);
		 
		 while(result.next()) {
			 System.out.println(result.getString(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		 }
		 connection.close();

	}

}
