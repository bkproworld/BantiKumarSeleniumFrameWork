package practiceAdvanceSelenium;


import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

	@Test
	public void m1() {
		String expData = "Qspider";
		String actData = "Qspider";
		Assert.assertEquals(expData, actData);
		System.out.println("step1");
		System.out.println("step2");
	}
	
	@Test
	public void m2() {
		System.out.println("step 1 of method m2");
		Assert.assertEquals(false, false);
	}
}
