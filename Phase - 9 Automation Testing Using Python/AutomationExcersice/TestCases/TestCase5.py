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

    wait.until(EC.element_to_be_clickable((By.XPATH, "//a[@href = \"/login\"]"))).click()

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h2[text() = \"New User Signup!\"]"))).is_displayed(), "Sign up message is not available."
    print("Sign up text is verified")

    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@name = \"name\"]"))).send_keys("Vignesh")
    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@data-qa = \"signup-email\"]"))).send_keys("vigneshwaran.coder@gmail.com4")
    driver.find_element(By.XPATH,"//button[@data-qa = \"signup-button\"]").click()

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//p[text() = \"Email Address already exist!\"]"))).is_displayed(), "Error message is not displayed."
    print("Error message displayed.")
    print("Test case passed.")
    
except Exception as e:
    print(e)

finally:
    driver.quit()