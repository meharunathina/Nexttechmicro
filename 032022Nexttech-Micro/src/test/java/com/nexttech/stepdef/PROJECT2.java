package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.netechitc.pageobjectmodel.PROJECT2POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PROJECT2 {
	WebDriver driver;
	@Given("^user visit twitter login$")
	public void user_visit_twitter_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.twitter.com/login/");
	   
	}

	@When("^user type valid \"([^\"]*)\"$")
	public void user_type_valid(String arg1) throws Throwable {
		PROJECT2POM obj=new PROJECT2POM(driver);
		obj.phonenumber().sendKeys(arg1);
	   
	}

	@When("^user click on next$")
	public void user_click_on_next() throws Throwable {
		PROJECT2POM obj2=new PROJECT2POM(driver);
		obj2.next().click();
	   
	}

	@When("^user type valid \"([^\"]*)\" and click login$")
	public void user_type_valid_and_click_login(String arg1) throws Throwable {
	    
	}

	@Then("^user will be login successfully$")
	public void user_will_be_login_successfully() throws Throwable {
	   
	}



}
