package com.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.Basetest;

import com.pageobjects.LoginPage;
import com.pageobjects.Stock_move_Functionality;
import com.utils.*;

public class Stock_Move_Functionality_Test extends Basetest {
	LoginPage login;
	Stock_move_Functionality StockMove;
	private final String sheetname1 = "StockMove_Functionality";

	public Stock_Move_Functionality_Test() {
		super();
	}

	@DataProvider

	public String[][] dataload() throws Throwable {
		return utils.Data(sheetname1);
	}

	@BeforeMethod
	public void setup() {

		initialization();

		login = new LoginPage();
		StockMove = new Stock_move_Functionality();
	}

	@Test(dataProvider = "dataload", dataProviderClass = Stock_Move_Functionality_Test.class)

	public void Stockmovevalidation(String References, String textbox, String MvingQty, String REReferences,
			String REtextbox, String REMovingQty) throws Throwable {
		login.verifylogin();
		StockMove.Stockmoveverify(References, textbox, MvingQty, REReferences, REtextbox, REMovingQty);
		

	}

	@AfterMethod
	public void teardown() {

	}

}
