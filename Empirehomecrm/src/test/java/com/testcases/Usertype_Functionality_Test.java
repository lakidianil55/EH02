package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.Basetest;

import com.pageobjects.LoginPage;

import com.pageobjects.Usertype_Functionality;
import com.utils.*;

public class Usertype_Functionality_Test extends Basetest {
	LoginPage login;
	Usertype_Functionality Usertype;
	private final String sheetname1 = "UserType_Functionality";

	public Usertype_Functionality_Test() {
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
		Usertype = new Usertype_Functionality();

	}

	@Test(dataProvider = "dataload", dataProviderClass = Usertype_Functionality_Test.class)

	public void Usertypevalidation(String Textfiledname, String Textfiledcode, String searchtext, String RETypeName,
			String RETypeCode, String searchtext1) throws Throwable {
		login.verifylogin();
		Usertype.UserTypeverify(Textfiledname, Textfiledcode, searchtext, RETypeName, RETypeCode, searchtext1);
		Usertype.UsertypeAssertMessage();

	}

	@AfterMethod
	public void teardown() {

	}

}
