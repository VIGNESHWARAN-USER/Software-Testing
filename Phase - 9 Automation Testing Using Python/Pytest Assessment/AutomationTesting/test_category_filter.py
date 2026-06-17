from re import A

import pytest
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC

@pytest.mark.regression
@pytest.mark.usefixtures("setup_and_teardown")
class TestCategoryFilter:
    def test_category_filter(self):
        driver = self.driver
        wait = WebDriverWait(driver, 10)

        wait.until(EC.visibility_of_element_located((By.XPATH, "//a[text() = \"HTML\"]"))).click()

        count = len(wait.until(EC.visibility_of_all_elements_located((By.XPATH, "//ul[@class = \"products masonry-done\"]/li"))))

        assert str(count) in wait.until(EC.visibility_of_element_located((By.XPATH, "//a[text() = \"HTML\"]/following-sibling::span"))).text
        print("The number of books displayed after filtering equals the count specified in the category label, i.e.,", count)
