package com.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Loginpager;
import com.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class loginstep extends Library {
	Loginpager lp;
	Utility util;
	final static Logger Logger=LogManager.getLogger(addtocarttstep.class.getName());

	
	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
		launchApplication();
	}

	@When("^Login Saucedemo page opened$")
	public void login_Saucedemo_page_opened() throws Throwable {
		
	    
	    util=new Utility(driver);
		util.takeSnapShot("E:\\srikanth\\ecl\\projectdemo\\src\\test\\resources\\screenshot\\login.png");

	}

	@When("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
		lp=new Loginpager(driver);
	    lp.setUserName(email);
	    lp.setPassword(password);
	    
	}

	@When("^click on Login$")
	public void click_on_Login() throws Throwable {
		lp.clickSubmit();
		Logger.info("login is clicked");
	}

	@When("^Close Browser$")
	public void close_Browser() throws Throwable {
		
	    
	}

	
}
