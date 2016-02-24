package com.paxovision.spree.controller;

import org.openqa.selenium.WebDriver;

import com.paxovision.spree.model.HomePageModel;

public class HomePageController {
	
	protected WebDriver driver;
	protected HomePageModel homePage = null;
	
	public HomePageController(WebDriver driver){
		this.driver = driver;
		homePage = new HomePageModel(driver);
	}
	
	public void logInLink(){
		homePage.getLoginLink().click();
	}
	
	public void email(String email){
		homePage.getEmailField().sendKeys(email);
	}
	
	public void password(String password){
		homePage.getPasswordField().sendKeys(password);
	}
	
	public void logInButton(){
		homePage.getLoginButton().click();
	}
	


}
