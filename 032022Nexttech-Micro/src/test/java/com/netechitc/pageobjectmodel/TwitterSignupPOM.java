package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterSignupPOM {
	WebDriver driver;
	public TwitterSignupPOM(WebDriver driver) {
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
	 @FindBy(xpath="//input[@name=\"phone_number\"]")
	 WebElement edit_typephonenumber;
	 public WebElement typephonenumber() {
		 return edit_typephonenumber;
		 
		
		 
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



