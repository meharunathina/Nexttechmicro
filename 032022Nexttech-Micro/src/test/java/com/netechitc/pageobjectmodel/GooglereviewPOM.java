package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglereviewPOM {
	WebDriver driver;
	public  GooglereviewPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

}
	@FindBy(xpath="//input[@class=\"gLFyf gsfi\"]")
     WebElement type_companyname ;
	 public WebElement companyname () {
		 return type_companyname ;
	 }
	 @FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span/svg")
	 WebElement click_searchicon;
	 public WebElement searchicon() {
		 return click_searchicon;
	 }
	 @FindBy(xpath="//*[@id=\"wrkpb\"]/span/span")
	 WebElement click_writeareview;
	 public WebElement writeareview() {
		 return click_writeareview;
		 

}}
