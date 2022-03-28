Feature:Sign up to app

    @S1
  Scenario: Check that you can create and account when you have all the data correct
    Given I complete the sign up sequences with correct data
    When I click on Sign Up button
    Then The account is created successfully

    @S2
  Scenario: Check that the app warns you if the passwords don t match
    Given I insert the first password
    When I insert a different confirmation password and press submit button
    Then I get an error

    @S3
  Scenario: Check if the app allows you to register with a non-existent email
    Given I complete the sign up sequences with non-existent email
    When I click on sign up
    Then The account should not be created successfully

    @S4
  Scenario: Check that you can sign up with Facebook button
      Given I navigate into the app
      When I click on Facebook Sign Up button
      Then The account should be created with Facebook account

    @S5
  Scenario: Check that you can sign up with Google button
    Given I navigate into Politrip Sign Up Page
    When I click on Google Sign Up button
    Then The account should be created with Google account

    @S6
  Scenario: Check that you can sign up with Instagram button
      Given I navigate into the app that I am testing
      When I click on Instagram Sign Up button
      Then The account should be created with Instagram account

    @S7
  Scenario: Check that you can sign up with VK button
      Given I navigate into the Politrip app Sign Up Page
      When I click on VK Sign Up button
      Then The account should be created with VK account

    @S8
    Scenario: Check if you can Sign Up without complete any of sequences
      Given I navigate to Politrip Sign Up Page
      When I click on Sign Up Button without complete any of sequences
      Then The account can not be created