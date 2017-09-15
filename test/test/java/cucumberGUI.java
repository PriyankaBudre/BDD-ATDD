package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.mycalc;

public class cucumberGUI {

	mycalc tester  = new mycalc();
	int firstNum, secondNum,result;
	String res;
	String opt;
	
	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver","C://Users//pbudre//workspace//CPAAT-Priyanka_test//test//resource//chromedriver.exe");
	
	@Given("^the price \"([^\"]*)\" and quantity \"([^\"]*)\"$")
	public void the_price_and_quantity(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had

		driver = new ChromeDriver();		
		
		//Initialize URL
		driver.get("http://ata123456789123456789.appspot.com/");
		
		//Enter Price
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(arg1);
	   
		//Enter Quantity
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(arg2);
	}

	@When("^select option as \"([^\"]*)\" and Clicked on Calculate button$")
	public void select_option_as_and_Clicked_on_Calculate_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		//Select Mul option button
		driver.findElement(By.id("gwt-uid-2")).click();
		
		//Click on Calculate button
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^Result is \"([^\"]*)\" should be displayed$")
	public void Result_is_should_be_displayed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
			res = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
			driver.close();
			Assert.assertEquals(Integer.parseInt(res), Integer.parseInt(arg1));
	}


	@Given("^the price \"([^\"]*)\" and quantity \"([^\"]*)\" and flat Service Tax  \"([^\"]*)\"$")
	public void the_price_and_quantity_and_flat_Service_Tax(String arg1, String arg2, String arg3) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		firstNum = (Integer.parseInt(arg1)) * (Integer.parseInt(arg2));
		
		driver = new ChromeDriver();		
		//Initialize URL
		driver.get("http://ata123456789123456789.appspot.com/");
		
		//Enter Price
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(Integer.toString(firstNum));
	   
		//Enter Quantity
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(arg3);
	}

	@When("^select option as \"([^\"]*)\"$")
	public void select_option_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		//Select Mul option button
		driver.findElement(By.id("gwt-uid-1")).click();
		
		//Click on Calculate button
		driver.findElement(By.id("ID_calculator")).click();
	    
	}
	
	
	/*@Given("^the input is \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_input_is_and(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		firstNum = Integer.parseInt(arg1);
		secondNum = Integer.parseInt(arg2);
	}
	
	@When("^select as \"([^\"]*)\"$")
	public void select_as(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    opt = arg1;
	}


	@Then("^Result is \"([^\"]*)\" should be displayed$")
	public void Result_is_should_be_displayed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		
		if(opt.equalsIgnoreCase("Add")){
			result = tester.Add(firstNum,secondNum);
			Assert.assertEquals(result, Integer.parseInt(arg1));
			
		}		
		if(opt.equalsIgnoreCase("sub")){
			result = tester.Sub(firstNum,secondNum);
			Assert.assertEquals(result, Integer.parseInt(arg1));
			
		}
		if(opt.equalsIgnoreCase("mul")){
			result = tester.Mul(firstNum,secondNum);
			Assert.assertEquals(result, Integer.parseInt(arg1));
			
		}
	}
	
	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver","C://Users//pbudre//workspace//Test-CP-ATT-Priyanka//test//resource//chromedriver.exe");
	
	@Given("^\"([^\"]*)\" as Browser$")
	public void as_Browser(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		if(arg1.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();		
		}
		if(arg1.equalsIgnoreCase("chrome")){
			driver = new ChromeDriver();		
		}
		
		  driver.get("http://ata123456789123456789.appspot.com/");
	}

	@When("^entered \"([^\"]*)\" in first field$")
	public void entered_in_first_field(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	     driver.get("http://ata123456789123456789.appspot.com/");
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(arg1);
	   
	}

	@When("^entered \"([^\"]*)\" in second field$")
	public void entered_in_second_field(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.get("http://ata123456789123456789.appspot.com/");
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(arg1);
	   
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(arg1);
	}


	@When("^selected on \"([^\"]*)\" radio button$")
	public void selected_on_radio_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		
		switch(arg1){
			case "Add":
				driver.findElement(By.id("gwt-uid-1")).click();
				break;
			case "Sqr":
				driver.findElement(By.id("gwt-uid-3")).click();
				break;
			case "Mul":
				driver.findElement(By.id("gwt-uid-2")).click();
				break;
		}
	}
	
	@When("^clicked on calculate$")
	public void clicked_on_calculate() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^Result is \"([^\"]*)\" should be displayed in result box$")
	public void Result_is_should_be_displayed_in_result_box(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		res = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		Assert.assertEquals(Integer.parseInt(res), Integer.parseInt(arg1));
	   
	}

	@Then("^\"([^\"]*)\" is closed$")
	public void is_closed(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   driver.close();
	}*/
}
