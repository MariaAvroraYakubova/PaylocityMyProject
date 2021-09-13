@2
Feature: Add Employee functionality
  As an Employer, I want to input my employee data
  so that I can get a preview of benefit costs.

Background:
  Given Employer is on the login page
  When Employer input username
  And Employer input password
  And Employer click login button
  Then Employer is on the Dashboard page
  #Given Employer is on the Dashboard page


Scenario:

 When Employer select the Action Edit
  Then  Employer should be able to change First Name Steve to "Mark"
  Then Employer should be able to change Last Name Jobs to "Zuckerderg"
  Then Employer should be able to change Dependents 2 to "0"
  Then Employer should be able to click on Update button
  And the data should change in the table