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
	
	@FindBy(id="lnkLayoutFacebook")
	WebElement fb;
	
	@FindBy(id="btnLayoutSignIn")
	WebElement clickonsignin;
	
	@FindBy(id="lnkLayoutForgotPassword")
	WebElement forgetpass;
	
	@FindBy(xpath="//div[label[text()='Enter Email']]/div/input")
	WebElement fromemail;
	
	public void loginToAPP(String userNAme , String passwordd)
	{
			waitforpageToload();
			
			maximize();
			signin.click();
			username.sendKeys(userNAme);
			password.sendKeys(passwordd);
			clickonsignin.click();
		 
		 
	}
	public void loginByfb()
	{
		waitforpageToload();
		signin.click();
		
		waitElementToapper(fb);
		fb.click();
		
	}
	public void forgetpass(String email)
	{
		waitforpageToload();
		signin.click();
		forgetpass.click();
		fromemail.sendKeys(email);
		
	}

}
