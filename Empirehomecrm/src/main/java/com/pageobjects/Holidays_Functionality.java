package com.pageobjects;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.base.Basetest;

public class Holidays_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickMasters;

	@FindBy(xpath = "//a[normalize-space()='Holidays']")
	WebElement clickHolidays;

	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement clickAddNew;

	@FindBy(xpath = "//input[@name='HolidayDate']")
	WebElement HolidayDate;

	@FindBy(xpath = "//input[@id='HolidayName']")
	WebElement HolidayName;

	@FindBy(xpath = "//input[@id='HolidayDesc']")

	WebElement HolidayDesc;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement clickSave;

	@FindBy(xpath = ".//i[@class='fa fa-pencil']")
	WebElement EditButton;

	@FindBy(xpath = ".//i[@class='fa fa-trash-o']")
	WebElement DeleteButton;

	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clicyesbutton;

	@FindBy(xpath = ".//td[1]")
	List<WebElement> AssertJUnit1;

	public Holidays_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Holidaysverify(String TextHolidayDate, String TextHolidayName, String TextHolidayDesc,
			String REHolidayDate, String REHolidayName, String REHolidayDesc) throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickMasters.click();
		Thread.sleep(2000);
		clickHolidays.click();
		Thread.sleep(2000);
		clickAddNew.click();
		Thread.sleep(2000);
		HolidayDate.click();
		Thread.sleep(2000);

		HolidayDate.sendKeys(prop.getProperty("HolidayDate"));
		Thread.sleep(2000);

		HolidayName.sendKeys(TextHolidayName);
		Thread.sleep(2000);

		HolidayDesc.sendKeys(TextHolidayDesc);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		EditButton.click();
		Thread.sleep(2000);
		HolidayDate.clear();
		HolidayDate.sendKeys(prop.getProperty("REHolidayDate"));
		Thread.sleep(2000);
		HolidayName.clear();
		HolidayName.sendKeys(REHolidayName);
		Thread.sleep(2000);
		HolidayDesc.clear();
		HolidayDesc.sendKeys(REHolidayDesc);
		Thread.sleep(2000);
		clickSave.click();
		Thread.sleep(2000);
		DeleteButton.click();
		Thread.sleep(2000);
		clicyesbutton.click();

	}

	public void HolidaysAssertRows() {
		List<WebElement> rows = driver.findElements(By.xpath(".//td[normalize-space()='Vinayak Chaturthi']"));

		if (rows.isEmpty()) {
			Assert.fail("No rows found in the table.");
		} else {
			String expectedText = "Vinayak Chaturthi";

			for (WebElement row : rows) {
				String actualText = row.getText();
				System.out.println(actualText);

			}
		}

	}

}
