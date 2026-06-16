from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.action_chains import ActionChains

try:
    driver = webdriver.Chrome();
    wait = WebDriverWait(driver, 10)

    driver.maximize_window();
    driver.get("https://automationexercise.com/")

    assert driver.title == "Automation Exercise", "Home page is not reached."
    print("Home page is reached.")

    action = ActionChains(driver)

    action.scroll_by_amount(0, 10000).perform()

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[text() = \"Subscription\"]"))).text == "SUBSCRIPTION", "Subscription not displayed."
    print("Subscription displayed.")

    action.scroll_by_amount(0, -10000).perform()
    
    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[text() = \"Full-Fledged practice website for Automation Engineers\"]"))).text == "Full-Fledged practice website for Automation Engineers", "Description not displayed."
    print("Description message is displayed.")
    

    print("Test case passed.")
    
except Exception as e:
    print(e)

finally:
    driver.quit()