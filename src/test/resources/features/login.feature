Feature: Login page


  Scenario:
    Given Employer is on the login page
    When Employer input username
    And Employer input password
    And Employer click login button
    Then Employer is on the Dashboard page