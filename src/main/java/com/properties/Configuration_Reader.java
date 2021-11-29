package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties pr;
public Configuration_Reader() throws IOException {
	
	File f= new File("C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\property\\Configuration.properties");
FileInputStream fi=new FileInputStream(f);
	pr=new Properties();
	pr.load(fi);
	
}
public String geturl() {
String url=pr.getProperty("url");
return url;
}
public String getemail() {
String email=pr.getProperty("email");
return email;
}
public String getpassword() {
String password=pr.getProperty("password");
return password;
}
public String getwomen() {
String women=pr.getProperty("women");
return women;
}
public String getgroup() {
	String group=pr.getProperty("group");
	return group;

}

}