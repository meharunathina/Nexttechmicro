package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.netechitc.pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {
	WebDriver driver;
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		//in between browser and url we use implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		
		
		
		driver.get("https://www.amazon.com/");
		//Thread.sleep(3000);
		//maximize window
		driver.manage().window().maximize();
	}
		catch(Exception e) {
			System.out.println("amazon search option");
			}
		}

	@When("^user type \"([^\"]*)\" and click search icon$")
	public void user_type_and_click_search_icon(String arg1) throws Throwable {
		AmazonsearchPOM obj=new AmazonsearchPOM(driver);
		obj.amazonsearch().sendKeys(arg1);
		obj.amazonsearchicon().click();
 
		//WebDriverWait wait=new WebDriverWait(driver,20);this is explicit wait it's in between web element
	    	}

	@Then("^User should able to see the expected product$")
	public void user_should_able_to_see_the_expected_product() throws Throwable {
	    
	}



}
