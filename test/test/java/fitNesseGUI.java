package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import main.java.mycalc;

public class fitNesseGUI {

mycalc tester = new mycalc();

	public int Num1,Num2,Num3;
	String opt;
	
	public void setPrice(int Num1){
		this.Num1 = Num1;
		}
	
	public void setQuant(int Num2){
		this.Num2 = Num2;
		}
	
	public void setTaxamt(int Num3){
		this.Num1 = this.Num1 * this.Num2 ;
		this.Num2 = Num3;
		}
		
	public int woTax(){
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://ata123456789123456789.appspot.com/");
		
		//Enter first number
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(Integer.toString(Num1));
		
		//Enter Second number
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(Integer.toString(Num2));
		
		//Select Add option
		driver.findElement(By.id("gwt-uid-2")).click();
		
		driver.findElement(By.id("ID_calculator")).click();
		String res = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		//Assert.assertEquals(Integer.parseInt(res), Integer.parseInt(result));
		driver.close();
		return Integer.parseInt(res);	
	}

	public int wTax(){
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://ata123456789123456789.appspot.com/");
		
		//Enter first number
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(Integer.toString(Num1));
		
		//Enter Second number
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(Integer.toString(Num2));
		
		//Select Add option
		driver.findElement(By.id("gwt-uid-1")).click();
				
		driver.findElement(By.id("ID_calculator")).click();
		String res = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		//Assert.assertEquals(Integer.parseInt(res), Integer.parseInt(result));
		driver.close();
		return Integer.parseInt(res);	
	}
	
}
