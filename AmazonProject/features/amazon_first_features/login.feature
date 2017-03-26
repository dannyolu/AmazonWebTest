Feature: Validate sigin functionality
  As an Amazon user
  I want to sign in with valid credential
  So I am logged in


  Scenario: Sign into Amazon.co.uk
    Given Amazon.co.uk is open
    When I click Sign-in
    And enter valid "dannyolumese@gmail.com" & "high187"
    Then I am logged in
