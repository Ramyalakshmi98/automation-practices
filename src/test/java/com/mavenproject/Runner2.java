package com.mavenproject;

import org.openqa.selenium.WebDriver;

import com.singleton_design_pattern.Page_Object_Manager;

public class Runner2 extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	public static void main(String[] args) throws InterruptedException {
		implictly();
		getUrl("http://automationpractice.com/index.php");
		maximize();
		clickOnElement(pom.gethome_Page().getSignin1());
		sendkey(pom.getsignin().getEmail(), "ramsmca98@gmail.com");
		sendkey(pom.getsignin().getPasswd(), "Ramalakshmi");
		clickOnElement(pom.getsignin().getSubmit());
		clickOnElement(pom.getwomen().getWomen());
		javascript();
		dropdown(pom.getwomen().getSelectproductsort(), "Price: Lowest first","byVisibleText");
		clickOnElement(pom.getwomen().getProductcontainer());
		clickOnElement(pom.getwomen().getMore());
		clickOnElement(pom.getadd().getQuantity());
		dropdown(pom.getadd().getGroup1(),"2","byIndex");
		clickOnElement(pom.getadd().getColour());
		clickOnElement(pom.getadd().getSubmit());
		clickOnElement(pom.getadd().getProceed());
		clickOnElement(pom.getsummary().getViewshopping());
		clickOnElement(pom.getsummary().getSummary());
		clickOnElement(pom.getsummary().getProcessaddress());
		clickOnElement(pom.getprocesscarrier().getCheck());
		clickOnElement(pom.getprocesscarrier().getProcesscarrier());
		clickOnElement(pom.getpayment().getBank());
		clickOnElement(pom.getconfirm().getConfirm());
		clickOnElement(pom.getbackorder().getBackorder());
		clickOnElement(pom.getbackorder().getLogout());
	}

}
