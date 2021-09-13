Feature: Add Employee functionality
  As an Employer, I want to input my employee data
  so that I can get a preview of benefit costs.

  Background:
    Given Employer is on the login page
    When Employer input username
    And Employer input password
    And Employer click login button
    Then Employer is on the Dashboard page

    @3
    Scenario:
      When Employer click on the Delete Action button
      Then Employer click on the Delete button
      Then the Employee should be deleted


