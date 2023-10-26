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

public class Condition_functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickKeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Condition']")
	WebElement Condition;

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewCondition;

	@FindBy(xpath = "//input[@id='ConditionName']")
	WebElement ConditionName;

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
	WebElement ConditionTable;
	@FindBy(xpath = "//tr")
	List<WebElement> ConditionRows;

	@FindBy(xpath = ".//td")
	List<WebElement> ConditionColumns;

	@FindBy(xpath = "//input[@aria-controls='mydatatable']")
	WebElement clickSearch;

	@FindBy(xpath = "//select[@name='mydatatable_length']")
	WebElement editlength;

	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;

	public Condition_functionality() {

		PageFactory.initElements(driver, this);

	}

	// ACtionPerforms//
	public void Condition_functionality_Add() throws Throwable {
		Thread.sleep(2000);
		clickKeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		Condition.click();
		Thread.sleep(2000);
		AddNewCondition.click();
		Thread.sleep(2000);
		ConditionName.sendKeys(prop.getProperty("ConditionName"));
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		editlength.click();
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchLocation.sendKeys(prop.getProperty("ConditionName"));
	}

	public void Condition_functionality_Edit() throws Throwable {

		clickSearch.clear();
		clickSearch.sendKeys(prop.getProperty("ConditionName"));
		EditButton.click();
		Thread.sleep(2000);
		ConditionName.clear();
		ConditionName.sendKeys(prop.getProperty("REConditionName"));
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		editlength.click();
		utils.Dropdown(editlength, "100");
		clickSearch.clear();
		clickSearch.sendKeys(prop.getProperty("REConditionName"));

	}

	public void Condition_functionality_Delete() throws Throwable {

		clickSearch.clear();
		clickSearch.sendKeys(prop.getProperty("REConditionName"));
		Thread.sleep(2000);
		DeleteButton.click();
		Thread.sleep(2000);
		clickyes.click();
		Thread.sleep(2000);
		editlength.click();
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		clickSearch.sendKeys(prop.getProperty("REConditionName"));

	}

	// AssertMessages

	public void Add_ConditionAssertMessage() {

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Good']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "Good";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);

			}
		}
	}

	public void Edit_ConditionAssertMessage() {
		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Average']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "Average";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);

			}
		}
	}

	public void Delete_ConditionAssertMessage() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println(" Element is displayed message." + AssertJUnit2.getText());
			AssertJUnit.assertTrue(" Element is displayed.", true);
		} else {
			System.out.println("Element is not displayed.");
			AssertJUnit.fail(" Element is not displayed.");
		}

	}
}
