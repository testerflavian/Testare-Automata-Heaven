Feature:Sign up to app
  Scenario: Check that you can create and account when you have all the data corret
    Given I complete the sign up sequences with correct data
    When I click on Sign Up button
    Then The account is created successfully

  Scenario: