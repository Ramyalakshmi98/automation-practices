package com.mavenproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static String stringCellValue;
public static WebDriver driver;
	
	public static WebDriver getBrowser(String method) {
		if (method.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			driver =  new ChromeDriver();
		}
		else if(method.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//gecko.exe");
			driver =  new FirefoxDriver();
			
		}
		return driver;
		}

		public static void clickOnElement(WebElement element){
			element.click();
	}
	public static void sendkey(WebElement element ,String value) {
       element.sendKeys(value);
	}
public static void implictly() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

}
public static void thread() throws InterruptedException {
	Thread.sleep(3000);
	
}
public static void javascript()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,500)"," ");
	
}
public static void getUrl(String url) {
	driver.get(url);
}
public static void dropdown(WebElement element,String value,String type) {
	Select s=new Select(element);
	if(type.equalsIgnoreCase("byVisibleText")) {
		s.selectByVisibleText(value);
	}
	else if(type.equalsIgnoreCase("byValue")) {
		s.selectByValue(value);
	}
	else if (type.equalsIgnoreCase("byIndex")) {
		int a= Integer.parseInt(value);
		s.selectByIndex(a);
		
	}
}
public static void maximize() {
	driver.manage().window().maximize();
	
}
public static   String readdata(String path,int row,int column) throws IOException {
	File f = new File(path);
	FileInputStream fi = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fi);
	Sheet sheetAt = wb.getSheetAt(0);
	Row row1 = sheetAt.getRow(row);
	Cell cell = row1.getCell(column);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		 stringCellValue = cell.getStringCellValue();

	} else if (cellType.equals(CellType.NUMERIC)) {
		double numericCellValue = cell.getNumericCellValue();
		int data = (int) numericCellValue;
	   stringCellValue = cell.getStringCellValue();
		
	}
	return stringCellValue;

}

}
