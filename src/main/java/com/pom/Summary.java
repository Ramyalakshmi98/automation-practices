package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;
	@FindBy(xpath ="//a[@title='View my shopping cart']" )
	private WebElement viewshopping;
	@FindBy(xpath = "(//span)[65]")
	private WebElement summary;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getViewshopping() {
		return viewshopping;
	}
	public WebElement getSummary() {
		return summary;
	}
	public WebElement getProcessaddress() {
		return processaddress;
	}
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement processaddress;
	public Summary(WebDriver summary) {
this.driver=summary;
PageFactory.initElements(driver, this);
	}
	
}
