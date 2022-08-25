package com.netechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PROJECT2POM {
	WebDriver driver;
	public PROJECT2POM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

}
 @FindBy(xpath="//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")
WebElement type_phonenumber ;
public WebElement phonenumber () {
	 return type_phonenumber;
}
@FindBy(xpath="//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div/span/span")
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