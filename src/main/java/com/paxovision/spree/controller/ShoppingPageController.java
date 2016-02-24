package com.paxovision.spree.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.paxovision.spree.model.ShoppingPageModel;

public class ShoppingPageController {
	
	protected WebDriver driver;
	protected ShoppingPageModel shoppingPage;
	
	public ShoppingPageController(WebDriver driver){
		this.driver = driver;
		shoppingPage = new ShoppingPageModel(driver);
	}
	
	public void selectItem(String expectedItem){
		shoppingPage.getSelectItem().click();
		
		String text = shoppingPage.getSelectItem().getText();
		assertThat(text, equalToIgnoringCase(expectedItem));
		
	}
	
	public void updateQuantity(){
		
		shoppingPage.getUpdateQuantity().sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
	}
	
	public void cartButton(){
		
		shoppingPage.getCartButton().click();
	}
	
	public void checkOutBtn(){
		
		shoppingPage.getChkOutButton().click();
	}

}
