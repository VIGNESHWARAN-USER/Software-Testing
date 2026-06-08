from selenium import webdriver
from selenium.webdriver.common.by import By
import time
import pytest

@pytest.mark.search
@pytest.mark.parametrize("search_key", ["Pytest", "Selenium", "Python"])
def test_google_search(search_key):
    driver = webdriver.Chrome()

    driver.maximize_window()
    driver.get("https://www.google.com")

    search = driver.find_element(By.NAME, "q")

    if search.is_enabled():
        search.send_keys(search_key)
        time.sleep(3)
        driver.save_screenshot(f"screenshot_{search_key}.png")
        submit_button = driver.find_element(By.CLASS_NAME, "u4Uk3c")
        if(submit_button.is_enabled()):
            submit_button.click()
        print("Title:", driver.title)
    driver.quit()