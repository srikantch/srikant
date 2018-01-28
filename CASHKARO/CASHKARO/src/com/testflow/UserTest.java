package com.testflow;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.action.Browser;
import com.action.Const;
import com.action.Xlapi;
import com.pages.SginIn;
import com.pages.SignUp;



public class UserTest
{
	SginIn login;
	SignUp signup;
	WebDriver driver;
	Xlapi xl;
	@BeforeClass
	public void configBrowser() 
	{
		xl=new Xlapi();

		Reporter.log("lunch browser");
		driver=Browser.getBrowser();
		 Browser.driver.manage().window();
		login=PageFactory.initElements(driver, SginIn.class);
		signup=PageFactory.initElements(driver, SignUp.class);
		
	}
	@BeforeMethod
	public void befoeMethod()
	{
		Browser.driver.get(Const.url);
	}
	@Test(priority=0)
	public void sigin()
	{
		Reporter.log("sign in to app");
		
		login.loginToAPP(Const.username,Const.password);
		Reporter.log("mail send successfully");
		
	}
	@Test(priority=1)
	public void signFB()
	{
		Reporter.log("sign through fb");
		login.loginByfb();
	}
	@Test(priority=2)
	public void signUp() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Reporter.log("signUp to app");
		Reporter.log("get data from excell sheet");
		String fullname=xl.getdata("Sheet1",0,0);
		System.out.println(fullname);
		String email=xl.getdata("Sheet1",0,0);
		System.out.println(email);
		String pass=xl.getdata("Sheet1",0,0);
		System.out.println(pass);
		signup.signinToAPP(fullname, email, email, pass);
		
		
		
	}
	@Test()
	public void forgetPass() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Reporter.log("forget password");
		String eMail=xl.getdata("Sheet1",0,0);
		login.forgetpass(eMail);
		
	}

	

}
