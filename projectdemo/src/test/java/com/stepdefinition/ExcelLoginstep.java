package com.stepdefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.SauceExcelLoginPage;
import com.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import excelutility.Excelutility;

public class ExcelLoginstep extends Library {
	Excelutility excel;
	SauceExcelLoginPage elp;
	Excelutility util;
	Utility uti;
	Logger logger=LogManager.getLogger(ExcelLoginstep.class.getName());
	
	
	
	
	
	@Given("^Launch Chrome Browserr$")
	public void launch_Chrome_Browserr() throws Throwable {
	    	
	launchApplication();
		}

	@When("^Login Saucedemo page openedd$")
	public void login_Saucedemo_page_openedd() throws Throwable {
		logger.info("browser is launched");
		uti= new Utility(driver);
		uti.takeSnapShot("E:\\srikanth\\ecl\\projectdemo\\src\\test\\resources\\screenshot\\excel.png");
	    
		
		
	}

	@Then("^enter the email and pass$")
	public void enter_the_email_and_pass() throws Throwable {
		elp=new SauceExcelLoginPage(driver);
		excel=new Excelutility();
		elp.loginToApp_username(excel.excel_username(1));
		elp.loginToApp_password(excel.excel_password(1));
		logger.info("username and login credentials are passed");
	 	
	}

	@Then("^click on login buttonn$")
	public void click_on_login_buttonn() throws Throwable {
		elp.loginToApp_Loginbtn();
		logger.info("clicked on login button");
	 
	}

	@Then("^close  browser$")
	public void close_browser() throws Throwable {
	   
	}


}
