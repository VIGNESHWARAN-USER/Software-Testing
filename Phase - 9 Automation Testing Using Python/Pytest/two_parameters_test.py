from selenium import webdriver
from selenium.webdriver.chrome.options import Options as ChromeOptions
from selenium.webdriver.firefox.options import Options as FirefoxOptions
import pytest

@pytest.mark.search
@pytest.mark.parametrize("browser", ["Chrome", "Firefox"])
@pytest.mark.parametrize("url", ["https://www.flipkart.com", "https://www.amazon.com"])
def test_google_search(browser, url):

    driver = None

    if browser == "Chrome":

        chrome_options = ChromeOptions()
        chrome_options.add_argument("--headless=new")
        chrome_options.add_argument("--disable-gpu")
        chrome_options.add_argument("--window-size=1920,1080")

        driver = webdriver.Chrome(options=chrome_options)

    elif browser == "Firefox":

        firefox_options = FirefoxOptions()
        firefox_options.add_argument("--headless")

        driver = webdriver.Firefox(options=firefox_options)

    driver.get(url)

    print(f"Title: {driver.title}")
    assert driver.title != ""

    driver.quit()