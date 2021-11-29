package com.pomadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Check_Book {
	public WebDriver driver;
	public Check_Book(WebDriver Check_Book) {
		this.driver=Check_Book;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement click1;
	@FindBy(xpath="//input[@name='check_all']")
	private WebElement checkall;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getClick1() {
		return click1;
	}
	public WebElement getCheckall() {
		return checkall;
	}


	

}
