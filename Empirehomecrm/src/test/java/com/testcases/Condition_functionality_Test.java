package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.base.Basetest;
import com.pageobjects.Condition_functionality;
import com.pageobjects.LoginPage;

public class Condition_functionality_Test extends Basetest {

	LoginPage login;
	Condition_functionality Condition;

	public Condition_functionality_Test() {
		super();
	}

	@BeforeTest
	public void setup() {

		initialization();
		login = new LoginPage();
		Condition = new Condition_functionality();
	}

	@Test(priority = 1)
	public void Condition_Functionality_Add() throws Throwable {
		login.LoginPage();
		Condition.Condition_functionality_Add();
		Condition.Add_ConditionAssertMessage();
	}

	@Test(priority = 2)
	public void Condition_Functionality_Edit() throws Throwable {

		Condition.Condition_functionality_Edit();
		Condition.Edit_ConditionAssertMessage();
	}

	@Test(priority = 3)
	public void Condition_Functionality_Delete() throws Throwable {
		Condition.Condition_functionality_Delete();
		Condition.Delete_ConditionAssertMessage();

	}

	@AfterTest
	public void teardown() {

	}
}
