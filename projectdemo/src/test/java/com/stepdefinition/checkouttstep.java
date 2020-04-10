package com.stepdefinition;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.baseclass.Library;
import com.pages.Loginpager;
import com.pages.checkouttpage;
import com.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class checkouttstep extends Library {
	Loginpager login;
	checkouttpage cp;
	Utility util;
	final static Logger Logger=LogManager.getLogger(addtocarttstep.class.getName());

	
	@Given("^Userr Launchh Chrome Browserr$")
	public void userr_Launchh_Chrome_Browserr() throws Throwable {
		 launchApplication();
	}

	@When("^Pagee is openedd$")
	public void pagee_is_openedd() throws Throwable {
		login =new Loginpager(driver);
		login.setUserName("standard_user");
		login.setPassword("secret_sauce");
		login.clickSubmit();
		
	    Thread.sleep(5000);
	    util=new Utility(driver);
		util.takeSnapShot("E:\\srikanth\\ecl\\projectdemo\\src\\test\\resources\\screenshot\\checkout.png");

	    	}

	@Then("^Add the product to cart$")
	public void add_the_product_to_cart() throws Throwable {
		cp =new checkouttpage(driver);
		cp.select();
      Thread.sleep(2000);
		}

	@Then("^click on cart$")
	public void click_on_cart() throws Throwable {
		 cp.gotocart();
			Logger.info("goto cart is clicked");

		  Thread.sleep(3000);

	}

	@Then("^click on checkout and give frstname as \"([^\"]*)\" and lastname as \"([^\"]*)\" and zipcode as \"([^\"]*)\"$")
	public void click_on_checkout_and_give_frstname_as_and_lastname_as_and_zipcode_as(String fname, String lname, String zip) throws Throwable {
		 cp.checkout(fname, lname,zip);
			
	}

	@Then("^closee the browser$")
	public void closee_the_browser() throws Throwable {
		 cp.Continue();

	}



}
