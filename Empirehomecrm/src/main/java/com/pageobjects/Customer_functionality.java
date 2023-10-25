package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.base.Basetest;
import com.utils.utils;

public class Customer_functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Customers']")
	WebElement clickCustomers;

	@FindBy(xpath = "//a[normalize-space()='Add Customer']")
	WebElement clickAddCustomer;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Name']")
	WebElement EnterCustomerName;

	@FindBy(xpath = "//input[@placeholder='Enter Mobile Number']")
	WebElement EnterMobileNumber;

	@FindBy(xpath = "//input[@placeholder='Enter Email Id']")
	WebElement EnterEmailId;

	@FindBy(xpath = "//input[@placeholder='Enter Whatsapp Number']")
	WebElement EnterWhatsappNumber;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;

	@FindBy(xpath = "//tbody/tr[1]/td[11]/a[1]/button[1]")
	WebElement Edit;

	@FindBy(xpath = "//tbody/tr[1]/td[11]/a[3]/button[1]/i[1]")
	WebElement Delate;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clickyes;

	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;
	@FindBy(id = "mydatatable")
	WebElement AssertJUnit1;

	public Customer_functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Customervalidation(String EnterCustomerNameTesx, String EnterMobileNumberText, String EnterEmailIdText,
			String EnterWhatsappNumberText, String CustomerSearch, String REEnterCustomerName,
			String REEnterMobileNumber, String REEnterEmailId, String REEnterWhatsappNumber) throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickCustomers.click();
		Thread.sleep(2000);
		clickAddCustomer.click();
		Thread.sleep(2000);
		EnterCustomerName.sendKeys(EnterCustomerNameTesx);
		Thread.sleep(2000);
		EnterMobileNumber.sendKeys(EnterMobileNumberText);
		Thread.sleep(2000);
		EnterEmailId.sendKeys(EnterEmailIdText);
		EnterWhatsappNumber.sendKeys(EnterWhatsappNumberText);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		search.sendKeys(CustomerSearch);
		Thread.sleep(2000);
		Edit.click();
		EnterCustomerName.clear();
		EnterCustomerName.sendKeys(REEnterCustomerName);
		Thread.sleep(2000);
		EnterMobileNumber.clear();
		EnterMobileNumber.sendKeys(REEnterMobileNumber);
		Thread.sleep(2000);
		EnterEmailId.clear();
		EnterEmailId.sendKeys(REEnterEmailId);
		Thread.sleep(2000);
		EnterWhatsappNumber.clear();
		EnterWhatsappNumber.sendKeys(REEnterWhatsappNumber);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		search.sendKeys(CustomerSearch);
		Delate.click();
		Thread.sleep(2000);
		clickyes.click();
		Thread.sleep(2000);
		search.sendKeys(CustomerSearch);

	}

	public void CustomerAssertMessage() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println(" Element is displayed message." + AssertJUnit2.getText());
			AssertJUnit.assertTrue(" Element is displayed.", true);
		} else {
			System.out.println("Element is not displayed.");
			AssertJUnit.fail(" Element is not displayed.");

		}
	}
}
