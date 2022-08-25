package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prologin2POM {
	WebDriver driver;
	public prologin2POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

}
 @FindBy(xpath="//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")
WebElement type_email ;
public WebElement email () {
	 return type_email;
}
@FindBy(xpath="//div[@class=\"css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0\"]")
WebElement click_next ;
public WebElement next () {
	 return click_next;}

@FindBy(xpath="")
WebElement type_password ;
public WebElement password () {
	 return type_password;
}

@FindBy(xpath="")
WebElement click_signin ;
public WebElement signin () {
	 return click_signin;
}}


