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

Scenario: Positive Registration Test
Given that the new user have the correct URL and is on the home page
When the new user click the registration link he or she should be able the fill in the required information
And should clik on submit button after providing all required information
Then new user should be about to register 


#Scenario: positive Registration Test
#Given that the new user have the corrrect URL and is on the home page 
#When the new user click on the registration link he or she be able to provide partial required infor
#And should click on submit button after providing partial infor
#Then the new user should be able to register
#And see a welcome message
#
#Scenario: Negative Registration Test
#Given that the new user have the corrrect URL and is on the home page 
#When the new user click on the registration link he or she be able to provide partial or non of the required infor
#And should click on submit button after providing partial or invilad infor
#Then the new user should not be able to register
#And will not see or recived any welcome message
