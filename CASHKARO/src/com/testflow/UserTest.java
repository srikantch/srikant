package com.testflow;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.action.Browser;
import com.pages.SginIn;
import com.pages.SignUp;



public class UserTest
{
	SginIn login;
	SignUp signup;
	WebDriver driver;
	@BeforeClass
	public void configBrowser() 
	{
		

		Reporter.log("lunch browser");
		driver=Browser.getBrowser();
		 Browser.driver.manage().window();
		login=PageFactory.initElements(driver, login.getClass());
		signup=PageFactory.initElements(driver, signup.getClass());
		
	}
	@Test
	public void test()
	{
		
	}
	
	
	

}
