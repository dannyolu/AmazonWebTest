Feature: Login requirement feature
  As a customer of magento
  I want login to the application
  So that i can buy item

  @wip
  Scenario: 1_Login with valid credentials
    Given I am in the login page
    When login successfully with "dannyolu@yahoo.com" & "high123"
    Then I should see my credential