package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(tags={"~@api"},features="test/resources/",monochrome=true)
@RunWith(Cucumber.class)

public class TestRunner{
	
}