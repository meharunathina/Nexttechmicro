package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbsignupPOM {
	WebDriver driver;
	public FbsignupPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	@FindBy(xpath="//*[@name=\"firstname\"]")
	WebElement edit_firstname;
	public WebElement firstname() {
	return edit_firstname;
	}
	@FindBy(name="lastname")
	WebElement edit_lastname;
	public WebElement lastname() {
	return edit_lastname;
	}

	@FindBy(name="reg_email__")
	WebElement edit_email;
	public WebElement email() {
	return edit_email;
	
	}
	@FindBy(name="reg_email_confirmation__")
	WebElement edit_confemail;
	public WebElement edit_confemail() {
		return edit_confemail;
	}


	@FindBy(id="password_step_input")
	WebElement edit_password;
	public WebElement password() {
	return edit_password;
	}

	@FindBy(xpath="//*[@id=\"month\"]")
	public WebElement click_month;


	@FindBy(id="day")
	public WebElement click_day;


	@FindBy(id="year")
	public WebElement click_year;

	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input")
	WebElement click_female;
	public WebElement female() {
	return click_female;
	}
	
	
	@FindBy(xpath="//button[@name=\"websubmit\"]")
	WebElement click_signup;
	public WebElement signup () {
		return click_signup;
	}

    
     }
      

