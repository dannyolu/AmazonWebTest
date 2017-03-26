


Before do
  chrome_path = 'E:\Projects\Ruby\repositories\civic-amazon-repo\AmazonProject\drivers\chrome\chromedriver_win32\chromedriver.exe'
  @browser = Selenium::WebDriver.for(:chrome, driver_path: chrome_path)
  @basePage = BasePage.new(@browser)

end

After do
  @browser.quit
end