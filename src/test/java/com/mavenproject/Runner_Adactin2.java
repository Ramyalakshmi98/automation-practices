package com.mavenproject;

import org.openqa.selenium.WebDriver;

import com.pomadactin.Booking_Now;
import com.pomadactin.Check_Book;
import com.pomadactin.Continue_Book;
import com.pomadactin.Login;
import com.pomadactin.Search_Hotel;
import com.singleton_adactin.Page_Object_Manager_Adactin;
import com.singleton_design_pattern.Page_Object_Manager;

public class Runner_Adactin2 extends Base_Class{
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager_Adactin pom=new Page_Object_Manager_Adactin(driver);
	public static void main(String[] args) throws InterruptedException {
		//driver = getBrowser("chrome");
		implictly();
		getUrl("https://adactinhotelapp.com/index.php");
		maximize();
		sendkey(pom.getlogin().getUsername(), "Ramalakshmi");
		sendkey(pom.getlogin().getPassword(), "rams1998");
		clickOnElement(pom.getlogin().getLogin());
	dropdown(pom.getsearchhotel().getLocation(), "Sydney", "byVisibleText");
	dropdown(pom.getsearchhotel().getHotel(), "Hotel Creek", "byVisibleText");
	dropdown(pom.getsearchhotel().getRoom(), "Standard", "byVisibleText");
	dropdown(pom.getsearchhotel().getRoomno(), "2 - Two", "byVisibleText");
	//datein.clear();
	sendkey(pom.getsearchhotel().getDatein(), "28/10/2021");
	//dateout.clear();
	sendkey(pom.getsearchhotel().getDateout(), "29/10/2021");
	dropdown(pom.getsearchhotel().getAdult(), "2 - Two", "byVisibleText");
	dropdown(pom.getsearchhotel().getChild(), "2", "byValue");
	clickOnElement(pom.getsearchhotel().getSearch());
clickOnElement(pom.getcontinuebook().getRadio());
clickOnElement(pom.getcontinuebook().getContinue1());
	    sendkey(pom.getbooking().getFirstname(), "Ramya");	
	sendkey(pom.getbooking().getLastname(), "Mariappa");
	sendkey(pom.getbooking().getBillingaddress(), "5/192 Thiru.v.k St,Chennai");
	sendkey(pom.getbooking().getCardno(), "1212121212121212");
	dropdown(pom.getbooking().getCardtype(), "American Express", "byVisibleText");
	dropdown(pom.getbooking().getCardexp(), "January", "byVisibleText");
	dropdown(pom.getbooking().getCardexpyear(), "2022", "byVisibleText");
	sendkey(pom.getbooking().getCvv(), "123");
	clickOnElement(pom.getbooking().getBooknow());
   clickOnElement(pom.getcheckbook().getClick1());
   clickOnElement(pom.getcheckbook().getCheckall());


}


}
