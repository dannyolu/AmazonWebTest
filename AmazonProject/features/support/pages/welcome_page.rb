require_relative '../pages/base_page'

class WelcomePage < BasePage

  def initialize(browser)
    super(browser)
  end


  def validate_successful_login(message)
    return @browser.page_source.downcase.include?(message.downcase)
  end

  def search_product
    @browser.find_element(:id => 'twotabsearchtextbox').send_keys('tv stand')
    @browser.find_element(:id => 'nav-input').click
    return ProductPricePage.new(@browser)
  end
end