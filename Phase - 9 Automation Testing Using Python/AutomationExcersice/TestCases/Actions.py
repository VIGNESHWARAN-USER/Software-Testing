from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.common.by import By

def click(driver, locator):
    wait = WebDriverWait(driver, 10)

    try:
        wait.until(EC.visibility_of_element_located(locator)).click()
    except Exception as e:
        driver.switch_to.frame("frame_name")
        driver.find_element(By.XPATH, "close button").click()

        
