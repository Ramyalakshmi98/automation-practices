package com.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser("chrome");

		implictly();
		getUrl("http://automationpractice.com/index.php");
		maximize();
		WebElement signin1 = driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(signin1);

		WebElement maillogin = driver.findElement(By.xpath("//input[@id='email']"));
		sendkey(maillogin, "ramsmca98@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@name='passwd']"));
		sendkey(pass, "Ramalakshmi");

		WebElement button = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		clickOnElement(button);

		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		clickOnElement(women);

		javascript();

		WebElement sort = driver.findElement(By.xpath("//select[@id='selectProductSort']"));
		select(sort, "Price: Lowest first");

		WebElement quick = driver.findElement(By.xpath("//div[@class='product-container']"));
		clickOnElement(quick);

		WebElement more = driver.findElement(By.xpath("//span[text()='More']"));
		clickOnElement(more);

		WebElement addingcart = driver.findElement(By.xpath("//a[@data-field-qty='qty'][2]"));
		clickOnElement(addingcart);

		WebElement size2 = driver.findElement(By.xpath("//select[@id='group_1']"));
		selectindex(size2, "2");

		WebElement color = driver.findElement(By.xpath("//a[@name='Blue']"));
		clickOnElement(color);

		WebElement add = driver.findElement(By.xpath("//button[@name='Submit']"));
		clickOnElement(add);

		WebElement proceed = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
		clickOnElement(proceed);

		WebElement cart = driver.findElement(By.xpath("//a[@title='View my shopping cart']"));
		clickOnElement(cart);

		WebElement summary = driver.findElement(By.xpath("(//span)[65]"));
		clickOnElement(summary);

		WebElement button1 = driver.findElement(By.xpath("//button[@name='processAddress']"));
		clickOnElement(button1);

		WebElement check = driver.findElement(By.xpath("//input[@name='cgv']"));
		clickOnElement(check);

		WebElement button2 = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		clickOnElement(button2);

		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		clickOnElement(bank);

		WebElement confirms = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(confirms);

		WebElement backdata = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		clickOnElement(backdata);

		getUrl("http://automationpractice.com/index.php");

		WebElement signin = driver.findElement(By.xpath("//a[@rel='nofollow']"));
		clickOnElement(signin);

		WebElement signout = driver.findElement(By.xpath("//a[@class='logout']"));
		clickOnElement(signout);
	}

}
