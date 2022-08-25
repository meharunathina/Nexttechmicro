package com.nexttech.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.netechitc.pageobjectmodel.SolutionsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Solutions {
	WebDriver driver;
	@Given("^user visits Dell homepagea$")
	public void user_visits_Dell_homepagea() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		//implicitly wait time
		//driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.get("https://www.dell.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		
	   	}

	@When("^user go to Solutions dropdown menu and able to see View All cloud solutions$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_All_cloud_solutions() throws Throwable {
		Actions act=new Actions(driver);
		SolutionsPOM obj=new SolutionsPOM(driver);
		act.moveToElement(obj.solution()).build().perform();
		obj.Cloudsolution().click();
		obj.MultiClouddataservice().click();
	   
	}

	@Then("^user redirects to solution portfolios$")
	public void user_redirects_to_solution_portfolios() throws Throwable {
	    
	}



}
