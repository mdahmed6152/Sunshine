package com.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Utility.ParentBase;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features ={"src/test/resources/DemoFeature"} , 
plugin = {"json:target/cucumber.json"},
glue = "DellStepDef", tags={"@Sunshine001"})

public class RunTest extends AbstractTestNGCucumberTests {
	
	
	@BeforeTest
	public void lauchURL() {
		
		ParentBase openurl = new ParentBase();
		openurl.browserint();
	}
	
	@AfterTest
	public void closeURL() {
		ParentBase closeurl = new ParentBase();
		closeurl.driver.close();
		
	}


}
