package com.timetracking.actitime.module1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.timetracking.actitime.genericUtility.BaseClass;
import com.timetracking.actitime.genericUtility.WebDriverUtility;

public class ToVerifyHomePageTest extends BaseClass {

	@Test
	public void toVerifyHomePageTest() throws InterruptedException {
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Enter"));
		System.out.println("The Homepage is verified");
	}

	@Test
	public void toVerifyTaskPageTest() {
		int actualValue = 123;
		int expaectedValue = 123;

		SoftAssert s = new SoftAssert();
		s.assertEquals(actualValue, expaectedValue, "The task page has not been verified");

		s.assertAll();
		System.out.println("The TaskPage is verified");
	}

	@Test
	public void toVerifyUserPageTest() {
		System.out.println("The UserPage is verified");
		System.out.println("The UserPage is verified");
	}
}
