package com.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pom.Home_Page;
import com.pomadactin.Booking_Now;
import com.pomadactin.Check_Book;
import com.pomadactin.Continue_Book;
import com.pomadactin.Login;
import com.pomadactin.Search_Hotel;

public class Runner_Adactin1 extends Base_Class {
		public static WebDriver driver = Base_Class.getBrowser("chrome");
		public static Booking_Now booknow  = new Booking_Now (driver);
		public static Check_Book checkbook = new Check_Book(driver);
		public static Continue_Book continuebook  = new Continue_Book(driver);
		public static Login login = new Login(driver);
		public static Search_Hotel searchhotel = new Search_Hotel(driver);
		public static void main(String[] args) throws InterruptedException {
			//driver = getBrowser("chrome");
			implictly();
			getUrl("https://adactinhotelapp.com/index.php");
			maximize();
		sendkey(login.getUsername(), "Ramalakshmi");
		sendkey(login.getPassword(), "rams1998");
		clickOnElement(login.getLogin());
		dropdown(searchhotel.getLocation(), "Sydney", "byVisibleText");
		dropdown(searchhotel.getHotel(), "Hotel Creek", "byVisibleText");
		dropdown(searchhotel.getRoom(), "Standard", "byVisibleText");
		dropdown(searchhotel.getRoomno(), "2 - Two", "byVisibleText");
		//datein.clear();
		sendkey(searchhotel.getDatein(), "28/10/2021");
		//dateout.clear();
		sendkey(searchhotel.getDateout(), "29/10/2021");
		dropdown(searchhotel.getAdult(), "2 - Two", "byVisibleText");
		dropdown(searchhotel.getChild(), "2", "byValue");
		clickOnElement(searchhotel.getSearch());
	clickOnElement(continuebook.getRadio());
	clickOnElement(continuebook.getContinue1());
		    sendkey(booknow.getFirstname(), "Ramya");	
		sendkey(booknow.getLastname(), "Mariappa");
		sendkey(booknow.getBillingaddress(), "5/192 Thiru.v.k St,Chennai");
		sendkey(booknow.getCardno(), "1212121212121212");
		dropdown(booknow.getCardtype(), "American Express", "byVisibleText");
		dropdown(booknow.getCardexp(), "January", "byVisibleText");
		dropdown(booknow.getCardexpyear(), "2022", "byVisibleText");
		sendkey(booknow.getCvv(), "123");
		clickOnElement(booknow.getBooknow());
	   clickOnElement(checkbook.getClick1());
	   clickOnElement(checkbook.getCheckall());


}
	}

