package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.netechitc.pageobjectmodel.contactpom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contact {
	WebDriver driver;
	@Given("^user visits dell homepage$")
	public void user_visits_dell_homepage() throws Throwable {
		//open browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		//open url
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/");
		//Thread.sleep(3000);
	    
	}

	@When("^user click on contact us$")
	public void user_click_on_contact_us() throws Throwable {
		contactpom myobj=new contactpom(driver);
		myobj.contactus().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@Then("^user should be able redritect to the contact us page$")
	public void user_should_be_able_redritect_to_the_contact_us_page() throws Throwable {
	   	}



}
