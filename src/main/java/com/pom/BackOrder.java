package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackOrder {
	public BackOrder(WebDriver backorder) {
		this.driver=backorder;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getBackorder() {
		return backorder;
	}
	public WebDriver driver;
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement backorder;
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	
	
}
