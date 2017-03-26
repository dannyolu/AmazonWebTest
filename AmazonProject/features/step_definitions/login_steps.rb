
Given(/^Amazon\.co\.uk is open$/) do
  @homePage = @basePage.go_to_amazon_home
end


When(/^I click Sign\-in$/) do
  @loginPage = @homePage.visit_sigin
end


And(/^enter valid "([^"]*)" & "([^"]*)"$/) do |username, password|
  @welcomePage = @loginPage.login_with(username, password)
end


Then(/^I am logged in$/) do
  message = "Danny"
  expect(@welcomePage.validate_successful_login(message)).to be true
end
