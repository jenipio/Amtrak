package com.amtrak.registration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wrapper 
{

	public boolean loadURL(String URL, WebDriver driver)
	{
		try
		{
			driver.navigate().to(URL);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}

	}
	public WebElement returnElement(String LocatorType, String LocatorValue, WebDriver driver)
	{
		WebElement element = null;
		if(LocatorType.equalsIgnoreCase("id"))
		{
			element = driver.findElement(By.id(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("name"))
		{
			element = driver.findElement(By.name(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("class"))
		{
			element = driver.findElement(By.className(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("css"))
		{
			element = driver.findElement(By.cssSelector(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("xpath"))
		{
			element = driver.findElement(By.xpath(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("linktext"))
		{
			element = driver.findElement(By.linkText(LocatorValue));
		}
		else if(LocatorType.equalsIgnoreCase("plink"))
		{
			element = driver.findElement(By.partialLinkText(LocatorValue));
		}		

		return (element);
	}
	public boolean sendKeys(String LocatorType, String LocatorValue, String ActualValue,WebDriver driver)
	{
		try
		{
			if(LocatorType.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("class"))
			{
				driver.findElement(By.className(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("css"))
			{
				driver.findElement(By.cssSelector(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("linktext"))
			{
				driver.findElement(By.linkText(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("plink"))
			{
				driver.findElement(By.partialLinkText(LocatorValue)).sendKeys(ActualValue);
			}
			else
			{
				System.out.println("Locator Type not valid");
			}
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}

	public boolean click(String LocatorType, String LocatorValue, WebDriver driver)
	{
		try
		{
			if(LocatorType.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(LocatorValue)).click();
			}
			else if(LocatorType.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(LocatorValue)).click();
			}
			else if(LocatorType.equalsIgnoreCase("class"))
			{
				driver.findElement(By.className(LocatorValue)).click();
			}
			else if(LocatorType.equalsIgnoreCase("css"))
			{
				driver.findElement(By.cssSelector(LocatorValue)).click();
			}
			else if(LocatorType.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(LocatorValue)).click();
			}
			else if(LocatorType.equalsIgnoreCase("linktext"))
			{
				driver.findElement(By.linkText(LocatorValue)).click();
			}
			else if(LocatorType.equalsIgnoreCase("plink"))
			{
				driver.findElement(By.partialLinkText(LocatorValue)).click();
			}
			else
			{
				System.out.println("Locator Type not valid");
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public boolean submit(String LocatorType, String LocatorValue, WebDriver driver)
	{
		try
		{
			if(LocatorType.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(LocatorValue)).submit();
			}
			else if(LocatorType.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(LocatorValue)).submit();
			}
			else if(LocatorType.equalsIgnoreCase("class"))
			{
				driver.findElement(By.className(LocatorValue)).submit();
			}
			else if(LocatorType.equalsIgnoreCase("css"))
			{
				driver.findElement(By.cssSelector(LocatorValue)).submit();
			}
			else if(LocatorType.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(LocatorValue)).submit();
			}
			else if(LocatorType.equalsIgnoreCase("linktext"))
			{
				driver.findElement(By.linkText(LocatorValue)).submit();
			}
			else if(LocatorType.equalsIgnoreCase("plink"))
			{
				driver.findElement(By.partialLinkText(LocatorValue)).submit();
			}
			else
			{
				System.out.println("Locator Type not valid");
			}
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public boolean enterKeyvalue(String LocatorType, String LocatorValue, Keys ActualValue,WebDriver driver)
	{
		try
		{
			if(LocatorType.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("class"))
			{
				driver.findElement(By.className(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("css"))
			{
				driver.findElement(By.cssSelector(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("linktext"))
			{
				driver.findElement(By.linkText(LocatorValue)).sendKeys(ActualValue);
			}
			else if(LocatorType.equalsIgnoreCase("plink"))
			{
				driver.findElement(By.partialLinkText(LocatorValue)).sendKeys(ActualValue);
			}
			else
			{
				System.out.println("Locator Type not valid");
			}
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}
	public boolean clearField(WebDriver driver,String LocatorType, String LocatorValue)
	{
		try
		{
			if(LocatorType.equalsIgnoreCase("id"))
			{
				driver.findElement(By.id(LocatorValue)).clear();
			}
			else if(LocatorType.equalsIgnoreCase("name"))
			{
				driver.findElement(By.name(LocatorValue)).clear();
			}
			else if(LocatorType.equalsIgnoreCase("class"))
			{
				driver.findElement(By.className(LocatorValue)).clear();
			}
			else if(LocatorType.equalsIgnoreCase("css"))
			{
				driver.findElement(By.cssSelector(LocatorValue)).clear();
			}
			else if(LocatorType.equalsIgnoreCase("xpath"))
			{
				driver.findElement(By.xpath(LocatorValue)).clear();
			}
			else if(LocatorType.equalsIgnoreCase("linktext"))
			{
				driver.findElement(By.linkText(LocatorValue)).clear();
			}
			else if(LocatorType.equalsIgnoreCase("plink"))
			{
				driver.findElement(By.partialLinkText(LocatorValue)).clear();
			}
			else
			{
				System.out.println("Locator Type not valid");
			}
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
	}
}



