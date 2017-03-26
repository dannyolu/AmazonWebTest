Given(/^Amazon\.co\.uk is open and I am logged in $/) do
  @homePage = @basePage.go_to_amazon_home
  @homePage.visit_sigin.loginPage.loginPage.login_with.welcomePage

end
And(/^I add "([^"]*)" to my basket$/) do |arg1|
  @originalPriceProductPage = @homePage.visit_sigin
  @welcomePage.search_product

end

When(/^I check my basket total$/) do
  @cartPage = @originalPriceProductPage.product_price
  @checkoutPage.price
end


Then(/^it should match the price of  "([^"]*)"$/) do |arg1|
  expect(@checkoutPage.price).to be true
end