package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BasePage;

public class HomePage extends BasePage{
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
		this.driver=driver;
	}

	@FindBy(xpath="//a[@id='login-portal']")
	private WebElement aLogin;
	
	@FindBy(id="button-clicks")
	private WebElement btnClick;
	
	public LoginPage clickLogin(){
		driver.findElement(By.xpath("//a[@id='login-portal']")).click();
		return PageFactory.initElements(driver, LoginPage.class);
	}
	
	public LoginPage clickButton(){
		btnClick.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}
}
