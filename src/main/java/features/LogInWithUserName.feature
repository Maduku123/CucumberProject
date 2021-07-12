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
Feature: login with username and password provider
As a register user i should be able to register 
Scenario: Positive loginFunctionality Test
   Given that a register user have the correct URL and is in home page,
   When the user provide valide username "test123" and password "123"
   And click on the submit button 
   Then the user shold be able to login and see welcome message.
Scenario: Nagetive login functionality Test by using right username and wrong password
   Given that a register user have the correct URL and is in home page,
   When the user provide invalide username "test000" and correct password "123"
   And click on the submit button 
   Then the user shold not be able to login and will recieved an error message. 