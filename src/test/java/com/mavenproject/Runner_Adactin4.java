package com.mavenproject;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.properties_adactin.File_Reader_Adactin;
import com.singleton_adactin.Page_Object_Manager_Adactin;

public class Runner_Adactin4 extends Base_Class {
	
	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Page_Object_Manager_Adactin pom=new Page_Object_Manager_Adactin(driver);
	static Logger log=Logger.getLogger(Runner_Adactin4.class);
	public static void main(String[] args) throws InterruptedException, IOException {
		PropertyConfigurator.configure("log4j.properties");
		implictly();
		log.info("step to url");
		String Url=File_Reader_Adactin.getFRA().getCRA().getUrl();
		getUrl(Url);
		maximize();
		String username=File_Reader_Adactin.getFRA().getCRA().getusername();
		sendkey(pom.getlogin().getUsername(),username );
		String password=File_Reader_Adactin.getFRA().getCRA().getpassword();
		sendkey(pom.getlogin().getPassword(),password );
		clickOnElement(pom.getlogin().getLogin());
		String location=File_Reader_Adactin.getFRA().getCRA().getlocation();
	dropdown(pom.getsearchhotel().getLocation(),location , "byVisibleText");
	String hotel=File_Reader_Adactin.getFRA().getCRA().gethotel();
	dropdown(pom.getsearchhotel().getHotel(),hotel , "byVisibleText");
	String room=File_Reader_Adactin.getFRA().getCRA().getroom();
	dropdown(pom.getsearchhotel().getRoom(),room , "byVisibleText");
	String roomno=File_Reader_Adactin.getFRA().getCRA().getroomno();
	dropdown(pom.getsearchhotel().getRoomno(),roomno , "byVisibleText");
	//datein.clear();
	String datein=File_Reader_Adactin.getFRA().getCRA().getdatein();
	sendkey(pom.getsearchhotel().getDatein(), datein);
	//dateout.clear();
	String dateout=File_Reader_Adactin.getFRA().getCRA().getdateout();
	sendkey(pom.getsearchhotel().getDateout(),dateout );
	String adult=File_Reader_Adactin.getFRA().getCRA().getadult();
	dropdown(pom.getsearchhotel().getAdult(),adult , "byVisibleText");
	String child=File_Reader_Adactin.getFRA().getCRA().getchild();
	dropdown(pom.getsearchhotel().getChild(),child , "byValue");

	clickOnElement(pom.getsearchhotel().getSearch());
clickOnElement(pom.getcontinuebook().getRadio());
clickOnElement(pom.getcontinuebook().getContinue1());
String getFname=File_Reader_Adactin.getFRA().getCRA().getgetFname();
sendkey(pom.getbooking().getFirstname(),getFname );	
String getLname=File_Reader_Adactin.getFRA().getCRA().getgetLname();
sendkey(pom.getbooking().getLastname(), getLname);
String address=File_Reader_Adactin.getFRA().getCRA().getaddress();
sendkey(pom.getbooking().getBillingaddress(),address );
String cno=File_Reader_Adactin.getFRA().getCRA().getcno();
sendkey(pom.getbooking().getCardno(), cno);
String cdetail=File_Reader_Adactin.getFRA().getCRA().getcdetail();
dropdown(pom.getbooking().getCardtype(), cdetail, "byVisibleText");
String cexp=File_Reader_Adactin.getFRA().getCRA().getcexp();
dropdown(pom.getbooking().getCardexp(), cexp, "byVisibleText");
String cyr=File_Reader_Adactin.getFRA().getCRA().getcyr();
dropdown(pom.getbooking().getCardexpyear(), cyr, "byVisibleText");
String cvvnos=File_Reader_Adactin.getFRA().getCRA().getcvvnos();
sendkey(pom.getbooking().getCvv(), cvvnos);
	clickOnElement(pom.getbooking().getBooknow());
   clickOnElement(pom.getcheckbook().getClick1());
   clickOnElement(pom.getcheckbook().getCheckall());
	}


}
