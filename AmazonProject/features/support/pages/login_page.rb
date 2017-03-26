require_relative '../pages/base_page'

class LoginPage < BasePage

  def initialize(browser)
    super(browser)
  end

  def login_with(username, password)
    @browser.find_element(:id => 'ap_email').send_keys(username)
    @browser.find_element(:id => 'ap_password').send_keys(password)
    @browser.find_element(:id => 'signInSubmit').click
    return WelcomePage.new(@browser)
  end

end