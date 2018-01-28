package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.action.Browser;
import com.action.Const;
import com.action.GenricMethod;



public class SginIn extends GenricMethod 
{
	@FindBy(xpath="//*[text()='Sign in']")
	WebElement signin;
	
	@FindBy(id="uname")
	WebElement username;
	
	@FindBy(id="pwd")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'COMPSIGN IN WITH EMAIL')]")
	WebElement clickonsignin;
	
	
	public void loginToAPP(String userNAme , String passwordd)
	{
			waitforpageToload();
			Browser.driver.get(Const.url);
			signin.click();
			
			 username.sendKeys(userNAme);
			 password.sendKeys(passwordd);
			 clickonsignin.click();
		 
		 
	}

}
