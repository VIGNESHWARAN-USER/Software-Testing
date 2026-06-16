from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains

try:
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.get("https://automationexercise.com/")
    wait = WebDriverWait(driver, 10)

    def click(element):
        driver.execute_script("arguments[0].click();",element)
   
    assert driver.find_element(By.XPATH, "//h1/span[text() = \"Automation\"]").is_displayed(), "Home page is not reached"
    print("Home page is reached")
    driver.execute_script("scrollTo(0, 100000)")

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[text() = \"Subscription\"]"))).is_displayed(), "Subscription not displayed."
    print("Subscription is visible")
    up_button = wait.until(EC.visibility_of_element_located((By.XPATH, "//a[@id = \"scrollUp\"]")))
    click(up_button)
    
    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[text() = \"Full-Fledged practice website for Automation Engineers\"]"))).is_displayed(), "Description not displayed."
    print("Scroll Up button is working")
    print("Test Case Passed")
except Exception as e:
    print(e)

finally:
    driver.quit()