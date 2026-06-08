from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

try:
    driver = webdriver.Chrome()
    wait = WebDriverWait(driver, 10)

    driver.maximize_window()
    driver.get("https://automationexercise.com/")

    assert driver.title == "Automation Exercise", "Home page title mismatch"
    print("Home page is reached.")

    login_link = wait.until(
        EC.presence_of_element_located(
            (By.XPATH, "//a[@href='/login']")
        )
    )
    driver.execute_script("arguments[0].click();", login_link)

    assert wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//h2[text()='Login to your account']")
        )
    ).is_displayed(), "Login page is not reached"

    print("Login text is verified")

    email = wait.until(
        EC.presence_of_element_located(
            (By.XPATH, "//input[@data-qa='login-email']")
        )
    )

    driver.execute_script(
        "arguments[0].value = arguments[1];",
        email,
        "vigneshwaran.coder@gmail.com4"
    )

    password = driver.find_element(
        By.XPATH,
        "//input[@data-qa='login-password']"
    )

    driver.execute_script(
        "arguments[0].value = arguments[1];",
        password,
        "1234"
    )

    login_button = driver.find_element(
        By.XPATH,
        "//button[@data-qa='login-button']"
    )

    driver.execute_script(
        "arguments[0].click();",
        login_button
    )

    assert wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//i/following-sibling::b")
        )
    ).text == "Vignesh", "Cannot login"

    print("Login Successful")

    delete_btn = wait.until(
        EC.presence_of_element_located(
            (By.XPATH, "//a[@href='/delete_account']")
        )
    )

    driver.execute_script(
        "arguments[0].click();",
        delete_btn
    )

    assert wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//b[text()='Account Deleted!']")
        )
    ).is_displayed(), "Cannot delete account"

    print("Account deleted successfully.")
    print("Test case passed.")

except Exception as e:
    print(f"Test Failed: {e}")
    raise

finally:
    driver.quit()