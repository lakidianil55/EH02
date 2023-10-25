package com.pageobjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.base.Basetest;
import com.utils.utils;

public class Usertype_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='User Types']")
	WebElement clickUserTypes;

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement clickAddNew;

	@FindBy(xpath = "//input[@id='TypeName']")
	WebElement TypeName;

	@FindBy(xpath = "//input[@id='TypeCode']")
	WebElement TypeCode;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;

	@FindBy(xpath = "//tr[@class='odd']//i[@class='fa fa-pencil']")
	WebElement clickedit;

	@FindBy(xpath = "//input[@id='TypeName']")
	WebElement TypeName1;

	@FindBy(xpath = "//input[@id='TypeCode']")
	WebElement TypeCode1;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave1;
	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;

	public Usertype_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void UserTypeverify(String Textfiledname, String Textfiledcode, String searchtext, String RETypeName,
			String RETypeCode, String searchtext1) throws Throwable {

		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		clickUserTypes.click();
		Thread.sleep(2000);
		clickAddNew.click();
		Thread.sleep(2000);
		TypeName.sendKeys(Textfiledname);
		Thread.sleep(2000);
		TypeCode.sendKeys(Textfiledcode);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		search.sendKeys(searchtext);
		Thread.sleep(2000);
		utils.clickElementWithJavascript(clickedit, driver);
		TypeName.clear();
		TypeName.sendKeys(RETypeName);
		Thread.sleep(2000);
		TypeCode.clear();
		TypeCode.sendKeys(RETypeCode);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		search.sendKeys(searchtext1);
	}
	public void  UsertypeAssertMessage() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println(" Element is displayed message." + AssertJUnit2.getText());
			AssertJUnit.assertTrue(" Element is displayed.", true);
		} else {
			System.out.println("Element is not displayed.");
			AssertJUnit.fail(" Element is not displayed.");

		}
	}
}

