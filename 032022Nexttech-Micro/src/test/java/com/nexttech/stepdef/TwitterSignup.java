package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.netechitc.pageobjectmodel.SIGNUPTWITTER1POM;
import com.netechitc.pageobjectmodel.TwitterSignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterSignup {
	WebDriver driver;
	@Given("^user visit twitter signupurl$")
	public void user_visit_twitter_signupurl() throws Throwable {
		
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://www.twitter.com/signup/");
	   
	}

	@When("^user click signup with phoneor email address$")
	public void user_click_signup_with_phoneor_email_address() throws Throwable {
		TwitterSignupPOM obj=new TwitterSignupPOM (driver);
		Thread.sleep(3000);
		obj.signup().click();
	    
	}

	@When("^user type  \"([^\"]*)\", \"([^\"]*)\",and select date of birth$")
	public void user_type_and_select_date_of_birth(String arg1, String arg2) throws Throwable {
		TwitterSignupPOM obj2=new TwitterSignupPOM (driver);
		obj2.name().sendKeys(arg1);
		Thread.sleep(3000);
	 
	    obj2.typephonenumber().sendKeys(arg2);
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

	@When("^user click on next ,again clickon next and click signup$")
	public void user_click_on_next_again_clickon_next_and_click_signup() throws Throwable {
		TwitterSignupPOM obj3=new TwitterSignupPOM(driver);
		obj3.next().click();
	    
	}

	@Then("^user will able to sign up account$")
	public void user_will_able_to_sign_up_account() throws Throwable {
	  
	}


}
