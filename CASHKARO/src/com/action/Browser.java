package com.action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Browser 
{
public static WebDriver driver;
	
	public static WebDriver getBrowser()
	{
		if (Const.Browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\MNP CODE FILE\\mnp code file2"
					+ "\\FramWork\\Resourse\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else
		{
			 driver = new FirefoxDriver(); 
			
		}
		
		return driver;
	}


}
