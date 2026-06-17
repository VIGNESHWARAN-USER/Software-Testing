from operator import truediv
from re import A

import pytest
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC

@pytest.mark.smoke
@pytest.mark.usefixtures("setup_and_teardown")
class TestValidateTabNavigation:
    def test_validate_tab_navigation(self):
        driver = self.driver
        wait = WebDriverWait(driver, 10)

        wait.until(EC.visibility_of_element_located((By.XPATH, "//h3[text() = \"JS Data Structures and Algorithm\"]"))).click()
                
        assert "product" in driver.current_url
        assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h1"))).text == "JS Data Structures and Algorithm"

        print("The product detail page is opened properly.")

        