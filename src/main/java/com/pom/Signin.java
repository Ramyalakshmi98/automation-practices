package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	public WebDriver driver;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPasswd() {
		return passwd;
	}
	public WebElement getSubmit() {
		return submit;
	}
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement passwd;
	@FindBy(xpath = "//button[@name='SubmitLogin']")
	private WebElement submit;
	public Signin(WebDriver signin) {
this.driver=signin;
PageFactory.initElements(driver, this);
	}
	
}
