package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessCarrier {
	public ProcessCarrier(WebDriver processcarrier) {
		this.driver=processcarrier;
		PageFactory.initElements(driver, this);
	}
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='cgv']")
	private WebElement check;
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement processcarrier;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getProcesscarrier() {
		return processcarrier;
	}

}
