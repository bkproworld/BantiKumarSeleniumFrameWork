package TestNgTopic;

import org.testng.annotations.Test;
@Test
public class TestNgExample {
	
	
	//@Test(priority = -2)
	//@Test(invocationCount = 3)
	public void createContact() {
		
		System.out.println("created contact");
	}
	
	//@Test(priority = 0)
	//@Test(dependsOnMethods = "createContact")
	//@Test(invocationCount = 0)
	public void modifyContact() {
		System.out.println("contact modified");
	}
	
	
	//@Test(priority= -3)
	//@Test(dependsOnMethods = "createContact")
	@Test(enabled = false)
	public void deleteContact() {
		System.out.println("contact deleted");
	}

}
