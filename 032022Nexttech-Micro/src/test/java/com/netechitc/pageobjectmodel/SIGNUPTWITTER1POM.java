package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SIGNUPTWITTER1POM {
	
		WebDriver driver;
		public SIGNUPTWITTER1POM(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			

}
		@FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/div/span/span")
	     WebElement click_signup ;
		 public WebElement signup () {
			 return click_signup ;
		 }
		 @FindBy(xpath="//input[@maxlength=\"50\"]")
		 WebElement edit_name;
		 public WebElement name() {
			 return edit_name;
		 }
		 @FindBy(xpath="//input[@type=\"email\"]")
		 WebElement edit_typeemail;
		 public WebElement typemail() {
			 return edit_typeemail;
			 
			
			 }
		 @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/span")
		 WebElement click_useemail;
		 public WebElement useemail() {
			 return click_useemail;
		 }
		 @FindBy(xpath="//*[@id=\"SELECTOR_1\"]")
		  public WebElement click_month;
		 
		 @FindBy(xpath="//*[@id=\"SELECTOR_2\"]")
		 public WebElement click_day;
		 
		 @FindBy(xpath="//*[@id=\"SELECTOR_3\"]")
		 public WebElement click_year;
		  
		 @FindBy(xpath="/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")
		 WebElement click_next;
		 public WebElement next() {
			 return click_next;
		 }
		  
			 
		 
		 
	}
