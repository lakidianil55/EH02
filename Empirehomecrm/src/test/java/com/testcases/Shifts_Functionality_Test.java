package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.base.Basetest;
import com.pageobjects.LoginPage;
import com.pageobjects.Shifts_Functionality;

public class Shifts_Functionality_Test extends Basetest {

	LoginPage login;
	Shifts_Functionality Shifts;

	public Shifts_Functionality_Test() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginPage();
		Shifts = new Shifts_Functionality();
	}

	@Test(priority = 1)
	public void Shifts_Functionality_Add() throws Throwable {
		login.LoginPage();
		Shifts.Catageories_Functionality_add();
		Shifts.Add_ShiftsAssertMessage();

	}

	@Test(priority = 2)
	public void Shifts_Functionality_Edit() throws Throwable {

		Shifts.Catageories_Functionality_Edit();

		Shifts.Edit_ShiftsAssertMessage();

	}

	@Test(priority = 3)
	public void Shifts_Functionality_Delete() throws Throwable {
		Shifts.Categories_Functionality_Delete();
		Shifts.Delete_ShiftsAssertMessage();

	}

	@AfterTest
	public void teardown() {

	}
}
