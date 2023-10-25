package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class LoginPage extends Basetest {

   @FindBy (xpath="//input[@placeholder='example@gmail.com']")   
   WebElement userid;
	
   @FindBy (name="pword")
   WebElement pass;
  
   
   @FindBy (xpath="//button[text()='Login']")
   WebElement loginbutton;
   
   public LoginPage() {           //constructor
	   
	   PageFactory.initElements(driver,this);
   }
   



public void LoginPage() {
	userid.sendKeys(prop.getProperty("username")); 
	   pass.sendKeys(prop.getProperty("password"));
	   loginbutton.click();
	
}




public void verifylogin() {
	userid.sendKeys(prop.getProperty("username")); 
	   pass.sendKeys(prop.getProperty("password"));
	   loginbutton.click();
	
	
}
   
	
}
