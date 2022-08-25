package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.netechitc.pageobjectmodel.SIGNUPTWITTER1POM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SIGNUPTWITTER1 {
	WebDriver driver;
	@Given("^users visits twitter signup url$")
	public void users_visits_twitter_signup_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.twitter.com/signup/");
	}

	@When("^user click signup with phone or email address$")
	public void user_click_signup_with_phone_or_email_address() throws Throwable {
		SIGNUPTWITTER1POM obj=new SIGNUPTWITTER1POM(driver);
		Thread.sleep(3000);
		obj.signup().click();
	}

	@When("^user types  \"([^\"]*)\", \"([^\"]*)\",and select date of birth$")
	public void user_types_and_select_date_of_birth(String arg1, String arg2) throws Throwable {
		SIGNUPTWITTER1POM obj2=new SIGNUPTWITTER1POM(driver);
		obj2.name().sendKeys(arg1);
		Thread.sleep(3000);
	    obj2.useemail().click();
	    Thread.sleep(3000);
	    obj2.typemail().sendKeys(arg2);
		Select dropdown=new Select(obj2.click_month);
		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		Select dropdown2=new Select(obj2.click_day);
		dropdown2.selectByValue("4");
		Thread.sleep(3000);
		Select dropdown3=new Select(obj2.click_year);
		dropdown3.selectByValue("1998");
		Thread.sleep(3000);
		obj2.next().click();
		
	    
	}

	@When("^user click next ,again click next and click signup$")
	public void user_click_next_again_click_next_and_click_signup() throws Throwable {
		SIGNUPTWITTER1POM obj3=new SIGNUPTWITTER1POM(driver);
		obj3.next().click();
	    
	}

	@Then("^user will able to sign up$")
	public void user_will_able_to_sign_up() throws Throwable {
	   
	}



}
