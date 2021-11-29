package com.pomadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Now {
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBillingaddress() {
		return billingaddress;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getCardexp() {
		return cardexp;
	}
	public WebElement getCardexpyear() {
		return cardexpyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebDriver driver;

	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement billingaddress;
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cardno;
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardtype;
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement cardexp;
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement cardexpyear;
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvv;
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement booknow;
	public Booking_Now(WebDriver Booking_Now) {
		this.driver=Booking_Now;
		PageFactory.initElements(driver, this);
	}

	
}
