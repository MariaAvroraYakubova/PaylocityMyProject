@1
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

  When Employer clicks on Add Employee button
  Then Employer should be able to enter First Name "Steve"
  Then Employer should be able to enter Last Name "Jobs"
  Then Employer should be able to enter Dependents "2"
   Then Employer should be able to click Add button
  And Employer should see the employee in the table
   And the benefit cost calculations are correct

