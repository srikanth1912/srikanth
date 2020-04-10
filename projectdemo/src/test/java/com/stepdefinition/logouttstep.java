package com.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.baseclass.Library;

import com.pages.Loginpager;

import com.pages.logouttpage;
import com.utility.Utility;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logouttstep extends Library {
	Loginpager login;
	logouttpage log;
	Utility util;
	final static Logger Logger=LogManager.getLogger(addtocarttstep.class.getName());

	
	@Given("^Userr Launch Chrome Browserr$")
	public void userr_Launch_Chrome_Browserr() throws Throwable {
		launchApplication();

	}

	@When("^Page is openedd$")
	public void page_is_openedd() throws Throwable {
		login =new Loginpager(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickSubmit();
		
	    Thread.sleep(2000);
	    util=new Utility(driver);
		util.takeSnapShot("E:\\srikanth\\ecl\\projectdemo\\src\\test\\resources\\screenshot\\logout.png");


	}

	@Then("^Click on Menu$")
	public void click_on_Menu() throws Throwable {
		 log=new logouttpage(driver);
		    log.menu();
	}

	@Then("^select the logout$")
	public void select_the_logout() throws Throwable {
		log.logout();
		Logger.info("logout is clicked");
	   
	}

}
