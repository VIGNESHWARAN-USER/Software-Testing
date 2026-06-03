from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()

driver.maximize_window()
driver.get("https://www.google.com")

search = driver.find_element(By.NAME, "q")

if search.is_enabled():
    search.send_keys("Python Selenium")
    time.sleep(3)
    driver.save_screenshot("screenshot.png")
    submit_button = driver.find_element(By.CLASS_NAME, "lTxWLe")
    if(submit_button.is_enabled()):
        submit_button.click()
    print("Title:", driver.title)
driver.quit()