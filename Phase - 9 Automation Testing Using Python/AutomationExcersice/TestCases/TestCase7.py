from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

try:
    driver = webdriver.Chrome();
    wait = WebDriverWait(driver, 10)

    driver.maximize_window();
    driver.get("https://automationexercise.com/")

    assert driver.title == "Automation Exercise", "Home page is not reached."
    print("Home page is reached.")

    wait.until(EC.element_to_be_clickable((By.XPATH, "//a[@href = \"/test_cases\"]"))).click()

    windows = driver.window_handles
    flag = True
    for window in windows:
        driver.switch_to.window(window)
            
        if driver.current_url == "https://automationexercise.com/test_cases":
            print("The user switched to test cases window")
            print("Test case passed")
            flag = False
            
    if(flag):
        print("Test case failed.")
    
except Exception as e:
    print(e)

finally:
    driver.quit()