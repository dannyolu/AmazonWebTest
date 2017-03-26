
Given(/^Amazon\.co\.uk is open and I am logged in with "([^"]*)"high(\d+)"$/) do |username, password|
  @homePage = @basePage.go_to_amazon_home
  @homePage.visit_sigin
  @loginPage.login_with(username, password)
  @welcomePage
end

When(/^I search for "([^"]*)"$/) do |arg1|
  @cart = @homePage.search_product

end

Then(/^the first result has the word  "([^"]*)" in it$/) do |arg1|
  expect(@welcomePage = @homePage.search_product).to be true
end