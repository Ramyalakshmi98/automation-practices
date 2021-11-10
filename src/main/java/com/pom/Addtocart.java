package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	public Addtocart(WebDriver addtocart) {
		this.driver=addtocart;
		PageFactory.initElements(driver,this);
	}
	public WebDriver driver;
	@FindBy(xpath = "//a[@data-field-qty='qty'][2]")
	private WebElement quantity;
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement group1;
	@FindBy(xpath = "//a[@name='Blue']")
	private WebElement colour;
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement submit;
	@FindBy(xpath = "(//a[@rel='nofollow'])[5]")
	private WebElement proceed;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getQuantity() {
		return quantity;
	}
	public WebElement getGroup1() {
		return group1;
	}
	public WebElement getColour() {
		return colour;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getProceed() {
		return proceed;
	}

}
