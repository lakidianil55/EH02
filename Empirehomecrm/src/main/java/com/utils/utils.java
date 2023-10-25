package com.utils;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class utils {

	private static WebDriver driver;

	public static String[][] Data(String sheetname1) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\DELL\\git\\EmpireHome_Crm_05\\Empirehomecrm\\src\\main\\java\\com\\testdata\\EmpireHome_Date0205.xlsx");
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet1 = workbook.getSheet(sheetname1);

		int rowCount = sheet1.getLastRowNum();
		int colCount = sheet1.getRow(1).getLastCellNum();
		String[][] data = new String[rowCount][colCount];
		DataFormatter dataFormatter = new DataFormatter();
		for (int i = 1; i <= rowCount; i++) {
			Row row = sheet1.getRow(i);
			if (row != null) {
				for (int j = 0; j < colCount; j++) {
					Cell cell = row.getCell(j);
					if (cell != null) {

						data[i - 1][j] = dataFormatter.formatCellValue(cell);

					}

				}
			}
		}
		return data;

	}

	public static void clickElementWithJavascript(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void Robot() throws Throwable {
		java.awt.Robot R = new java.awt.Robot();
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		R.keyPress(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_V);
		R.keyRelease(KeyEvent.VK_CONTROL);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void AM() throws Throwable {
		java.awt.Robot R = new java.awt.Robot();

		R.keyPress(KeyEvent.VK_A);
		R.keyRelease(KeyEvent.VK_A);
	}

	public static void PM() throws Throwable {
		java.awt.Robot R = new java.awt.Robot();
		R.keyPress(KeyEvent.VK_P);
		R.keyRelease(KeyEvent.VK_P);
	}
	
	public static void drop() throws Throwable {
		java.awt.Robot R = new java.awt.Robot();
		R.keyPress(KeyEvent.VK_B);
		R.keyRelease(KeyEvent.VK_B);
	}
	
	public static void drop1() throws Throwable {
		java.awt.Robot R = new java.awt.Robot();
		R.keyPress(KeyEvent.VK_S);
		R.keyRelease(KeyEvent.VK_S);
	}
	
	public static void file() throws Throwable {
		StringSelection selection = new StringSelection("\"C:\\Users\\DELL\\OneDrive\\Pictures\\chair.jfif\"");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	}

	public static void Dropdown(WebElement value, String index) {
		Select s = new Select(value);
		s.selectByValue(index);

	}

	public static void Dropdown1(WebElement value, int index) {
		Select s = new Select(value);
		s.selectByIndex(index);

	}
	public static void waitForElementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);

	}

	public static void Actions(WebElement element) {
		org.openqa.selenium.interactions.Actions a = new org.openqa.selenium.interactions.Actions(driver);
		a.moveToElement(element).click().build().perform();
	}

	public static void wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	  

	    public static void captureAndSaveScreenshot(WebDriver driver, String destFilePath) {
	        try {
	            TakesScreenshot screenshot = (TakesScreenshot) driver;
	            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
	            File destFile = new File(destFilePath);
	            FileUtils.copyFile(srcFile, destFile);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	


