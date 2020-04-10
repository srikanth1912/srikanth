package com.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
					    features="src/test/resources/feature//demo.feature", 
						glue= "com.stepdefinition",
						plugin = {"pretty", "html:target/cucumber-html-report",
								             "json:target/cucumber-json-report",
								             "junit:target/cucumber-junit-report",
								             "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
					   tags = {"@tc_01_login, @tc_2_addtocart, @tc_3_continueshopping, @tc_4_remove, @tc_5_logout, @tc_6_checkoutc, @tc_7_datadrivenlogin"},
					    monochrome = true		    
					)
	public class Runnerclass 
	{
		@AfterClass
		public static void extentreport()
		{
			Reporter.loadXMLConfig("src\\test\\resources\\TestData\\extent-config.xml");
			Reporter.setSystemInfo("user",System.getProperty("user.name"));
			Reporter.setSystemInfo("os","Windows");
			Reporter.setTestRunnerOutput("sample test runner output message");
		}

	}		
