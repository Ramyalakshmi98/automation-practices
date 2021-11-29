package com.singleton_adactin;

import org.openqa.selenium.WebDriver;

import com.pom.Addtocart;
import com.pomadactin.Booking_Now;
import com.pomadactin.Check_Book;
import com.pomadactin.Continue_Book;
import com.pomadactin.Login;
import com.pomadactin.Search_Hotel;

public class Page_Object_Manager_Adactin {
	public WebDriver driver;
	private Booking_Now booking;
	
	public Booking_Now getbooking() {
		if (booking == null) {
			booking = new Booking_Now(driver);
		}
		return booking;
	}
	private Check_Book checkbook;
	public Check_Book getcheckbook() {
		if (checkbook == null) {
			checkbook = new Check_Book(driver);
		}
		return checkbook;
	}
	private Continue_Book continuebook;
	public Continue_Book getcontinuebook() {
		if (continuebook == null) {
			continuebook = new Continue_Book(driver);
		}
		return continuebook;
	}
	private Login login;
	public Login getlogin() {
		if (login == null) {
			login = new Login(driver);
		}
		return login;
	}
	private Search_Hotel searchhotel;
	public Search_Hotel getsearchhotel() {
		if (searchhotel == null) {
			searchhotel = new Search_Hotel(driver);
		}
		return searchhotel;
	}
//	 public Page_Object_Manager_Adactin() (WebDriver driver2) {
//		this.driver = driver2;
//	}
	public Page_Object_Manager_Adactin(WebDriver driver2) {
		this.driver = driver2;
	}


}
