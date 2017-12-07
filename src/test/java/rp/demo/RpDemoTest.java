package rp.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RpDemoTest {
	@Test
	public void passedTest() {
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = "passedTest")
	public void secondPassedTest() {
		System.out.println("WOW! \n");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods = "secondPassedTest")
	public void failedTest() {
		System.out.println("This test failed by default. \n");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "failedTest", alwaysRun = true)
	public void helloTest() {
		System.out.println("Hello CI. \n");
	}

}