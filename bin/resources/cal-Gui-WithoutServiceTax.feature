#encoding:utf-8
Feature: Calculate the bill based upon the item price and quantity
	As a Customer for online shopping website
	I should be able to calculate the total bill
	so that i can initiate the payment process

#4th one from each table is negative case

@high @pos
Scenario: option01

	Given the price "51" and quantity "8" 
	When select option as "Mul" and Clicked on Calculate button
	Then Result is "408" should be displayed 

@med @pos
Scenario: option02

	Given the price "52" and quantity "4" 
	When select option as "Mul" and Clicked on Calculate button
	Then Result is "208" should be displayed 
	

@low @pos
Scenario: option03

	Given the price "72" and quantity "7" 
	When select option as "Mul" and Clicked on Calculate button
	Then Result is "504" should be displayed 
	

@high @neg
Scenario: option04
	
	Given the price "91" and quantity "6" 
	When select option as "Mul" and Clicked on Calculate button
	Then Result is "500" should be displayed