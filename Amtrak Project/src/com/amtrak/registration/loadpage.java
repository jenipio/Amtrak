package com.amtrak.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class loadpage 
{
	public static WebDriver driver;
	public static String baseURL;
	public static wrapper wrap;
	public static void main(String args[])throws Exception
	{
		driver=new FirefoxDriver();
		baseURL ="http://Amtrak.com";
		wrap = new wrapper();

		wrap.loadURL(baseURL, driver);
		Thread.sleep(4000); 
		wrap.click("linktext", "Log in", driver);
		wrap.sendKeys("id","login_email_address", "jeni.btlgd@gmail.com", driver);
		Thread.sleep(2000);
		wrap.enterKeyvalue("id", "login_email_address", Keys.TAB, driver);
		wrap.sendKeys("id","login_password", "jenifer18", driver);
		Thread.sleep(2000);
		wrap.click("class","login_image", driver);
		Thread.sleep(7000);
		wrap.clearField(driver,"id", "departs");
		Thread.sleep(4000);
		wrap.sendKeys("id", "departs","Chica", driver);
		Thread.sleep(3000);
		wrap.enterKeyvalue("id", "departs", Keys.TAB, driver);
		
		
		
				
	}
}
