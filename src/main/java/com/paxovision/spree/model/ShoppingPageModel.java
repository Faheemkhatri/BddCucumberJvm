package com.paxovision.spree.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingPageModel {
	
	protected WebDriver driver;
	protected WebElement selectItem;
	protected WebElement updateQuantity;
	protected WebElement cartButton;
	protected WebElement chkOutButton;

	public ShoppingPageModel(WebDriver driver){
		this.driver = driver;
	}

	public WebElement getSelectItem() {
		
		 selectItem = driver.findElement(By.xpath(".//*[text()='Ruby on Rails Tote']"));
		return selectItem;
	}

	public WebElement getUpdateQuantity() {
		updateQuantity = driver.findElement(By.id("quantity"));
		return updateQuantity;
	}

	public WebElement getCartButton() {
		cartButton = driver.findElement(By.id("add-to-cart-button"));
		return cartButton;
	}

	public WebElement getChkOutButton() {
		chkOutButton = driver.findElement(By.id("checkout-link"));
		return chkOutButton;
	}

}
