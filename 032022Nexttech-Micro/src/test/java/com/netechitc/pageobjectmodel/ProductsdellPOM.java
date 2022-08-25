package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsdellPOM {
	WebDriver driver;
	public ProductsdellPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
	WebElement click_products;
	public WebElement click_products() {
		return  click_products;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/button")
	WebElement click_gaming;
	public WebElement click_gaming() {
		return click_gaming ;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/ul/li[5]/a")
	WebElement click_viewallienwaregaming;
	public WebElement click_alliengaming () {
		return  click_viewallienwaregaming;
	}
  
   }

