Feature: Price verification in the cart
  As a Amazon user
  I want to see the price of item in the cart
  So I can pay for item


  Scenario: Verify that the original price of the product matches the price seen in the basket
    Given Amazon.co.uk is open and I am logged in
    And I add "TV Unit Stand City, Carcass in Black High Gloss / Front in Black High Gloss with LED lighting (£269.99)" to my basket
    When I check my basket total
    Then it should match the price of "TV Unit