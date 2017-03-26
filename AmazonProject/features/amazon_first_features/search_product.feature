Feature: Searching for item and checking that the first result is related to the search.
  As an amazon user
  I want to search for item
  So I can see the first search item

  Scenario: Search for product and verify the first result is related to your product
    Given Amazon.co.uk is open and I am logged in with "dannyolumese@gmail.com $ "high187"
    When I search for "tv stand"
    Then the first result has the word  "tv stand" in it