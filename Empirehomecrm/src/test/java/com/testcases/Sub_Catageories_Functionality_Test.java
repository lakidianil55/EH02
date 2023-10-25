package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.base.Basetest;
import com.pageobjects.LoginPage;
import com.pageobjects.Sub_Catageories_Functionality;

public class Sub_Catageories_Functionality_Test extends Basetest {

	LoginPage login;
	Sub_Catageories_Functionality Sub_Catageories;

	public Sub_Catageories_Functionality_Test() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginPage();
		Sub_Catageories = new Sub_Catageories_Functionality();

	}

	@Test(priority = 1)
	public void Sub_Catageories_Functionality_Add() throws Throwable {
		login.LoginPage();
		Sub_Catageories.Sub_Catageories_Add();
		Sub_Catageories.Add_CategoryAssertMessage();
	}

	@Test(priority = 2)
	public void Sub_Catageories_Functionality_Edit() throws Throwable {
		Sub_Catageories.Sub_Catageories_Edit();
		Sub_Catageories.Edit_SubCategoryAssertMessage();
	}

	@Test(priority = 3)
	public void Sub_Catageories_Functionality_Delete() throws Throwable {
		Sub_Catageories.Sub_Catageories_Delete();
		Sub_Catageories.Delete_SubCategoryAssertMessage();
	}
	@AfterTest
	public void teardown() {

	}
}
