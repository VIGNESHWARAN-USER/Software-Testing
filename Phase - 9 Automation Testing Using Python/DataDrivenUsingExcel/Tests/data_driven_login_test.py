import pytest
from selenium.webdriver.common.by import By
import Utilities.excel_reader as reader
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium import webdriver
from Utilities.logger import get_logger

logger = get_logger()


@pytest.fixture()
def driver():
    logger.info("Launching Chrome Browser")

    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(5)
    driver.get("https://demoblaze.com/index.html")

    logger.info("Navigated to Demoblaze Homepage")

    yield driver

    logger.info("Closing Browser")
    driver.quit()


@pytest.mark.parametrize(
    "username, password",
    reader.get_data("login_data.xlsx", "ValidLoginData")
)
def test_valid_login(driver, username, password):

    logger.info("=" * 50)
    logger.info("Starting Valid Login Test")
    logger.info(f"Username: {username}")

    wait = WebDriverWait(driver, 10)

    logger.info("Clicking Login link")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//a[@id='login2']")
        )
    ).click()

    logger.info("Entering Username")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//input[@id='loginusername']")
        )
    ).send_keys(username)

    logger.info("Entering Password")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//input[@id='loginpassword']")
        )
    ).send_keys(password)

    logger.info("Clicking Login button")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//button[text()='Log in']")
        )
    ).click()

    welcome_text = wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//a[contains(text(),'Welcome')]")
        )
    ).text

    logger.info(f"Welcome Message: {welcome_text}")

    assert username in welcome_text, \
        f"Login unsuccessful for user: {username}"

    logger.info("Valid Login Test Passed")


@pytest.mark.parametrize(
    "username, password, error_message",
    reader.get_data("login_data.xlsx", "InvalidLoginData")
)
def test_invalid_login(driver, username, password, error_message):

    logger.info("=" * 50)
    logger.info("Starting Invalid Login Test")
    logger.info(f"Username: {username}")

    wait = WebDriverWait(driver, 10)

    logger.info("Clicking Login link")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//a[@id='login2']")
        )
    ).click()

    logger.info("Entering Username")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//input[@id='loginusername']")
        )
    ).send_keys(username)

    logger.info("Entering Password")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//input[@id='loginpassword']")
        )
    ).send_keys(password)

    logger.info("Clicking Login button")
    wait.until(
        EC.visibility_of_element_located(
            (By.XPATH, "//button[text()='Log in']")
        )
    ).click()

    logger.info("Waiting for Alert")

    wait.until(EC.alert_is_present())

    alert = driver.switch_to.alert

    logger.info(f"Actual Alert Message: {alert.text}")
    logger.info(f"Expected Alert Message: {error_message}")

    assert alert.text == error_message, \
        f"Expected '{error_message}' but got '{alert.text}'"

    logger.info("Invalid Login Test Passed")

    alert.accept()