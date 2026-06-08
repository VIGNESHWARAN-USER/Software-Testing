from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.options import Options
import time
import pytest

@pytest.mark.search
@pytest.mark.parametrize("browser", ["Chrome", "Firefox"])
@pytest.mark.parametrize("url", ["https://www.flipkart.com", "https://www.amazon.com"])
def test_google_search(browser, url):

    driver = None

    if browser == "Chrome":
        driver = webdriver.Chrome()
    else:
        driver = webdriver.Firefox()

    driver.get(url)
    driver.quit()