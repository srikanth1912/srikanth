package com.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Loginpager;
import com.pages.removeepage;

import com.utility.Utility;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class removeestep extends Library {
Loginpager login;
removeepage rem;
Utility util;
final static Logger Logger=LogManager.getLogger(addtocarttstep.class.getName());


	
	@Given("^User Launch Chrome Browserr$")
	public void user_Launch_Chrome_Browserr() throws Throwable {
	   launchApplication();
	}

	@When("^page is openedd$")
	public void page_is_openedd() throws Throwable {
		login =new Loginpager(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickSubmit();
		
	    Thread.sleep(2000);
	    util=new Utility(driver);
		util.takeSnapShot("E:\\srikanth\\ecl\\projectdemo\\src\\test\\resources\\screenshot\\remove.png");
}

	@Then("^Add items to the cartt$")
	public void add_items_to_the_cartt() throws Throwable {
		rem=new removeepage(driver);
		rem.select();
		Thread.sleep(2000);
	   
	}

	@Then("^Remove$")
	public void remove() throws Throwable {
		rem.remove();
		System.out.println("item is removed");
		Logger.info("remove is clicked");
	    
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   
	}

}
