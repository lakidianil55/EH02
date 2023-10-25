package com.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.Basetest;
import com.pageobjects.Login_Functionality_Page;
import com.utils.*;

public class Login_Fuctionality_Test extends Basetest {

	Login_Functionality_Page login ;
	private final String sheetname1 = "Login_Functionality";

	public Login_Fuctionality_Test() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		login = new Login_Functionality_Page();

	}

	@Test(dataProvider = "dataload", dataProviderClass = Login_Fuctionality_Test.class)

	public void loginvalidation(String username, String password) {

		login.verifylogin(username, password);
		
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//h4[@class='text-center font-weight-bold mb-3']")).isDisplayed());
		

	}

	@AfterMethod
	public void teardown() {

	}

}
