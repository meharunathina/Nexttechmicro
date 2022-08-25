package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.netechitc.pageobjectmodel.FbsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbsignup {
	WebDriver driver;
	@Given("^user visiting facebook url$")
	public void user_visiting_facebook_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com/reg/");
		  driver.manage().window().maximize();
	   
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		try {
		FbsignupPOM myobj= new FbsignupPOM(driver);
		myobj.firstname().sendKeys(arg1);
		Thread.sleep(3000);
		myobj.lastname().sendKeys(arg1);
		Thread.sleep(3000);
		myobj.email().sendKeys(arg3);
		Thread.sleep(3000);
		myobj.edit_confemail().sendKeys(arg3);
		Thread.sleep(3000);
		myobj.password().sendKeys(arg4);
		Thread.sleep(3000);
	    	}
		catch (Exception e) {
			System.out.println("element not found");}
		}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		FbsignupPOM myobj=new FbsignupPOM (driver);
		Select dropdown=new Select(myobj.click_month);
		dropdown.selectByIndex(2);
		Select dropdown1=new Select(myobj.click_day);
		dropdown1.selectByValue("2");
		Select dropdown3=new Select(myobj.click_year);
		dropdown3.selectByVisibleText("2000");
		myobj.female().click();
		Thread.sleep(3000);
		myobj.signup().click();
	}



}
