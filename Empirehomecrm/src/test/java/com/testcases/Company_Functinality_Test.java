package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.base.Basetest;

import com.pageobjects.Company_Functionality;
import com.pageobjects.LoginPage;
import com.utils.utils;

public class Company_Functinality_Test extends Basetest {
	LoginPage login;
	Company_Functionality Company;
	private final String sheetname1 = " Company_Functionality_Data";

	public Company_Functinality_Test() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() throws Throwable {
		initialization();
		login = new LoginPage();
		Company = new Company_Functionality();
	}

	@Test(dataProvider = "dataload", dataProviderClass = Company_Functinality_Test.class)

	public void Edit_Company_Functionality(String CompanyName, String CompanyAddress, String WarehouseAddress,
			String ShowroomAddress, String CEOName, String CEOEmail, String CEONumber, String WareHouseNumber,
			String ShowroomNumber, String ShowroomEmail, String WareHouseEmail, String GSTNumber, String Code)
			throws Throwable {
		login.LoginPage();
		Company.Company_Functionality_Edit(CompanyName, CompanyAddress, WarehouseAddress, ShowroomAddress, CEOName,
				CEOEmail, CEONumber, WareHouseNumber, ShowroomNumber, ShowroomEmail, WareHouseEmail, GSTNumber, Code);

		Company.CompanyAssertRows();

	}

	@AfterMethod
	public void teardown() {

	}
}
