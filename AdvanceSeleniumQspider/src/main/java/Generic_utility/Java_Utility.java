package Generic_utility;

import java.util.Random;

public class Java_Utility {
	
	/**
	 * This method is used to avoid duplicates
	 * @return
	 */
	
	public int getRandomNum() {
			
		Random rn = new Random();
		int rannum = rn.nextInt(10000);
		return rannum;
	}

}
