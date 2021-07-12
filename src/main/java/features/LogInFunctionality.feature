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

   Feature: Login Functionality
   As a register user i should be able to login after providing vilade credentials
   Scenario: Positive loginFunctionality Test
   Given that a register user have the correct URL and is in home page,
   When the user provide valide username and password
   And click on the submit button 
   Then the user shold be able to login and see welcome message. 
   
   Scenario: Nagetive login functionality Test by using right username and wrong password
   Given that a register user have the correct URL and is in home page,
   When the user provide invalide username and correct password
   And click on the submit button 
   Then the user shold not be able to login and will recieved an error message.
  
   Scenario: Nagetive login functionality Test by using right password and wrong username
   Given  that a register user have the correct URL and is in home page,
   When the user provide valide username and incorrect password
   And click on  submit button 
   Then the user shold not be able to login and will recieved a login error email. 
  
   
