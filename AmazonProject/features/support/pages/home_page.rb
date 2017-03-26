require_relative '../pages/base_page'

class HomePage < BasePage

  def initialize(browser)
    super(browser)
  end


  def visit_sigin
    @browser.find_element(:id => "nav-link-yourAccount").click
    return LoginPage.new(@browser)
  end

end