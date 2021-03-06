package com.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_Adactin extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser("chrome");
		implictly();
//	System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\Galaxy\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
		getUrl("https://adactinhotelapp.com/index.php");
	//driver.get("https://adactinhotelapp.com/index.php");
		maximize();
//	driver.manage().window().maximize();
	//Thread.sleep(1000);
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	//username.sendKeys("Ramalakshmi");
	sendkey(username, "Ramalakshmi");
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	//password.sendKeys("rams1998");
	sendkey(password, "rams1998");
	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
	//login.click();
	clickOnElement(login);
	WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
//	Select locations = new Select(location);
//	locations.selectByVisibleText("Sydney");
	dropdown(location, "Sydney", "byVisibleText");
	WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
//	Select hotels = new Select(hotel);
//	hotels.selectByVisibleText("Hotel Creek");
	dropdown(hotel, "Hotel Creek", "byVisibleText");
	WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
//	Select rooms = new Select(room);
//	rooms.selectByVisibleText("Standard");
	dropdown(room, "Standard", "byVisibleText");
	WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
//	Select roomnos = new Select(roomno);
//	roomnos.selectByVisibleText("2 - Two");
	dropdown(roomno, "2 - Two", "byVisibleText");
	WebElement datein = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	datein.clear();
	sendkey(datein, "28/10/2021");
//	datein.sendKeys("28/10/2021");
	WebElement dateout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	dateout.clear();
	sendkey(dateout, "29/10/2021");
	//dateout.sendKeys("29/10/2021");
	WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
//	Select adults = new Select(adult);
//	adults.selectByVisibleText("2 - Two");
	dropdown(adult, "2 - Two", "byVisibleText");
	WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
//	Select childs = new Select(child);
//	childs.selectByValue("2");
	dropdown(child, "2", "byValue");
	WebElement search = driver.findElement(By.xpath("//input[@name='Submit']"));
	clickOnElement(search);
//	search.click();
	WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0' ]"));
clickOnElement(radio);
	//	radio.click();
	WebElement continue1 = driver.findElement(By.xpath("//input[@name='continue']"));
clickOnElement(continue1);
	//	continue1.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	//	firstname.sendKeys("Ramya");
sendkey(firstname, "Ramya");	
	WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
//	lastname.sendKeys("Mariappa");
	sendkey(lastname, "Mariappa");
	//Thread.sleep(1000);
	WebElement billingaddress = driver.findElement(By.xpath("//textarea[@name='address']"));
	//billingaddress.sendKeys("5/192 Thiru.v.k St,Chennai");
	sendkey(billingaddress, "5/192 Thiru.v.k St,Chennai");
	WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
	//cardno.sendKeys("1212121212121212");
	sendkey(cardno, "1212121212121212");
	WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
//	Select cardtypes = new Select(cardtype);
//	cardtypes.selectByVisibleText("American Express");
	dropdown(cardtype, "American Express", "byVisibleText");
	WebElement cardexp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
//	Select cardexps = new Select(cardexp);
//	cardexps.selectByVisibleText("January");
	dropdown(cardexp, "January", "byVisibleText");
	WebElement cardexpyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
//	Select cardexpyears = new Select(cardexpyear);
//	cardexpyears.selectByVisibleText("2022");
	dropdown(cardexpyear, "2022", "byVisibleText");
	WebElement cvv= driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	//cvv.sendKeys("123");
	sendkey(cvv, "123");
	WebElement booknow= driver.findElement(By.xpath("//input[@name='book_now']"));
	//booknow.click(); 
	clickOnElement(booknow);
	//Thread.sleep(5000);
   WebElement click1  = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
   //click1.click();
   clickOnElement(click1);
   WebElement checkall = driver.findElement(By.xpath("//input[@name='check_all']"));
//checkall.click();
   clickOnElement(checkall);

}
}

