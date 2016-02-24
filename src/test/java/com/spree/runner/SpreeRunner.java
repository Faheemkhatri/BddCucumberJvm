package com.spree.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		  //dryRun = false,
		  //strict = true,
		  monochrome = true,
		   tags = { "@smoke"},
		 // tags = { "@functionality"},
		  //tags = { "@smoke","@functional" }, /*AND*/
		  //tags = { "@functional,@smoke" }, /*OR*/
		  //tags = { "@functional,@debug","@debug" }, /*AND-OR*/
		  features = "src/test/resources/features",
		  glue = {"com.paxovision.spree.steps"},
		  plugin={
			 "pretty",
			 "html:target/test-report",
			 "json:target/test-report.json",
			 "json:target/cucumber-report.json",
			 "junit:target/test-report.xml"
		  }	
		)
public class SpreeRunner {

}
