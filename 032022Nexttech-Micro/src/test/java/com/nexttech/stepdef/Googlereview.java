package com.nexttech.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.netechitc.pageobjectmodel.GooglereviewPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Googlereview {
	WebDriver driver;
	@Given("^user go to google homepage$")
	public void user_go_to_google_homepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
	   
	}

	@When("^user types \"([^\"]*)\" and click searchicon$")
	public void user_types_and_click_searchicon(String arg1) throws Throwable {
		GooglereviewPOM myobj=new GooglereviewPOM(driver);
		myobj.companyname().sendKeys(arg1);
		Thread.sleep(3000);
		myobj.searchicon().click();
	    
	}

	@When("^user scroll down and click write a review$")
	public void user_scroll_down_and_click_write_a_review() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		GooglereviewPOM myobj2=new GooglereviewPOM(driver);
		Thread.sleep(3000);
		myobj2.writeareview().click();
	   
	}

	@When("^user type \"([^\"]*)\" and click star icon$")
	public void user_type_and_click_star_icon(String arg1) throws Throwable {
	   
	}

	@When("^user click post$")
	public void user_click_post() throws Throwable {
	   
	}

	@Then("^user able to post a review$")
	public void user_able_to_post_a_review() throws Throwable {
	   
	}



}
