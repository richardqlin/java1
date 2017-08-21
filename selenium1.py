from selenium import webdriver

firefox = webdriver.Firefox()
firefox.get("put your url here");
transactionElements = firefox.find_elements_by_css_selector("table[class='transaction-table'] li");
for element in transactionElements:
    element.click()