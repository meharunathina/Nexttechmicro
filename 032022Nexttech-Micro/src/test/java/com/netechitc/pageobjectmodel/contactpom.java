package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactpom {
	WebDriver driver;
	public contactpom(WebDriver driver) {
	    
	 	   this.driver=driver;
	 	   PageFactory.initElements(driver, this);
	 	   }
	 	  @FindBy(xpath="//span[@class=\"uc-floating-text\"]")
	 	   WebElement click_contactus;
	 	   public WebElement contactus(){
	 	  return click_contactus;
	 	   }
	 }

