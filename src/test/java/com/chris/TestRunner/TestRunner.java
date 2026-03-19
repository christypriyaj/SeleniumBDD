package com.chris.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {},
		monochrome=false,
		//tags= "",
		features= {"src/test/resources/com.chris.Features/OrderIphone.feature"},
		glue= {"com.chris.StepDefinition","com.chris.Hooks"}
)


public class TestRunner extends AbstractTestNGCucumberTests{
	
}
