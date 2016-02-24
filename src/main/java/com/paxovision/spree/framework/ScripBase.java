package com.paxovision.spree.framework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScripBase {
	
	protected WebDriver driver = null;
	protected ApplicationController spree = null;

	
	@Before
	public void setUp(){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://spree.paxotech.com/");
		spree = new ApplicationController(driver);
	}
	
//	public ApplicationController spree(){
//		if(spree == null){
//			spree = new ApplicationController(driver);
//		}
//		return spree;
//	}
	
	

	
	@After
	public void tearDown(){
		
		//driver.close();
		//driver.quit();
		spree = null;
	}

}
