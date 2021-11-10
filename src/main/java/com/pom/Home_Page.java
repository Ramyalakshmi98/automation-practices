package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
public Home_Page(WebDriver home) {
	this.driver=home;
	
	PageFactory.initElements(driver, this);
	}
public WebDriver getDriver() {
	return driver;
}
public WebElement getSignin1() {
	return signin1;
}
public WebDriver driver;
@FindBy(xpath="//a[@class='login']")
private WebElement signin1;



}

