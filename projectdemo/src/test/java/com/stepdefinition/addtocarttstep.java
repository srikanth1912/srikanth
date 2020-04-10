package com.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Loginpager;
import com.pages.addtocarttpage;
import com.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addtocarttstep extends Library {
	Loginpager login;
	addtocarttpage acp;
	Utility util;
	final static Logger Logger=LogManager.getLogger(addtocarttstep.class.getName());

	
	@Given("^User launch Chrome Browser$")
	public void user_launch_Chrome_Browser() throws Throwable {
		launchApplication();
	}

	@When("^Page is opened$")
	public void page_is_opened() throws Throwable {
		login =new Loginpager(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickSubmit();
		
	    Thread.sleep(2000);
	    util=new Utility(driver);
		util.takeSnapShot("E:\\srikanth\\ecl\\projectdemo\\src\\test\\resources\\screenshot\\addtocart.png");

	}

	@Then("^Add items to cart$")
	public void add_items_to_cart() throws Throwable {
		acp=new addtocarttpage(driver);
		acp.select();
		acp.gotocart();
		Logger.info("cart is clicked");


	}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
	    }



}
