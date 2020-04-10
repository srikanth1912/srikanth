package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class continueshoppingpage {
public WebDriver ldriver;

	
	public continueshoppingpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
    }

	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement item;
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[2]/a")
	WebElement cart;
	
	@FindBy(xpath="/html/body/div/div[2]/div[3]/div/div[2]/a[1]")
	WebElement csbtn;
	
	public void select() {
		item.click();
	}
	
	public void gotocart() {
		cart.click();
	}
	public void continueshop() {
		csbtn.click();
	}


}
