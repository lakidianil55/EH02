package com.testcases;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.base.Basetest;
import com.pageobjects.Holidays_Functionality;
import com.pageobjects.LoginPage;
import com.utils.*;

public class Holidays_Functionality_Test extends Basetest {
	LoginPage login;
	Holidays_Functionality Holidays;
	private final String sheetname1 = "Holidays_Functionality";

	public Holidays_Functionality_Test() {
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
		Holidays = new Holidays_Functionality();

	}

	@Test(dataProvider = "dataload", dataProviderClass = Holidays_Functionality_Test.class)

	public void Holidaysvalidation(String TextHolidayDate, String TextHolidayName, String TextHolidayDesc,
			String REHolidayDate, String REHolidayName, String REHolidayDesc) throws Throwable {
		login.verifylogin();
		Holidays.Holidaysverify(TextHolidayDate, TextHolidayName, TextHolidayDesc, REHolidayDate, REHolidayName,
				REHolidayDesc);
		Holidays.HolidaysAssertRows();

	}

	@AfterMethod
	public void teardown() {

	}

}
