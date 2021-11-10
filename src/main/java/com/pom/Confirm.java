package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {
	public WebDriver driver;
	@ FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement confirm;
	public Confirm(WebDriver confirm) {
		this.driver=confirm;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	

}
