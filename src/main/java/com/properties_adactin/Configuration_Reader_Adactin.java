package com.properties_adactin;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader_Adactin {
	public static Properties pr;

	public Configuration_Reader_Adactin() throws IOException {

		File f = new File(
				"C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\property_adactin\\adactinproperty.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);

	}

	public String getUrl() {
		String Url = pr.getProperty("Url");
		return Url;
	}

	public String getusername() {
		String username = pr.getProperty("username");
		return username;
	}

	public String getpassword() {
		String password = pr.getProperty("password");
		return password;
	}

	public String getlocation() {
		String location = pr.getProperty("location");
		return location;
	}

	public String gethotel() {
		String hotel = pr.getProperty("hotel");
		return hotel;
	}

	public String getroom() {
		String room = pr.getProperty("room");
		return room;
	}

	public String getroomno() {
		String roomno = pr.getProperty("roomno");
		return roomno;
	}

	public String getdatein() {
		String datein = pr.getProperty("datein");
		return datein;
	}

	public String getdateout() {
		String dateout = pr.getProperty("dateout");
		return dateout;
	}

	public String getadult() {
		String adult = pr.getProperty("adult");
		return adult;
	}

	public String getchild() {
		String child = pr.getProperty("child");
		return child;
	}

	public String getgetFname() {
		String getFname = pr.getProperty("getFname");
		return getFname;
	}
	public String getgetLname() {
		String getLname = pr.getProperty("getLname");
		return getLname;
	}
	public String getaddress() {
		String address = pr.getProperty("address");
		return address;
	}
	public String getcno() {
		String cno = pr.getProperty("cno");
		return cno;
	}
	public String getcdetail() {
		String cdetail = pr.getProperty("cdetail");
		return cdetail;
	}
	public String getcexp() {
		String cexp = pr.getProperty("cexp");
		return cexp;
	}
	public String getcyr() {
		String cyr = pr.getProperty("cyr");
		return cyr;
	}

	public String getcvvnos() {
		String cvvnos = pr.getProperty("cvvnos");
		return cvvnos;
	}

}
