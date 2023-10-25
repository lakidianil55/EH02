package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.base.Basetest;
import com.pageobjects.Location_functionality;
import com.pageobjects.LoginPage;

public class Location_functionality_Test extends Basetest {

	LoginPage login;
	Location_functionality Location;

	public Location_functionality_Test() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginPage();
		Location = new Location_functionality();
	}

	@Test(priority = 1)
	public void Condition_Functionality_Add() throws Throwable {
		login.LoginPage();
		Location.Location_Functionality_add();
		Location.Add_CategoryAssertMessage1();
		Location.Add_CategoryAssertMessage2();
	}

	@Test(priority = 2)
	public void Condition_Functionality_Edit() throws Throwable {
		Location.Location_Functionality_Edit();
		Location.Edit_CategoryAssertMessage1();
		Location.Edit_CategoryAssertMessage2();

	}

	@Test(priority = 3)
	public void Condition_Functionality_Delete() throws Throwable {
		Location.Categories_Functionality_Delete();
		Location.Delete_CategoryAssertMessage1();
		Location.Delete_CategoryAssertMessage2();

	}

	@AfterTest
	public void teardown() {

	}
}
