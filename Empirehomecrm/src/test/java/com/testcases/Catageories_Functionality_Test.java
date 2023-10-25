package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.base.Basetest;
import com.pageobjects.Catageories_Functionality;
import com.pageobjects.LoginPage;

public class Catageories_Functionality_Test extends Basetest {
	LoginPage login;
	Catageories_Functionality categoriesFunctionality;

	public Catageories_Functionality_Test() {
		super();
	}

	@BeforeTest
	public void setup() {
		initialization();
		login = new LoginPage();
		categoriesFunctionality = new Catageories_Functionality();
	}

	@Test(priority = 1)
	public void ADD_CategoriesFunctionality() throws Throwable {
		login.LoginPage();
		categoriesFunctionality.Catageories_Functionality_add();
		categoriesFunctionality.Add_CategoryAssertMessage();

	}

	@Test(priority = 2)
	public void Edit_CategoriesFunctionality() throws Throwable {
		categoriesFunctionality.Catageories_Functionality_Edit();
		categoriesFunctionality.Edit_CategoryAssertMessage();

	}

	@Test(priority = 3)
	public void Delete_CategoriesFunctionality() throws Throwable {
		categoriesFunctionality.Categories_Functionality_Delete();
		categoriesFunctionality.Delete_CategoryAssertMessage();

	}

	@AfterTest
	public void teardown() {

	}
}
