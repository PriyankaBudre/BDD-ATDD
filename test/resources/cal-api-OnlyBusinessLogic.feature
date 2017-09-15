#encoding:utf-8
Feature: Calculate the bill based upon the item price and quantity
	As a Customer for online shopping website
	I should be able to calculate the total bill
	so that i can initiate the payment process

#4th scenario from each is negative case

@high @pos @api
Scenario: option01

	Given api the price "51" and quantity "8" 
	When api select option as "Mul" and Clicked on Calculate button
	Then api Result is "408" should be displayed 

@med @pos @api
Scenario: option02

	Given api the price "52" and quantity "4" 
	When api select option as "Mul" and Clicked on Calculate button
	Then api Result is "208" should be displayed 
	

@low @pos @api
Scenario: option03

	Given api the price "72" and quantity "7" 
	When api select option as "Mul" and Clicked on Calculate button
	Then api Result is "504" should be displayed 
	

@high @neg @api
Scenario: option04
	
	Given api the price "91" and quantity "6" 
	When api select option as "Mul" and Clicked on Calculate button
	Then api Result is "500" should be displayed
	
@withTax @api
Scenario Outline: Using Tables of input data
	Given api the price <price> and quantity <quantity> and flat Service Tax  <tax>
	When api select option as <opt>
	Then api Result is <result> should be displayed  
Examples:
|price	|quantity	|tax	|opt	|result	|
|"51"	|"8"	|"14"	|"Add" |"422"	|
|"52"	|"4"	|"15"	|"Add" |"223"	|
|"72"	|"7"	|"13"	|"Add" |"517"	|
|"91"	|"6"	|"9"	|"Add" |"500"	|