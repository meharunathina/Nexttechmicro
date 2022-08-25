package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.netechitc.pageobjectmodel.HomedepotPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homedepot {
	WebDriver driver;
	@Given("^user visits home depot homepage,$")
	public void user_visits_home_depot_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	    
	}

	@When("^user types \"([^\"]*)\" and click search icon$")
	public void user_types_and_click_search_icon(String arg1) throws Throwable {
		HomedepotPOM myobj=new HomedepotPOM(driver);
		myobj.typehomedepotsearch().sendKeys(arg1);
		myobj.searchicon().click();
		
		//WebDriverWait wait=new WebDriverWait(driver,25);
}

	@Then("^User should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
	   
	}



}
