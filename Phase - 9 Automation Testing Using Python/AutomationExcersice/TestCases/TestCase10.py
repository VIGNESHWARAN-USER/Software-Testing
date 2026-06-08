from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

def waitForElement(locator):
    return wait.until(EC.visibility_of_element_located(locator))

def waitForClickable(locator):
    return wait.until(EC.element_to_be_clickable(locator))

def jsClick(element):
    driver.execute_script("arguments[0].click();", element)

def scrollIntoView(element):
    driver.execute_script("arguments[0].scrollIntoView();", element)

try:
    driver=webdriver.Chrome()
    wait=WebDriverWait(driver, 10)

    driver.maximize_window()
    driver.get("https://automationexercise.com/")

    assert driver.title=="Automation Exercise", "Home page title mismatch"
    print("Home page is reached.")

    subscribeLetter=waitForElement((By.ID, "susbscribe_email"))

    scrollIntoView(subscribeLetter)

    subscribeLetter.send_keys("vetri@gmail.com")

    subscribeButton=waitForElement((By.ID, "subscribe"))
    jsClick(subscribeButton)

    successMessage=waitForElement((By.XPATH, "//div[@class='alert-success alert']"))

    assert successMessage.is_displayed()
    print("Subscription successful")

except Exception:
    import traceback
    traceback.print_exc()

finally:
    driver.quit()