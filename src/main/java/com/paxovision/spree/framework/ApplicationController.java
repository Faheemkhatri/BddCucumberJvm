package com.paxovision.spree.framework;

import org.openqa.selenium.WebDriver;

import com.paxovision.spree.controller.HomePageController;
import com.paxovision.spree.controller.LoginPageController;
import com.paxovision.spree.controller.ShoppingPageController;

public class ApplicationController{
	
	protected WebDriver driver;
	protected HomePageController homePage = null;
	protected LoginPageController loginPage = null;
	protected ShoppingPageController shoppingPage = null;
	
	
	public ApplicationController(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePageController homePage(){
		if(homePage == null){
			homePage = new HomePageController(driver);
		}
		return homePage;
	}
	
	public LoginPageController loginPage(){
		if(loginPage == null){
			loginPage = new LoginPageController(driver);
		}
		return loginPage;
	}
	
	public ShoppingPageController shoppingPage(){
		if(shoppingPage == null){
			shoppingPage = new ShoppingPageController(driver);
		}
		return shoppingPage;
	}
	

}
