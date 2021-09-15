
Feature: Add Employee functionality
 As an Employer, I want to input my employee data
 so that I can get a preview of benefit costs.


Scenario:
 Given Employer is on the login page
 When Employer input username
 And Employer input password
 And Employer click login button
 Then Employer is on the Dashboard page


  Scenario:

  When Employer clicks on Add Employee button
  Then Employer should be able to enter First Name "Steve"
  Then Employer should be able to enter Last Name "Jobs"
  Then Employer should be able to enter Dependents "2"
   Then Employer should be able to click Add button
  And Employer should see the employee in the table
   And the benefit cost calculations are correct


 Scenario:

  When Employer select the Action Edit
  Then  Employer should be able to change First Name Steve to "Mark"
  Then Employer should be able to change Last Name Jobs to "Zuckerderg"
  Then Employer should be able to change Dependents 2 to "0"
  Then Employer should be able to click on Update button
  #And the data should change in the table


 Scenario:
  When Employer click on the Delete Action button
  Then Employer click on the Delete button
  Then the Employee should be deleted