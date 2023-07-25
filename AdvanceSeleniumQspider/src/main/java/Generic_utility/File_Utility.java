package Generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class File_Utility {
	/**
	 * This method is used to avoid the duplicates
	 * @param Key
	 * @return
	 * @throws Throwable
	 */
	
	public String getStringKeyAndValue(String Key) throws Throwable {
		
		//FileInputStream fis = new FileInputStream("src/test/resources/Vtigerurl.properties");
		//FileInputStream fis = new FileInputStream("src/test/resources/VtPro.properties");
		FileInputStream fis = new FileInputStream(iPathConstant.FILEUTILITY_PATH);
		
		Properties pro  = new Properties();
		pro.load(fis);
		String value = pro.getProperty(Key);
		return value;
		
		
	}

}
