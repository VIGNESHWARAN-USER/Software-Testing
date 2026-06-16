from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()

driver.maximize_window()
driver.get("https://www.google.com")

search = driver.find_element(By.NAME, "q")
search.send_keys("Python Selenium")
search.submit()
time.sleep(3)
driver.save_screenshot("screenshot.png")
print("Title:", driver.title)

time.sleep(5)

driver.quit()