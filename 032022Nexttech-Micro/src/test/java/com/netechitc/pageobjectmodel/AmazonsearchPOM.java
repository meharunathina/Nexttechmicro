package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {
	WebDriver driver;
	public AmazonsearchPOM (WebDriver driver) {
	    
	 	   this.driver=driver;
	 	   PageFactory.initElements(driver, this);
	 	   }
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	   WebElement type_amazonsearch;
	   public WebElement amazonsearch(){
	  return type_amazonsearch;
	 	   }
	   @FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	   WebElement click_amazonsearchicon;
	   public WebElement amazonsearchicon(){
	  return click_amazonsearchicon;
	  
	   }
	   
	 	   

}
