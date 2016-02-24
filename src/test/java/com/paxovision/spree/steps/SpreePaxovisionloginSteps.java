package com.paxovision.spree.steps;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.paxovision.spree.framework.ApplicationController;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.concurrent.TimeUnit;

public class SpreePaxovisionloginSteps {
	
	protected WebDriver driver;
	protected ApplicationController spree;
	
	@Before
	public void setUp(){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		spree = new ApplicationController(driver);
	}
	
	@After
	public void tearDown(){
		
		//driver.close();
		//driver.quit();
		spree = null;
	}
	
	@Given("^user can browse to an application$")
	public void user_can_browse_to_an_application() throws Throwable {
	   
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://spree.paxotech.com/");
		
		
	}

	@When("^user land on home page \"([^\"]*)\"$")
	public void user_land_on_home_page(String expectedTitle) throws Throwable {
	
		String title = driver.getTitle();
		assertThat(title, equalToIgnoringCase(expectedTitle));
	}

	@Then("^user can click on login link$")
	public void user_can_click_on_login_link() throws Throwable {
	   
		spree.homePage().logInLink();
		
//		WebElement loginLink = driver.findElement(By.xpath(".//*[@id='link-to-login']/a"));
//		loginLink.click();
	}

	@Then("^enter \"([^\"]*)\" as email address$")
	public void enter_as_email_address(String email) throws Throwable {

		spree.homePage().email(email);
		
//		WebElement emailField = driver.findElement(By.id("spree_user_email"));
//		emailField.sendKeys(email);
	}

	@Then("^enter \"([^\"]*)\" as password$")
	public void enter_as_password(String password) throws Throwable {
		
		spree.homePage().password(password);
		
//	  WebElement passwordField = driver.findElement(By.id("spree_user_password"));
//	  passwordField.sendKeys(password);
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
	 
		spree.homePage().logInButton();
		
//		driver.findElement(By.cssSelector(".btn.btn-lg.btn-success.btn-block")).click();
	}

	@When("^user logged on to the application$")
	public void user_logged_on_to_the_application() throws Throwable {
	   
		String title = driver.getTitle();
		assertThat(title,equalToIgnoringCase("Spree Demo Site"));
	}

	@Then("^user can click on account link$")
	public void user_can_click_on_account_link() throws Throwable {
		
		spree.loginPage().accountLink();
	   
//		driver.findElement(By.xpath("//li/a[text()='My Account']")).click();
		
		
	}

	@Then("^verify email \"([^\"]*)\" as signed in text$")
	public void verify_email_as_signed_in_text(String emailText) throws Throwable {
		
		spree.loginPage().signInText(emailText);
		
//		WebElement element = driver.findElement(By.xpath(".//*[@id='user-info']/dd"));
//		String text = element.getText();
//		assertThat(text, equalToIgnoringCase(emailText));
	}

	@Then("^click on log out button$")
	public void click_on_log_out_button() throws Throwable {
	
		spree.loginPage().logOutButton();
		
//		driver.findElement(By.xpath(".//li/a[text()='Logout']")).click();
	}

	@Then("^verify log out text \"([^\"]*)\" as signed out message$")
	public void verify_log_out_text_as_signed_out_message(String signoutText) throws Throwable {
		
		spree.loginPage().signOutText(signoutText);
		
//		WebElement element = driver.findElement(By.xpath(".//*[text()='Signed out successfully.']"));
//		String text = element.getText();
//		assertThat(text, equalToIgnoringCase(signoutText));	
	}
	
	@Then("^select item \"([^\"]*)\"$")
	public void select_item(String expectedItem) throws Throwable {
	  
		spree.shoppingPage().selectItem(expectedItem);
		
//		driver.findElement(By.xpath(".//*/a[text()='Ruby on Rails Tote']")).click();
//		WebElement element = driver.findElement(By.xpath(".//*/h1[text()='Ruby on Rails Tote']"));
//		String text = element.getText();
//		assertThat(text, equalToIgnoringCase(expectedItem));
	}
	
	
	@Then("^update quantity on cart page$")
	public void update_quantity_on_cart_page() throws Throwable {
	  
		spree.shoppingPage().updateQuantity();
		
//		driver.findElement(By.id("quantity")).sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);
		
	}

	@Then("^click on add to cart button$")
	public void click_on_add_to_cart_button() throws Throwable {
	  
		spree.shoppingPage().cartButton();
		
//		driver.findElement(By.id("add-to-cart-button")).click();
	}

	@Then("^click on check out button$")
	public void click_on_check_out_button() throws Throwable {
	  
		spree.shoppingPage().checkOutBtn();
		
//		driver.findElement(By.id("checkout-link")).click();
	}

}
