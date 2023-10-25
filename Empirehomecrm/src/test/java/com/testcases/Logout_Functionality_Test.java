package com.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.base.Basetest;
import com.pageobjects.LoginPage;
import com.pageobjects.Logout_Functionality;

public class Logout_Functionality_Test extends Basetest {
	LoginPage login;
	Logout_Functionality Logout;

	public Logout_Functionality_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		login = new LoginPage();
		Logout = new Logout_Functionality();

	}

	@Test
	public void LogOutvalidation() throws Throwable {
		login.verifylogin();
		Logout.verifyLogout();

		
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//h4[@class='text-center font-weight-bold mb-3']")).isDisplayed());

	}

	@AfterMethod
	public void teardown() {

	}

}
