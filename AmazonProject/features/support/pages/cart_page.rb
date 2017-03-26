require_relative '../pages/base_page'

class CartPage < BasePage

    def initialize (browser)
      super(browser)

    end

    def basket_product
      @browser.find_element(:id => 'nav-cart-count').click
      return CheckoutPage.new(@browser)
    end

end