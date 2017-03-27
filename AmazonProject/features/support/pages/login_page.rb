require_relative '../pages/base_page'

class LoginPage < BasePage

  USERNAME_LOCATOR = {:id => 'ap_email'}
  PASSWORD_LOCATOR ={:id => 'ap_password'}
  LOGIN_BUTTON_LOCATOR = {:id => 'signInSubmit'}

  def initialize(browser)
    super(browser)
  end

  def login_with(username, password)
    @browser.find_element(USERNAME_LOCATOR).send_keys(username)
    @browser.find_element(PASSWORD_LOCATOR).send_keys(password)
    @browser.find_element(LOGIN_BUTTON_LOCATOR).click
    return WelcomePage.new(@browser)
  end

end