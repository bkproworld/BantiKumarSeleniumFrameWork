package practiceAdvanceSelenium;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertingDataToProperty_File {

	public static void main(String[] args) throws Throwable {
		Properties pro = new Properties();
		
		pro.setProperty("browser", "edge");
		pro.setProperty("url", "http://localhost:8888/");
		pro.setProperty("username", "admin");
		pro.setProperty("password", "admin");
		
		FileOutputStream fout = new FileOutputStream(System.getProperty("user.dir")+"/src/test/resources/VtPro.properties");

		pro.store(fout, "Common data");
		fout.close();
		
	}

}
