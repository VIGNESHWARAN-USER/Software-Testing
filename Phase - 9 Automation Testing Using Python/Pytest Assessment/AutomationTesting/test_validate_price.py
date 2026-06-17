from re import A

import pytest
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC

@pytest.mark.smoke
@pytest.mark.usefixtures("setup_and_teardown")
class TestValidatePrice:
    def test_validate_price(self):
        driver = self.driver
        wait = WebDriverWait(driver, 10)

        price = wait.until(EC.visibility_of_element_located((By.XPATH, "//h3[text() = \"HTML5 Forms\"]/following-sibling::span/span"))).text

        assert price == "₹280.00"
        print("The price of the “HTML5 Forms” book is displayed as ₹280.00.")
