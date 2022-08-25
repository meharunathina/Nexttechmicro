package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionsPOM {
	WebDriver driver;
	public SolutionsPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="/html/body/main/section[1]/header/div[2]/div[2]/nav/ul/li[3]/button/span")
	WebElement Click_solution;

	public WebElement solution(){
	return Click_solution;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/button")
	
	WebElement Click_Cloudsolution;

	public WebElement Cloudsolution(){
	return Click_Cloudsolution;
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[3]/ul/li[4]/ul/li[7]/a")
	WebElement Click_MultiClouddataservice;

	public WebElement MultiClouddataservice(){
	return Click_MultiClouddataservice;

	

}}
