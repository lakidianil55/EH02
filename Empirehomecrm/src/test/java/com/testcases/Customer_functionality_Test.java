package com.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.Basetest;
import com.pageobjects.Customer_functionality;
import com.pageobjects.LoginPage;

import com.utils.*;

public class Customer_functionality_Test extends Basetest {
	LoginPage login;
	Customer_functionality Customer;
	private final String sheetname1 = "Customer_functionality";

	public Customer_functionality_Test() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		login = new LoginPage();
		Customer = new Customer_functionality();

	}

	@Test(dataProvider = "dataload", dataProviderClass = Customer_functionality_Test.class)

	public void Customervalidation(String EnterCustomerNameTesx, String EnterMobileNumberText, String EnterEmailIdText,
			String EnterWhatsappNumberText, String CustomerSearch, String REEnterCustomerName,
			String REEnterMobileNumber, String REEnterEmailId, String REEnterWhatsappNumber) throws Throwable {
		login.verifylogin();
		Customer.Customervalidation(EnterCustomerNameTesx, EnterMobileNumberText, EnterEmailIdText,
				EnterWhatsappNumberText, CustomerSearch, REEnterCustomerName, REEnterMobileNumber, REEnterEmailId,
				REEnterWhatsappNumber);
		Customer.CustomerAssertMessage();

	}

	@AfterMethod
	public void teardown() {

	}

}
