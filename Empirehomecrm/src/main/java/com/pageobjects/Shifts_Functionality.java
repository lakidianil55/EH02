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

public class Shifts_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickKeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Shifts']")
	WebElement Shifts;

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement AddNewShifts;

	@FindBy(xpath = "//input[@id='ShiftName']")
	WebElement ShiftsName;

	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement searchShifts;

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
	WebElement ShiftsTable;
	@FindBy(xpath = "//tr")
	List<WebElement> ShiftsRows;

	@FindBy(xpath = ".//td")
	List<WebElement> ShiftsColumns;

	@FindBy(xpath = "//input[@aria-controls='mydatatable']")
	WebElement clickSearch;

	@FindBy(id = "mydatatable")
	WebElement AssertJUnit1;

	@FindBy(xpath = "//select[@name='mydatatable_length']")
	WebElement editlength;

	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;

	@FindBy(xpath = "//input[@name='StartTime']")
	WebElement StartTime;
	@FindBy(xpath = "//input[@name='EndTime']")
	WebElement EndTime;

	public Shifts_Functionality() {
		PageFactory.initElements(driver, this);
	}

	public void Catageories_Functionality_add() throws Throwable {
		Thread.sleep(2000);
		clickKeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		Shifts.click();
		Thread.sleep(2000);
		AddNewShifts.click();
		Thread.sleep(2000);
		ShiftsName.sendKeys("General shift");
		Thread.sleep(2000);
		StartTime.sendKeys("9:00");
		utils.AM();
		Thread.sleep(2000);
		EndTime.sendKeys("5:00");
		utils.PM();
		Thread.sleep(2000);
		savebutton.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchShifts.sendKeys("General shift");

	}

	public void Catageories_Functionality_Edit() throws Throwable {
		Thread.sleep(2000);
		searchShifts.clear();
		searchShifts.sendKeys("General shift");
		Thread.sleep(2000);
		EditButton.click();
		Thread.sleep(2000);
		ShiftsName.clear();
		ShiftsName.sendKeys("NIGHT SHIFT");
		Thread.sleep(2000);
		Thread.sleep(2000);
		StartTime.sendKeys("7:00");
		utils.PM();
		Thread.sleep(2000);
		EndTime.sendKeys("2:30");
		utils.AM();
		savebutton.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchShifts.sendKeys("NIGHT SHIFT");

	}

	public void Categories_Functionality_Delete() throws Throwable {
		Thread.sleep(2000);
		DeleteButton.click();
		Thread.sleep(2000);
		clickyes.click();
		Thread.sleep(2000);
		utils.Dropdown(editlength, "100");
		Thread.sleep(2000);
		searchShifts.clear();
		searchShifts.sendKeys("NIGHT SHIFT");

	}

	// AssertMessages
	public void Add_ShiftsAssertMessage() {

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='General shift']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "General shift";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);

			}
		}
	}

	public void Edit_ShiftsAssertMessage() {

		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='NIGHT SHIFT']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "NIGHT SHIFT";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);
			}
		}
	}

	public void Delete_ShiftsAssertMessage() {

		if (AssertJUnit2.isDisplayed()) {

			System.out.println("Delate Element is displayed message1." + AssertJUnit2.getText());
			AssertJUnit.assertTrue("Delete Element is displayed.", true);
		} else {
			System.out.println("Delete Element is not displayed.");
			AssertJUnit.fail("Delete Element is not displayed.");

		}
	}

}