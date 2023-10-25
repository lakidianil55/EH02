package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import com.base.Basetest;
import com.pageobjects.Employee_registration_Functionality;
import com.pageobjects.Holidays_Functionality;
import com.pageobjects.LoginPage;
import com.utils.*;

public class Employee_registration_Functionality_Test extends Basetest {
	LoginPage login;
	Employee_registration_Functionality Employee;
	private final String sheetname1 = "Employee_registration";

	public Employee_registration_Functionality_Test() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
	}
                                   //////not working module////
	@BeforeMethod
	public void setup() {         /////not working module///////
                                 ///////not working module/////
		initialization();

		login = new LoginPage();
		Employee = new Employee_registration_Functionality();

	}

	@Test(dataProvider = "dataload", dataProviderClass = Employee_registration_Functionality_Test.class)

	public void Employeevalidation(String Name,String Mail,String MobileNumber,String textbox) throws Throwable {
		login.verifylogin();
		Employee.Employee_Registration_verify(Name, Mail, MobileNumber, textbox);

	//	AssertJUnit.assertEquals("");     //not working module
	}

	@AfterMethod
	public void teardown() {

	}

}
