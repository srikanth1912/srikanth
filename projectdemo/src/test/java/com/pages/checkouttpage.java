package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkouttpage {
public WebDriver ldriver;

	
	public checkouttpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
    }

	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[2]/div[3]/button")
	WebElement item;
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[2]/a")
	WebElement cart;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement zip;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/a[2]")
	WebElement checkout;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/form/div[2]/input")
	WebElement conti;
	
	public void select() {
		item.click();
	}
	
	public void gotocart() {
		cart.click();
	}
	public void checkout(String s1,String s2,String s3) {
		checkout.click();
		fname.sendKeys(s1);
		lname.sendKeys(s2);
		zip.sendKeys(s3);
		
	}
	public void Continue() {
	   conti.click();
	}


}
