class BasePage

  attr_accessor :browser

  def initialize(browser)
    @browser = browser
  end


  def go_to_amazon_home
    @browser.manage.window.maximize
    @browser.manage.timeouts.implicit_wait = 30
    @browser.navigate.to("http://www.amazon.co.uk")
    return HomePage.new(@browser)
  end


end