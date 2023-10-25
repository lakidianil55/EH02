package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import com.base.Basetest;


public class Company_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickKeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Company']")
	WebElement Company;

	@FindBy(xpath = "//input[@placeholder='Enter Company Name']")
	WebElement EnterCompanyName;

	@FindBy(xpath = "//textarea[@placeholder='Enter Company Address']")
	WebElement EnterCompanyAddress;

	@FindBy(xpath = "//textarea[@placeholder='Enter Warehouse Address']")
	WebElement EnterWarehouseAddress;

	@FindBy(xpath = "//textarea[@placeholder='Enter Showroom Address']")
	WebElement EnterShowroomAddress;
	
	@FindBy(xpath = "//input[@placeholder='Enter CEO Name']")
	WebElement EnterCEOName;

	@FindBy(xpath = "//input[@placeholder='Enter CEO Email']")
	WebElement EnterCEOEmail;

	@FindBy(xpath = "//input[@placeholder='Enter CEO Number']")
	WebElement EnterCEONumber;

	@FindBy(xpath = "//input[@placeholder='Enter WareHouse Number']")
	WebElement EnterWareHouseNumber;

	@FindBy(xpath = "//input[@placeholder='Enter Showroom Number']")
	WebElement EnterShowroomNumber;

	@FindBy(xpath = "//input[@placeholder='Enter Showroom Email']")
	WebElement EnterShowroomEmail;
	
	@FindBy(xpath = "//input[@placeholder='Enter WareHouse Email']")
	WebElement EnterWareHouseEmail;
	

	@FindBy(xpath = "//input[@placeholder='Enter GST Number']")
	WebElement EnterGSTNumber;

	@FindBy(xpath = "//input[@placeholder='Enter Code']")
	WebElement EnterCode;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;

	@FindBy(xpath = ".//i[@class='fa fa-pencil']")
	WebElement EditButton;

	@FindBy(id = "mydatatable")
	WebElement AssertJUnit1;

	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;

	public Company_Functionality() {
		PageFactory.initElements(driver, this);
	}

	public void Company_Functionality_Edit(String CompanyName, String CompanyAddress, String WarehouseAddress,
			String ShowroomAddress,	String CEOName, String CEOEmail, String CEONumber, String WareHouseNumber, String ShowroomNumber,
			String ShowroomEmail,String WareHouseEmail, String GSTNumber, String Code) throws Throwable {
		Thread.sleep(2000);
		clickKeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		Company.click();
		Thread.sleep(2000);
		EditButton.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		EnterCompanyName.clear();
		EnterCompanyName.sendKeys(CompanyName);
		Thread.sleep(2000);
		EnterCompanyAddress.clear();
		EnterCompanyAddress.sendKeys(CompanyAddress);
		Thread.sleep(2000);
		EnterWarehouseAddress.clear();
		EnterWarehouseAddress.sendKeys(WarehouseAddress);
		Thread.sleep(2000);
		EnterShowroomAddress.clear();
		EnterShowroomAddress.sendKeys(ShowroomAddress);
		Thread.sleep(2000);
		EnterCEOName.clear();
		EnterCEOName.sendKeys(CEOName);
		Thread.sleep(2000);
		EnterCEOEmail.clear();
		EnterCEOEmail.sendKeys(CEOEmail);
		Thread.sleep(2000);
		EnterCEONumber.clear();
		EnterCEONumber.sendKeys(CEONumber);
		Thread.sleep(2000);
		EnterWareHouseNumber.clear();
		EnterWareHouseNumber.sendKeys(WareHouseNumber);
		Thread.sleep(2000);
		EnterShowroomNumber.clear();
		EnterShowroomNumber.sendKeys(ShowroomNumber);
		Thread.sleep(2000);
		EnterShowroomEmail.clear();
		EnterShowroomEmail.sendKeys(ShowroomEmail);
		Thread.sleep(2000);
		EnterWareHouseEmail.clear();
		EnterWareHouseEmail.sendKeys(WareHouseEmail);
		Thread.sleep(2000);
		EnterGSTNumber.clear();
		EnterGSTNumber.sendKeys(GSTNumber);
		Thread.sleep(2000);
		EnterCode.clear();
		EnterCode.sendKeys(Code);
		Thread.sleep(2000);
		savebutton.click();
	}

	public void CompanyAssertRows() {
		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Lakidi Anil']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "Lakidi Anil";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);

			}
		}

	}
	}

	

