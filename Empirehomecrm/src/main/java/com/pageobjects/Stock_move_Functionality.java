package com.pageobjects;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.base.Basetest;
import com.utils.utils;

public class Stock_move_Functionality extends Basetest {

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;

	@FindBy(xpath = "//span[normalize-space()='Inventory']")
	WebElement clickInventory;

	@FindBy(xpath = "//a[normalize-space()='Move Stock']")
	WebElement clickMoveStock;

	@FindBy(xpath = "//select[@id='movedFromD']")
	WebElement clicmovedFromD;

	@FindBy(xpath = "//select[@id='movedToD']")
	WebElement clicmovedToD;

	@FindBy(xpath = "//input[@id='MoStNot']")
	WebElement MoStNot;

	@FindBy(xpath = "//span[@id='select2-invId-container']")
	WebElement clickinvIdcontainer;

	@FindBy(xpath = "//input[@role='textbox']")
	WebElement textfiled;

	@FindBy(xpath = "//input[@id='qtymoving']")
	WebElement qtymoving;

	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement btnAdd;

	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement btnSave;

	@FindBy(xpath = "//div[@id='mydatatable_info']")
	WebElement AssertJUnit2;
	
	@FindBy(xpath = "//i[@class='fa fa-eye']")
	WebElement screenshot;
	
	
	
	public Stock_move_Functionality() {
		PageFactory.initElements(driver, this);

	}

	public void Stockmoveverify(String References, String textbox, String MovingQty, String REReferences,
			String REtextbox, String REMovingQty) throws Throwable {
		Thread.sleep(2000);
		clickkeypad.click();

		Thread.sleep(2000);
		clickInventory.click();

		Thread.sleep(2000);
		clickMoveStock.click();
		Thread.sleep(1000);
		utils.Dropdown1(clicmovedFromD, 0);

		Thread.sleep(2000);
		utils.Dropdown1(clicmovedToD, 1);
		Thread.sleep(2000);
		MoStNot.sendKeys(References);

		Thread.sleep(2000);
		clickinvIdcontainer.click();

		Thread.sleep(2000);
		textfiled.sendKeys(textbox);
		utils.Robot();

		Thread.sleep(2000);
		qtymoving.sendKeys(MovingQty);
		Thread.sleep(2000);
		btnAdd.click();

		Thread.sleep(2000);
		utils.clickElementWithJavascript(btnSave, driver);
		Thread.sleep(2000);
		driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
		Thread.sleep(2000);
		utils.Dropdown1(clicmovedFromD, 1);

		Thread.sleep(1000);
		utils.Dropdown1(clicmovedToD, 0);
		Thread.sleep(2000);
		
		MoStNot.sendKeys(REReferences);
		
		Thread.sleep(1000);
		clickinvIdcontainer.click();
		Thread.sleep(1000);
		textfiled.sendKeys(REtextbox);
		utils.Robot();
		Thread.sleep(2000);
		qtymoving.sendKeys(REMovingQty);
		Thread.sleep(2000);
		btnAdd.click();
		Thread.sleep(2000);
		utils.clickElementWithJavascript(btnSave, driver);
		Thread.sleep(2000);
		screenshot.click();
		Thread.sleep(2000);
		utils.captureAndSaveScreenshot(driver, "C:\\Users\\DELL\\git\\EmpireHome_Crm_05\\Empirehomecrm\\Screenshots.png");	
	}
	
				
}
