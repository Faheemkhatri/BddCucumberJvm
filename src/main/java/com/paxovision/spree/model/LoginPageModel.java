package com.paxovision.spree.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModel {
	
	protected WebDriver driver = null;
	
	protected WebElement accountLink;
	protected WebElement signinText;
	protected WebElement logoutButton;
	protected WebElement signoutText;
	
	public LoginPageModel(WebDriver driver){
		this.driver = driver;
		
	}
	public WebElement getAccountLink() {
		
		 accountLink = driver.findElement(By.xpath("//li/a[text()='My Account']"));
		return accountLink;
	}

	public WebElement getSigninText() {
		 signinText = driver.findElement(By.xpath(".//*[@id='user-info']/dd"));
		return signinText;
	}

	public WebElement getLogoutButton() {
		 logoutButton = driver.findElement(By.xpath(".//li/a[text()='Logout']"));
		return logoutButton;
	}

	public WebElement getSignoutText() {
		 signoutText = driver.findElement(By.xpath(".//*[text()='Signed out successfully.']"));
		return signoutText;
	}

}
