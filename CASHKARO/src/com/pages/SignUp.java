package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.action.Browser;
import com.action.Const;
import com.action.GenricMethod;

public class SignUp extends GenricMethod 
{
	
	
	@FindBy(id="firstname")
	WebElement username;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="con_email")
	WebElement conemail;
	
	@FindBy(id="pwd-txt")
	WebElement choosepassword;
	@FindBy(xpath="//div[contains(text(),'SIGN UP')]")
	WebElement clickonsignup;
	
	
	
	public void signinToAPP(String userNAme , String email,String confemail,String chosepass)
	{
			waitforpageToload();
			
			clickonsignup.click();
			
			 username.sendKeys(userNAme);
			 emailid.sendKeys(email);
			 conemail.sendKeys(confemail);
			 choosepassword.sendKeys(chosepass);
			 
			 clickonsignup.click();
		 
		 
	}

}
