package com.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenricMethod 
{
	public void waitforpageToload()
	{
		Browser.driver.manage().timeouts().implicitlyWait
		(Const.time,TimeUnit.SECONDS);
		
	}
	public void waitElementToapper(WebElement wb)
	{
		WebDriverWait wd=new WebDriverWait
		(Browser.driver, Const.time);
		wd.until(ExpectedConditions.visibilityOf(wb));
	}
	public void maximize()
	{
		Browser.driver.manage().window().maximize();
	}
	

}
