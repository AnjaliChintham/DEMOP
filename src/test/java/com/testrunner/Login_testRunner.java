package com.testrunner;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features="features",
		glue="stepDefinition",
		plugin= {"html:target/cucumber-html-report",
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.txt",
				"usage:target/cucumber-usage.json",
				"junit:target/cucumber-results.xml"}
		)
public class Login_testRunner
{
	

}
