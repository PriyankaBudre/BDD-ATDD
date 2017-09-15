package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import main.java.mycalc;

public class fitNessOnlyBusinessLogic {

mycalc tester = new mycalc();

	public int Num1,Num2,Num3;
	public String opt;

	public void setPrice(int Num1){
		this.Num1 = Num1;
		}
	
	public void setQuant(int Num2){
		this.Num2 = Num2;
		}

	public void setTaxamt(int Num3){
		this.Num3 = Num3;
		}

	//Without Tax
	public int woTax(){return tester.Mul(Num1, Num2);}
	
	//With Tax
	public int wTax()
	{
		Num1 = Num1 * Num2;
		Num2 = Num3;
		return tester.Add(Num1, Num2);}
}
