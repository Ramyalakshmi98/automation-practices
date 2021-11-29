package com.mavenproject;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.properties.File_Reader;
import com.singleton_design_pattern.Page_Object_Manager;
public class Runner3 extends Base_Class {
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	static Logger log = Logger.getLogger(Runner3.class);
	public static void main(String[] args) throws InterruptedException, Throwable {
		PropertyConfigurator.configure("log4j.properties");
		implictly();
		log.info("step to automation url");
		String url=File_Reader.getFR().getCR().geturl();
		getUrl(url);
		maximize();
		clickOnElement(pom.gethome_Page().getSignin1());
		String readdata = readdata("C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\Automation Testing.xlsx", 7, 5);
		sendkey(pom.getsignin().getEmail(), readdata);
		String readdata1 = readdata("C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\Automation Testing.xlsx", 8, 5);
		sendkey(pom.getsignin().getPasswd(), readdata1);
		clickOnElement(pom.getsignin().getSubmit());
		clickOnElement(pom.getwomen().getWomen());
		javascript();
		String women=File_Reader.getFR().getCR().getwomen();
		dropdown(pom.getwomen().getSelectproductsort(), women,"byVisibleText");
		clickOnElement(pom.getwomen().getProductcontainer());
		clickOnElement(pom.getwomen().getMore());
		clickOnElement(pom.getadd().getQuantity());
		String group=File_Reader.getFR().getCR().getgroup();
		dropdown(pom.getadd().getGroup1(), group,"byIndex");
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
