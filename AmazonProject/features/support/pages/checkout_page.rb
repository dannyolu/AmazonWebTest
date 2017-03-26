require_relative '../pages/base_page'

class CheckoutPage < BasePage

  def initialize(browser)
    super(browser)

  end

  def price
    @browser.page_source.downcase.include?('£189.88.downcase')
  end

end