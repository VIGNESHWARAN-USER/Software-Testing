import pytest
from selenium.webdriver.common.by import By
from ini_utility import get_data
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

@pytest.mark.usefixtures("driver")
class TestLogin:

    

    def test_valid_login(self):
        wait = WebDriverWait(self.driver, 10)
        wait.until(EC.visibility_of_element_located((By.XPATH, "//a[@id = \"login2\"]"))).click()
        wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@id = 'loginusername']"))).send_keys(get_data("./DemoBlaze/config.ini", "credentials", "valid_uname"))
        wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@id = 'loginpassword']"))).send_keys(get_data("./DemoBlaze/config.ini", "credentials", "valid_password"))
        wait.until(EC.visibility_of_element_located((By.XPATH, "//button[text() = \"Log in\"]"))).click()
        assert get_data("./DemoBlaze/config.ini", "credentials", "valid_uname") in wait.until(EC.visibility_of_element_located((By.XPATH, "//a[contains(text(), \"Welcome\")]"))).text, "Login unsuccessfull"

    def test_invalid_login(self):
        wait = WebDriverWait(self.driver, 10)
        wait.until(EC.visibility_of_element_located((By.XPATH, "//a[@id = \"login2\"]"))).click()
        wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@id = 'loginusername']"))).send_keys(get_data("./DemoBlaze/config.ini", "credentials", "invalid_uname"))
        wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@id = 'loginpassword']"))).send_keys(get_data("./DemoBlaze/config.ini", "credentials", "invalid_password"))
        wait.until(EC.visibility_of_element_located((By.XPATH, "//button[text() = \"Log in\"]"))).click()
        wait.until(EC.alert_is_present())
        alert = self.driver.switch_to.alert
        assert alert.text == get_data("./DemoBlaze/config.ini", "alert messages", "invalid_login_alert_message"), "Test case failed"
    