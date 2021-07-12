#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Registration Functionality
New user should be able to register after providing all the required credential.

Scenario Outline: Positive Registration Test
Given that the new user have the correct URL and is on the home page
When the new user click the registration link and provide <firstName>,<lastName>,<Phone>,<email>,<address>,<userName>,<password>,<confirmePassWord>.
And should clik on submit button after providing all required information
Then new user should be about to register

Examples:
|firstName |lastName  |Phone      |email          |address       |userName  |password  |confirmePassWord  |
|Deric     |tata      |+121247645 |erick@gmail.com|1615 johnwest |test345   |678       |678               |



