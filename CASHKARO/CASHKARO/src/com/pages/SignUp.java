package com.pages;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.action.Browser;
import com.action.Const;
import com.action.GenricMethod;

public class SignUp extends GenricMethod 
{
	
	@FindBy(xpath="//*[text()='Sign in']")
	WebElement signin;
	@FindBy(id="lnkLayoutSignUp")
	WebElement signup;
	
	@FindBy(id="firstname")
	WebElement username;
	
	@FindBy(id="email")
	WebElement emailid;
	
	@FindBy(id="con_email")
	WebElement conemail;
	
	@FindBy(id="pwd-txt")
	WebElement choosepassword;
	@FindBy(id="to_be_check")
	WebElement captch;
	
	@FindBy(id="join_free_submit")
	WebElement clickonsignup;
	
	
	
	public void signinToAPP(String userNAme , String email,String confemail,String chosepass)
	{
			waitforpageToload();
			
			signin.click();
			waitElementToapper(signup);
			signup.click();
			
			 username.sendKeys(userNAme);
			 emailid.sendKeys(email);
			 conemail.sendKeys(confemail);
			 choosepassword.sendKeys(chosepass);
			 Scanner sc=new Scanner(System.in);
			 System.out.println("give 1st int value");
			 int a=sc.nextInt();
			 System.out.println("give 1st int value");
			 int b=sc.nextInt();
			
			 int c=a+b;
			 String numberAsString = Integer.toString(c);
			 captch.sendKeys(numberAsString);
			 
			 clickonsignup.click();
		 
		 
	}

}
