package com.pomadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continue_Book {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='radiobutton_0' ]")
	private WebElement radio;
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continue1;
	public Continue_Book(WebDriver Continue_Book) {
		this.driver=Continue_Book;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinue1() {
		return continue1;
	}

		

}
