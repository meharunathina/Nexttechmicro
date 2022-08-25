package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.netechitc.pageobjectmodel.prologin2POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class prologin2 {
	WebDriver driver;
	@Given("^user visit twitter login URL$")
	public void user_visit_twitter_login_URL() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.twitter.com/login/");
	}

	@When("^user type  \"([^\"]*)\"$")
	public void user_type(String arg1) throws Throwable {
		prologin2POM myobj=new prologin2POM(driver);
		myobj.email().sendKeys(arg1);
	    
	}

	@When("^user type \"([^\"]*)\" and click login$")
	public void user_type_and_click_login(String arg1) throws Throwable {
		prologin2POM myobj2=new prologin2POM(driver);
		myobj2.next().click();
	    
	}

	@Then("^user will be able to login successfully$")
	public void user_will_be_able_to_login_successfully() throws Throwable {
	    
	}



}
