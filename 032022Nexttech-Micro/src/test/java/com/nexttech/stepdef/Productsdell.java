package com.nexttech.stepdef;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.netechitc.pageobjectmodel.ProductsdellPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Productsdell {
	WebDriver driver;
	@Given("^user visit Dell homepagee$")
	public void user_visit_Dell_homepagee() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
				//implicitly wait time
				//driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
				driver.get("https://www.dell.com/");
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
	}

	@When("^user go to products dropdown menu and gaming dropdown menu  able to see view allienwaregaming$")
	public void user_go_to_products_dropdown_menu_and_gaming_dropdown_menu_able_to_see_view_allienwaregamings() throws Throwable {
		Actions act=new Actions(driver);
		ProductsdellPOM obj=new ProductsdellPOM(driver);
		act.moveToElement(obj.click_products()).build().perform();
		obj.click_gaming().click();
		obj.click_alliengaming().click();
		//explicite wait time
		//WebDriverWait wait=new WebDriverWait(driver,25);
	    
	}

	@Then("^user redirects to gaming portfolio$")
	public void user_redirects_to_laptop_portfolio() throws Throwable {
	   
	}



}
