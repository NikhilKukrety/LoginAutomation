Feature: Verify user is able to login to practice website successfully

  @Login
  Scenario: Verify user is able to login to practice website successfully
    Given User is navigated to practice website sign in page
    When User enters valid username
    And User enters valid password
    And User clicks on Sign in button
    Then User should be navigated to welcome page successfully
    And User is on the welcome page
    When User clicks on Logout button
    Then User should be navigated back to Sign in page successfullly