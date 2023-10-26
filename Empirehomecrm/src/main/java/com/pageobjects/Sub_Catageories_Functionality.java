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

public class Sub_Catageories_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickKeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Sub Categories']")
	WebElement SubCategories;

	@FindBy(xpath = "//a[normalize-space()='Add New Sub Category']")
	WebElement AddNewSubCategory;

	@FindBy(xpath = "	//select[@id='subcatDD']")
	WebElement subcatDD;

	@FindBy(xpath = "//input[@id='SubCategoryName']")
	WebElement SubCategoryName;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;

	@FindBy(xpath = ".//i[@class='fa fa-pencil']")
	WebElement EditButton;

	@FindBy(xpath = ".//i[@class='fa fa-trash-o']")
	WebElement DeleteButton;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clickyes;

	@FindBy(xpath = "preloader")
	WebElement preloader;
	@FindBy(id = "mydatatable")
	WebElement SubCategoriesTable;
	@FindBy(xpath = "//tr")
	List<WebElement> SubCategoriesRows;

	@FindBy(xpath = ".//td")
	List<WebElement> SubCategoriesColumns;

	@FindBy(xpath = "//input[@aria-controls='mydatatable']")
	WebElement clickSearch;
	@FindBy(id = "mydatatable")
	WebElement AssertJUnit1;
	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;

	@FindBy(xpath = "//select[@name='mydatatable_length']")
	WebElement editlength;

	public Sub_Catageories_Functionality() {

		PageFactory.initElements(driver, this);
	}

	// ACtionPerforms//
	public void Sub_Catageories_Add() throws Throwable {
		Thread.sleep(2000);
		clickKeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		SubCategories.click();
		Thread.sleep(2000);
		AddNewSubCategory.click();
		Thread.sleep(2000);
		subcatDD.click();
		Thread.sleep(2000);
		utils.drop();
		Thread.sleep(2000);
		SubCategoryName.sendKeys(prop.getProperty("SubCategoryName"));
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		editlength.click();
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		search.sendKeys(prop.getProperty("SubCategoryName"));
	}

	public void Sub_Catageories_Edit() throws Throwable {
		search.clear();
		search.sendKeys(prop.getProperty("SubCategoryName"));
		EditButton.click();
		Thread.sleep(2000);
		subcatDD.click();
		Thread.sleep(2000);
		utils.drop1();
		SubCategoryName.clear();
		SubCategoryName.sendKeys(prop.getProperty("RESubCategoryName"));
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		editlength.click();
		utils.Dropdown(editlength, "100");
		clickSearch.sendKeys(prop.getProperty("RESubCategoryName"));
	}

	public void Sub_Catageories_Delete() throws Throwable {
		clickSearch.clear();
		clickSearch.sendKeys(prop.getProperty("RESubCategoryName"));
		Thread.sleep(2000);
		DeleteButton.click();
		Thread.sleep(2000);
		clickyes.click();
		Thread.sleep(2000);
		editlength.click();
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		clickSearch.sendKeys(prop.getProperty("RESubCategoryName"));
	}

	// AssertMessages
	public void Add_CategoryAssertMessage() {
		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='sofa']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "sofa";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);
			}
		}

	}

	public void Edit_SubCategoryAssertMessage() {

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='sofaset']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "sofaset";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);
			}
		}

	}

	public void Delete_SubCategoryAssertMessage() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println("Delete Element is displayed message2." + AssertJUnit2.getText());
			AssertJUnit.assertTrue("Add Element is displayed.", true);
		} else {
			System.out.println("Delete Element is not displayed.");
			AssertJUnit.fail("Delete Element is not displayed.");

		}
	}
}
