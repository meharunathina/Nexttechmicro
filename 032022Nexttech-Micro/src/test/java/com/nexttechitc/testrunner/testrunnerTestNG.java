package com.nexttechitc.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testrunnerTestNG {
	
	//@Runwith(Cucumber.class)
	@CucumberOptions (

			features = {"Features"},
			glue = {"com.nexttechitc.Stepdef"}
			//tags= {"@sc2","@sc1"}
			)
			public class TestRunner extends AbstractTestNGCucumberTests{}
}
