package com.mavenproject;

import org.openqa.selenium.WebDriver;

import com.pom.Addtocart;
import com.pom.BackOrder;
import com.pom.Confirm;
import com.pom.Home_Page;
import com.pom.Payment;
import com.pom.ProcessCarrier;
import com.pom.Signin;
import com.pom.Summary;
import com.pom.Women;

public class Runner1 extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Home_Page home = new Home_Page(driver);
	public static Signin signin = new Signin(driver);
	public static Women women = new Women(driver);
	public static Addtocart addtocart = new Addtocart(driver);
	public static Summary summary = new Summary(driver);
	public static ProcessCarrier processcarrier = new ProcessCarrier(driver);
	public static Payment payment = new Payment(driver);
	public static Confirm confirm = new Confirm(driver);
	public static BackOrder backorder = new BackOrder(driver);
	public static void main(String[] args) throws InterruptedException {
		implictly();
		getUrl("http://automationpractice.com/index.php");
		maximize();
		clickOnElement(home.getSignin1());
		sendkey(signin.getEmail(), "ramsmca98@gmail.com");
		sendkey(signin.getPasswd(), "Ramalakshmi");
		clickOnElement(signin.getSubmit());
		clickOnElement(women.getWomen());
		javascript();
		dropdown(women.getSelectproductsort(), "Price: Lowest first","byVisibleText");
		clickOnElement(women.getProductcontainer());
		clickOnElement(women.getMore());
		clickOnElement(addtocart.getQuantity());
		dropdown(addtocart.getGroup1(),"2","byIndex");
		clickOnElement(addtocart.getColour());
		clickOnElement(addtocart.getSubmit());
		clickOnElement(addtocart.getProceed());
		clickOnElement(summary.getViewshopping());
		clickOnElement(summary.getSummary());
		clickOnElement(summary.getProcessaddress());
		clickOnElement(processcarrier.getCheck());
		clickOnElement(processcarrier.getProcesscarrier());
		clickOnElement(payment.getBank());
		clickOnElement(confirm.getConfirm());
		clickOnElement(backorder.getBackorder());
		clickOnElement(backorder.getLogout());
	}
}



