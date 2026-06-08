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

    wait.until(EC.element_to_be_clickable((By.XPATH, "//a[@href = \"/contact_us\"]"))).click()

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[text() = \"Get In Touch\"]"))).is_displayed(), "Get In Touch message is not available."
    print("Get In Touch message is verified")

    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@name = \"name\"]"))).send_keys("Vignesh")
    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@name = \"email\"]"))).send_keys("vigneshwaran.coder@gmail.com")
    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@name = \"subject\"]"))).send_keys("Sample Test")
    wait.until(EC.visibility_of_element_located((By.XPATH, "//textarea[@data-qa = \"message\"]"))).send_keys("This is a sample test")
    driver.find_element(By.XPATH,"//input[@data-qa = \"submit-button\"]").click()

    wait.until(EC.alert_is_present())
    alert = driver._switch_to.alert

    alert.accept()
    print("Alert handled")

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//div[@class = \"status alert alert-success\"]"))).text == "Success! Your details have been submitted successfully.", "Success message is not displayed"
    print("Success Message is displayed")
    print("Test cases passed")
    
except Exception as e:
    print(e)

finally:
    driver.quit()