from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver import ActionChains
import time

driver = webdriver.Chrome()

driver.maximize_window()
driver.get("https://www.google.com")

print(driver.current_window_handle)

time.sleep(3)
driver.save_screenshot("screenshot.png")
print("Title:", driver.title)

time.sleep(5)

driver.quit()