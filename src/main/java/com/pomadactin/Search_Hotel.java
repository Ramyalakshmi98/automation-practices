package com.pomadactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel;
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement room;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement roomno;
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement datein;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement dateout;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child;
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;
	public Search_Hotel(WebDriver Search_Hotel) {
		this.driver=Search_Hotel;
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
}
