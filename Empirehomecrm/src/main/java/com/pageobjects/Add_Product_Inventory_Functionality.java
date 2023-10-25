package com.pageobjects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.base.Basetest;
import com.utils.utils;

public class Add_Product_Inventory_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Inventory']")
	WebElement clickInventory;

	@FindBy(xpath = "//a[normalize-space()='Add Inventory']")
	WebElement clickAddInventory;

	@FindBy(xpath = "//span[@id='select2-catDD-container']")
	WebElement clickdropdown;


	@FindBy(xpath = "//input[@role='textbox']")
	WebElement clicktext;

	@FindBy(name = "ModelNumber")
	WebElement textbox3;

	@FindBy(name = "Title")
	WebElement textbox4;

	@FindBy(name = "ItemDescription")
	WebElement textbox5;

	@FindBy(name = "Height")
	WebElement textbox6;

	@FindBy(name = "Width")
	WebElement textbox7;

	@FindBy(name = "Breadth")
	WebElement textbox8;

	@FindBy(name = "ColorName")
	WebElement textbox9;

	@FindBy(xpath = "//input[@id='actual'] ")
	WebElement textbox10;

	@FindBy(xpath = "//*[@id=\"lobicard-custom-control1\"]/div[2]/form/div[1]/div[17]/div/span/span[1]/span")
	WebElement clickbox11;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textbox12;

	@FindBy(name = "Qty")
	WebElement textbox13;

	@FindBy(xpath = "//input[@name='ProductMainImageUploaded']")
	WebElement textbox14;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement textbox15;


	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement textbox16;
	

	@FindBy(xpath = "//button[normalize-space()='Search']")
	WebElement textbox17;
	
	@FindBy(xpath  = "//h1[contains(text(),'All Inventory - Total :')]")
	WebElement AssertJUnitEdit;
	public Add_Product_Inventory_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void verifyAddInventorypage(String ModelNumber, String Title, String ItemDescription, String Height,
			String Width, String Breadth, String ColorName, String ActualPrice, String textMRP, String Qty)
			throws Throwable {

		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickInventory.click();
		Thread.sleep(2000);
		clickAddInventory.click();
		Thread.sleep(2000);
		clickdropdown.click();
		Thread.sleep(2000);

		clicktext.sendKeys(prop.getProperty("text"));
		utils.Robot();
		textbox3.clear();
		textbox3.sendKeys(ModelNumber);

		textbox4.clear();
		textbox4.sendKeys(Title);

		textbox5.clear();
		textbox5.sendKeys(ItemDescription);

		textbox6.clear();
		textbox6.sendKeys(Height);

		textbox7.clear();
		textbox7.sendKeys(Width);

		textbox8.clear();
		textbox8.sendKeys(Breadth);

		textbox9.clear();
		textbox9.sendKeys(ColorName);
		Thread.sleep(2000);
		textbox10.clear();
		textbox10.sendKeys(ActualPrice);

		clickbox11.click();
		Thread.sleep(2000);

		textbox12.sendKeys(textMRP);
		utils.Robot();
		Thread.sleep(2000);
		textbox13.clear();
		textbox13.sendKeys(Qty);
		Thread.sleep(2000);
		utils.clickElementWithJavascript(textbox14, driver);
		Thread.sleep(2000);
		utils.file();
		utils.Robot();
		Thread.sleep(2000);
		textbox15.click();
		Thread.sleep(2000);
		textbox16.sendKeys(prop.getProperty("search"));
		Thread.sleep(2000);
		textbox17.click();//search button
	}
	
	// AssertMessages
	public void AddInventory_AssertMessage() {

		if (AssertJUnitEdit.isDisplayed()) {
			System.out.println("AddInventory Element is displayed." + AssertJUnitEdit.getText());
			AssertJUnit.assertTrue("AddInventory Element is displayed.", true);
		
		} else {
			System.out.println("AddInventory Element is not displayed.");
			AssertJUnit.fail("AddInventory Element is not displayed.");

}
	}
}