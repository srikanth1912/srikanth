package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocarttpage{
public WebDriver ldriver;

	
	public addtocarttpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
    }

	@FindBy(xpath="/html/body/div/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button")
	WebElement item;
	
	@FindBy(xpath="/html/body/div/div[2]/div[1]/div[2]/a")
	WebElement cart;
	
	public void select() {
		item.click();
	}
	
	public void gotocart() {
		cart.click();
	}

	}

