package com.singleton_design_pattern;
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
public class Page_Object_Manager {
	public WebDriver driver;
	private Addtocart add;
	public Addtocart getadd() {
		if (add == null) {
			add = new Addtocart(driver);
		}
		return add;
	}
	private BackOrder backorder;
	public BackOrder getbackorder() {
		if (backorder == null) {
			backorder = new BackOrder(driver);
		}
		return backorder;
	}
	private Confirm confirm;
	public Confirm getconfirm() {
		if (confirm == null) {
			confirm = new Confirm(driver);
		}
		return confirm;
	}
	private Home_Page homepage;
	public Home_Page gethome_Page() {
		if (homepage == null) {
			homepage = new Home_Page(driver);
		}
		return homepage;
	}
	private Payment payment;
	public Payment getpayment() {
		if (payment == null) {
			payment = new Payment(driver);
		}
		return payment;
	}
	private ProcessCarrier processcarrier;
	public ProcessCarrier getprocesscarrier() {
		if (processcarrier == null) {
			processcarrier = new ProcessCarrier(driver);
		}
		return processcarrier;
	}
	private Signin signin;
	public Signin getsignin() {
		if (signin == null) {
			signin = new Signin(driver);
		}
		return signin;
	}
	private Summary summary;
	public Summary getsummary() {
		if (summary == null) {
			summary = new Summary(driver);
		}
		return summary;

	}
	private Women women;
	public Women getwomen() {
		if (women == null) {
			women = new Women(driver);
		}
		return women;
	}
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

}
