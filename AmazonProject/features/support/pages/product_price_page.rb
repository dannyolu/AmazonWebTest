require_relative '../pages/base_page'

class ProductPricePage < BasePage
  def initialize(browser)
    super(browser)
  end

  def product_price ()
    @browser.find_element(:classname => 'a-size-base a-color-price s-price a-text-bold').click
    @browser.find_element(:id => 'add-to-cart-button').click
    return CartPage.new(browser)
  end

end