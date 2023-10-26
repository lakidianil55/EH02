package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import com.base.Basetest;
import com.utils.utils;

import java.util.List;

public class Location_functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickKeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Location']")
	WebElement Location;

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewLocation;

	@FindBy(xpath = "//input[@id='LocationName']")
	WebElement LocationName;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement searchLocation;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;

	@FindBy(xpath = ".//i[@class='fa fa-pencil']")
	WebElement EditButton;

	@FindBy(xpath = ".//i[@class='fa fa-trash-o']")
	WebElement DeleteButton;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clickyes;

	@FindBy(xpath = "preloader")
	WebElement preloader;
	@FindBy(id = "mydatatable")
	WebElement LocationTable;
	@FindBy(xpath = "//tr")
	List<WebElement> LocationRows;

	@FindBy(xpath = ".//td")
	List<WebElement> LocationColumns;

	@FindBy(xpath = "//input[@aria-controls='mydatatable']")
	WebElement clickSearch;

	@FindBy(id = "mydatatable")
	WebElement AssertJUnit1;

	@FindBy(xpath = "//select[@name='mydatatable_length']")
	WebElement editlength;

	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;

	public Location_functionality() {
		PageFactory.initElements(driver, this);
	}

	public void Location_Functionality_add() throws Throwable {
		Thread.sleep(2000);
		clickKeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		Location.click();
		Thread.sleep(2000);
		AddNewLocation.click();
		Thread.sleep(2000);
		LocationName.sendKeys(prop.getProperty("LocationName"));
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchLocation.sendKeys(prop.getProperty("LocationName"));

	}

	public void Location_Functionality_Edit() throws Throwable {
		Thread.sleep(2000);
		searchLocation.clear();
		searchLocation.sendKeys(prop.getProperty("LocationName"));
		Thread.sleep(2000);
		EditButton.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		LocationName.clear();
		LocationName.sendKeys(prop.getProperty("RELocationName"));
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchLocation.sendKeys(prop.getProperty("RELocationName"));

	}

	public void Categories_Functionality_Delete() throws Throwable {
		Thread.sleep(2000);
		DeleteButton.click();
		Thread.sleep(2000);
		clickyes.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchLocation.clear();
		searchLocation.sendKeys(prop.getProperty("RELocationName"));

	}

	// AssertMessages
	public void Add_CategoryAssertMessage1() {

		if (AssertJUnit1.isDisplayed()) {

			System.out.println("ADD Element is displayed message1." + AssertJUnit1.getText());
			AssertJUnit.assertTrue("Add Element is displayed.", true);
		} else {
			System.out.println("Add Element is not displayed.");
			AssertJUnit.fail("Add Element is not displayed.");

		}
	}

	public void Add_CategoryAssertMessage2() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println("ADD Element is displayed message2." + AssertJUnit2.getText());
			AssertJUnit.assertTrue("Add Element is displayed.", true);
		} else {
			System.out.println("Add Element is not displayed.");
			AssertJUnit.fail("Add Element is not displayed.");

		}
	}

	public void Edit_CategoryAssertMessage1() {

		if (AssertJUnit1.isDisplayed()) {

			System.out.println("Edit Element is displayed message1." + AssertJUnit1.getText());
			AssertJUnit.assertTrue("Edit Element is displayed.", true);
		} else {
			System.out.println("Edit Element is not displayed.");
			AssertJUnit.fail("Edit Element is not displayed.");

		}
	}

	public void Edit_CategoryAssertMessage2() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println("Edit Element is displayed message2." + AssertJUnit2.getText());
			AssertJUnit.assertTrue("Add Element is displayed.", true);
		} else {
			System.out.println("Edit Element is not displayed.");
			AssertJUnit.fail("Edit Element is not displayed.");

		}
	}

	public void Delete_CategoryAssertMessage1() {

		if (AssertJUnit1.isDisplayed()) {

			System.out.println("Delate Element is displayed message1." + AssertJUnit1.getText());
			AssertJUnit.assertTrue("Delete Element is displayed.", true);
		} else {
			System.out.println("Delete Element is not displayed.");
			AssertJUnit.fail("Delete Element is not displayed.");

		}
	}

	public void Delete_CategoryAssertMessage2() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println("Delete Element is displayed message2." + AssertJUnit2.getText());
			AssertJUnit.assertTrue("Add Element is displayed.", true);
		} else {
			System.out.println("Delete Element is not displayed.");
			AssertJUnit.fail("Delete Element is not displayed.");

		}
	}
}
