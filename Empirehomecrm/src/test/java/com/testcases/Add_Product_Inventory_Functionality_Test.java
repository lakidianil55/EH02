package com.testcases;

import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.base.Basetest;
import com.pageobjects.Add_Product_Inventory_Functionality;
import com.pageobjects.LoginPage;

import com.utils.*;

public class Add_Product_Inventory_Functionality_Test extends Basetest {
	LoginPage login;
	Add_Product_Inventory_Functionality Addproduct;
	private final String sheetname1 = "AddProduct_Functionality";

	public Add_Product_Inventory_Functionality_Test() {
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
		Addproduct = new Add_Product_Inventory_Functionality();
	}

	@Test(dataProvider = "dataload", dataProviderClass = Add_Product_Inventory_Functionality_Test.class)

	public void Addproductvalidation(String ModelNumber, String Title, String ItemDescription, String Height,
			String Width, String Breadth, String ColorName, String ActualPrice, String textMRP, String Qty)
			throws Throwable {
		login.verifylogin();
		Addproduct.verifyAddInventorypage(ModelNumber, Title, ItemDescription, Height, Width, Breadth, ColorName,
				ActualPrice, textMRP, Qty);

		Addproduct.AddInventory_AssertMessage();

	}

	@AfterMethod
	public void teardown() {

	}

}
