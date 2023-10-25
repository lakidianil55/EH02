package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;
import com.base.Basetest;
import com.utils.utils;

import java.util.List;

public class Catageories_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickKeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Categories']")
	WebElement Categories;

	@FindBy(xpath = "//a[normalize-space()='Add New Category']")
	WebElement AddNewCategories;

	@FindBy(xpath = "//input[@id='CategoryName']")
	WebElement CategoriesName;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement searchCategories;

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
	WebElement CategoriesTable;
	@FindBy(xpath = "//tr")
	List<WebElement> CategoriesRows;

	@FindBy(xpath = ".//td")
	List<WebElement> CategoriesColumns;

	@FindBy(xpath = "//input[@aria-controls='mydatatable']")
	WebElement clickSearch;

	@FindBy(id = "mydatatable")
	WebElement AssertJUnit1;

	@FindBy(xpath = "//select[@name='mydatatable_length']")
	WebElement editlength;

	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;

	public Catageories_Functionality() {
		PageFactory.initElements(driver, this);
	}

	public void Catageories_Functionality_add() throws Throwable {
		Thread.sleep(2000);
		clickKeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		Categories.click();
		Thread.sleep(2000);
		AddNewCategories.click();
		Thread.sleep(2000);
		CategoriesName.sendKeys("God Room");
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchCategories.sendKeys("God Room");

	}

	public void Catageories_Functionality_Edit() throws Throwable {
		Thread.sleep(2000);
		searchCategories.clear();
		searchCategories.sendKeys("God Room");
		Thread.sleep(2000);
		EditButton.click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		CategoriesName.clear();
		CategoriesName.sendKeys("Hall Room");
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchCategories.sendKeys("Hall Room");

	}

	public void Categories_Functionality_Delete() throws Throwable {
		Thread.sleep(2000);
		DeleteButton.click();
		Thread.sleep(2000);
		clickyes.click();
		Thread.sleep(2000);
		utils.drop1();
		Thread.sleep(2000);
		searchCategories.clear();
		searchCategories.sendKeys("Hall Room");

	}

	// AssertMessages
	public void Add_CategoryAssertMessage() {

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='God Room']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "God Room";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);

			}
		}
	}

	public void Edit_CategoryAssertMessage() {

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Hall Room']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "Hall Room";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);

			}
		}
	}

	public void Delete_CategoryAssertMessage() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println("Delate Element is displayed message1." + AssertJUnit2.getText());
			AssertJUnit.assertTrue("Delete Element is displayed.", true);
		} else {
			System.out.println("Delete Element is not displayed.");
			AssertJUnit.fail("Delete Element is not displayed.");

		}
	}
}