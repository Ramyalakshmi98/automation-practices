package com.testng_feature;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mavenproject.Base_Class;
import com.mavenproject.Runner3;
import com.properties.File_Reader;
import com.singleton_design_pattern.Page_Object_Manager;

public class Automation_TestNg extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	static Logger log = Logger.getLogger(Runner3.class);
	@Test(priority = -1,groups = "signin")
	private void url() throws IOException {

	
	PropertyConfigurator.configure("log4j.properties");
		implictly();
		log.info("step to automation url");
		String url=File_Reader.getFR().getCR().geturl();
		getUrl(url);
		maximize();
		}
	@Test(priority = 0,groups = "signin")
	private void signin() throws IOException {

	
		clickOnElement(pom.gethome_Page().getSignin1());
		String readdata = readdata("C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\Automation Testing.xlsx", 7, 5);
		sendkey(pom.getsignin().getEmail(), readdata);
		String readdata1 = readdata("C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\Automation Testing.xlsx", 8, 5);
		sendkey(pom.getsignin().getPasswd(), readdata1);
		clickOnElement(pom.getsignin().getSubmit());
	}
	@Test(priority =1 ,groups="women")
	private void women() throws IOException {

	
		clickOnElement(pom.getwomen().getWomen());
		javascript();
		String women=File_Reader.getFR().getCR().getwomen();
		dropdown(pom.getwomen().getSelectproductsort(), women,"byVisibleText");
		clickOnElement(pom.getwomen().getProductcontainer());
		clickOnElement(pom.getwomen().getMore());
	}
	@Test(priority = 2,groups = "women")
	private void addtocart() throws IOException {

	
		clickOnElement(pom.getadd().getQuantity());
		String group=File_Reader.getFR().getCR().getgroup();
		dropdown(pom.getadd().getGroup1(), group,"byIndex");
		clickOnElement(pom.getadd().getColour());
		clickOnElement(pom.getadd().getSubmit());
		clickOnElement(pom.getadd().getProceed());
	}
	@Test(priority = 3,groups = "booking")
	private void summary() {

	
		clickOnElement(pom.getsummary().getViewshopping());
		clickOnElement(pom.getsummary().getSummary());
			clickOnElement(pom.getsummary().getProcessaddress());
	}
	@Test(priority = 4,groups = "booking")
	private void check() {

	
		clickOnElement(pom.getprocesscarrier().getCheck());
		clickOnElement(pom.getprocesscarrier().getProcesscarrier());
	}
	@Test(priority = 5,groups = "booking",timeOut = 50000)
	private void confirm() throws InterruptedException {

	
		clickOnElement(pom.getpayment().getBank());
		clickOnElement(pom.getconfirm().getConfirm());
		thread();
	}
	
	@Test(priority =6,groups = "againback" )
	private void backorder() {

	
		clickOnElement(pom.getbackorder().getBackorder());
	}
	@Test(priority = 7,groups = "againback")
	private void logout() {

	
		clickOnElement(pom.getbackorder().getLogout());
	}

}


