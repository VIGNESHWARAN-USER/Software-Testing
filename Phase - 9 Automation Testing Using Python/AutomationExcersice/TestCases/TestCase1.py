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
    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@data-qa = \"signup-email\"]"))).send_keys("vigneshwaran.coder@gmail.com5")
    driver.find_element(By.XPATH,"//button[@data-qa = \"signup-button\"]").click()

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//b[text() = \"Enter Account Information\"]"))).is_displayed(), "Account information page is not reached."

    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@data-qa = \"password\"]"))).send_keys("1234")
    driver.find_element(By.XPATH,"//input[@name = \"newsletter\"]").click()
    driver.find_element(By.XPATH,"//input[@name = \"optin\"]").click()
    driver.find_element(By.XPATH,"//input[@data-qa = \"first_name\"]").send_keys("Vigneshwaran")
    driver.find_element(By.XPATH,"//input[@data-qa = \"last_name\"]").send_keys("M")
    driver.find_element(By.XPATH,"//input[@data-qa = \"address\"]").send_keys("Salem")
    driver.find_element(By.XPATH,"//input[@data-qa = \"city\"]").send_keys("Salem")
    driver.find_element(By.XPATH,"//input[@data-qa = \"state\"]").send_keys("Tamil Nadu")
    driver.find_element(By.XPATH,"//input[@data-qa = \"zipcode\"]").send_keys("637501")
    driver.find_element(By.XPATH,"//input[@data-qa = \"mobile_number\"]").send_keys("9092174486")
    driver.find_element(By.XPATH,"//button[@data-qa = \"create-account\"]").click()

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//b[text() = \"Account Created!\"]"))).is_displayed(), "Account creation failed."

    wait.until(EC.element_to_be_clickable((By.XPATH, "//a[text() = \"Continue\"]"))).click()
    username = wait.until(EC.visibility_of_element_located((By.XPATH, "//b"))).text
    print(username)

    assert username == "Vignesh", "Cannot login"
    print("Login Successfull")

    wait.until(EC.element_to_be_clickable((By.XPATH, "//a[@href = \"/delete_account\"]"))).click()

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//b[text() = \"Account Deleted!\"]"))).is_displayed(), "Cannot delete account."
    print("Account deleted successfully.")
    print("Test case passed.")
    
except Exception as e:
    print(e)

finally:
    driver.quit()