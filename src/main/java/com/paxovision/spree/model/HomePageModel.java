package com.paxovision.spree.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageModel {
	
	protected WebDriver driver = null;
	protected WebElement loginLink;
	protected WebElement emailField;
	protected WebElement passwordField;
	protected WebElement loginButton;
	
	public HomePageModel(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getLoginLink() {
		
		 loginLink = driver.findElement(By.id("link-to-login"));
		return loginLink;
	}
	

	public WebElement getEmailField() {
		
		 emailField = driver.findElement(By.id("spree_user_email"));
		return emailField;
	}




	public WebElement getPasswordField() {
		
		 passwordField = driver.findElement(By.id("spree_user_password"));
		return passwordField;
	}




	public WebElement getLoginButton() {
		
		loginButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-success.btn-block"));
		return loginButton;
	}

}
