package com.paxovision.spree.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paxovision.spree.model.LoginPageModel;

public class LoginPageController {
	
	protected WebDriver driver = null;
	protected LoginPageModel loginPage = null;

	public LoginPageController(WebDriver driver) {
		this.driver = driver;
		loginPage = new LoginPageModel(driver);
	}
	
	public void accountLink(){
		loginPage.getAccountLink().click();
	}
	
	public void signInText(String emailText){
		WebElement ele = loginPage.getSigninText();
		String text = ele.getText();
		assertThat(text, equalToIgnoringCase(emailText));
	}
	
	public void logOutButton(){
		
		loginPage.getLogoutButton().click();
	}
	
	public void signOutText(String signoutText ){
		
		WebElement ele = loginPage.getSignoutText();
		String text = ele.getText();
		assertThat(text, equalToIgnoringCase(signoutText));
	}

}
