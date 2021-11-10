package com.mavenproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
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
	Thread.sleep(1000);
	
}
public static void javascript()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scroll(0,500)"," ");
	
}
public static void getUrl(String url) {
	driver.get(url);
}
public static void select(WebElement size,String value) {
	Select sorts=new Select(size);
	sorts.selectByVisibleText(value);
	
	
	
}
public static void selectindex(WebElement size1,String i) {
	Select sizes = new Select(size1);
	sizes.selectByValue(i);


}
public static void maximize() {
	driver.manage().window().maximize();
	
}

}
