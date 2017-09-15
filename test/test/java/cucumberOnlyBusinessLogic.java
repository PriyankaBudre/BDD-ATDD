package test.java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.mycalc;

public class cucumberOnlyBusinessLogic {

	mycalc tester  = new mycalc();
	int firstNum, secondNum,result;
	String res;
	String opt;
	
	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver","C://Users//pbudre//workspace//CPAAT-Priyanka_test//test//resource//chromedriver.exe");
	
	@Given("^api the price \"([^\"]*)\" and quantity \"([^\"]*)\"$")
	public void the_price_and_quantity(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had

		firstNum = Integer.parseInt(arg1);
		secondNum = Integer.parseInt(arg2);
	}

	@When("^api select option as \"([^\"]*)\" and Clicked on Calculate button$")
	public void select_option_as_and_Clicked_on_Calculate_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		//Select Mul option button
		opt = arg1;
	}

	@Then("^api Result is \"([^\"]*)\" should be displayed$")
	public void Result_is_should_be_displayed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		if(opt.equalsIgnoreCase("Add")){
			result = tester.Add(firstNum,secondNum);
			Assert.assertEquals(result, Integer.parseInt(arg1));
			
		}		
		
		if(opt.equalsIgnoreCase("mul")){
			result = tester.Mul(firstNum,secondNum);
			Assert.assertEquals(result, Integer.parseInt(arg1));
			
		}
	}


	@Given("^api the price \"([^\"]*)\" and quantity \"([^\"]*)\" and flat Service Tax  \"([^\"]*)\"$")
	public void the_price_and_quantity_and_flat_Service_Tax(String arg1, String arg2, String arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		firstNum = Integer.parseInt(arg1) * Integer.parseInt(arg2);
		secondNum = Integer.parseInt(arg2);
	}

	@When("^api select option as \"([^\"]*)\"$")
	public void select_option_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		//Select Mul option button
		driver.findElement(By.id("gwt-uid-1")).click();
		
		//Click on Calculate button
		driver.findElement(By.id("ID_calculator")).click();
	    
	}
}
