package com.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Loginpager;
import com.pages.continueshoppingpage;
import com.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class continueshoppingstep extends Library {
	Loginpager login;
	continueshoppingpage cp;
	Utility util;
	final static Logger Logger=LogManager.getLogger(addtocarttstep.class.getName());

	
	@Given("^User Launch Chrome Browser$")
	public void user_Launch_Chrome_Browser() throws Throwable {
	   launchApplication();
	}

	@When("^page is opened$")
	public void page_is_opened() throws Throwable {
		login =new Loginpager(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickSubmit();
		
	    Thread.sleep(2000);
	    util=new Utility(driver);
		util.takeSnapShot("E:\\srikanth\\ecl\\projectdemo\\src\\test\\resources\\screenshot\\continueshopping.png");
		Thread.sleep(2000);

	}

	@Then("^Add items to the cart$")
	public void add_items_to_the_cart() throws Throwable {
		cp=new continueshoppingpage(driver);
		cp.select();
		cp.gotocart();
		Thread.sleep(2000);

	}

	@Then("^Continue shopping$")
	public void continue_shopping() throws Throwable {
		cp.continueshop();
		Thread.sleep(2000);
		Logger.info("continue is clicked");
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	   
	}


}
