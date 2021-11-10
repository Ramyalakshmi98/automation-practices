package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public WebDriver driver;
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;
	public Payment(WebDriver payment) {
		this.driver =payment;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getBank() {
		return bank;
	}
	
}
