from re import A

import pytest
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC

@pytest.mark.usefixtures("setup_and_teardown")
class TestValidatePrice:
    def test_validate_price(self):
        driver = self.driver
        wait = WebDriverWait(driver, 10)

        driver.execute_script("scrollTo(0, 100000)")

        assert wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@type = \"submit\"]"))).is_displayed()
