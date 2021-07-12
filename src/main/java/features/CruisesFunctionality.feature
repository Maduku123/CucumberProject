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
Feature: Booking for cruise from the homepage
As a register user i should be able to book for cruise one i am on the homepage.
Scenario: CruiseFunctionality Test
   Given that a register user have the correct URL and is in home page,
   When the user clink on the cruise link and provide valide username and password
   And click on the submit button 
   Then the user shold be able to book for cruise and see welcome message.