#encoding:utf-8
Feature: Calculate the bill based upon the item price,quantity and with flat service tax
#4th one from each table is negative case

@withTax
Scenario Outline: Using Tables of input data
	Given the price <price> and quantity <quantity> and flat Service Tax  <tax>
	When select option as <opt>
	Then Result is <result> should be displayed  
Examples:
|price	|quantity	|tax	|opt	|result	|
|"51"	|"8"	|"14"	|"Add" |"422"	|
|"52"	|"4"	|"15"	|"Add" |"223"	|
|"72"	|"7"	|"13"	|"Add" |"517"	|
|"91"	|"6"	|"9"	|"Add" |"500"	|