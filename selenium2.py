import time

from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.common.exceptions import NoSuchElementException

browser = webdriver.Firefox()
url = 'http://reverb.echo.nasa.gov/reverb/'
browser.get(url)

for i in range(10):
    try:
        browser.find_element_by_xpath(
            ".//*[contains(text(), '15 Minute Stream Flow Data: USGS (FIFE)')]"
        ).click()
        break
    except NoSuchElementException as e:
        print('retry in 1s.')
        time.sleep(1)
else:
    raise e
