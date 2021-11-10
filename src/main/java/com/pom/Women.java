package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {
	public Women(WebDriver women) {
		this.driver=women;
		PageFactory.initElements(driver,this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getWomen() {
		return women;
	}
	public WebElement getSelectproductsort() {
		return selectproductsort;
	}
	public WebElement getProductcontainer() {
		return productcontainer;
	}
	public WebElement getMore() {
		return more;
	}
	public WebDriver driver;
	@FindBy(xpath = "//a[text()='Women']")
	private WebElement women;
	@FindBy(xpath = "//select[@id='selectProductSort']")
	private WebElement selectproductsort;
	@FindBy(xpath = "//div[@class='product-container']")
	private WebElement productcontainer;
	@FindBy(xpath = "//span[text()='More']")
	private WebElement more;
	

}
