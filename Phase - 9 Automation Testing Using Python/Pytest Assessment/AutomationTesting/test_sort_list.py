import pytest
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.ui import Select

@pytest.mark.regression
@pytest.mark.usefixtures("setup_and_teardown")
class TestSortList:
    def test_sort_list(self):
        driver = self.driver
        wait = WebDriverWait(driver, 10)

        sort_filter = wait.until(EC.visibility_of_element_located((By.XPATH, "//select[@name = \"orderby\"]")))        
        select = Select(sort_filter)
        select.select_by_index(4)
        
        flag = True
        discount_count = len(wait.until(EC.visibility_of_all_elements_located((By.XPATH, "//span[@class = \"price\"]/del"))))
        book_prices = wait.until(EC.visibility_of_all_elements_located((By.XPATH, "//span[@class = \"woocommerce-Price-amount amount\"]")))
        for i in range(1, len(book_prices)):
            print((float) (book_prices[i-1].text[1:]))
            if (float) (book_prices[i-1].text[1:]) > (float) (book_prices[i].text[1:]):
                if discount_count > 0:
                    discount_count -= 1
                else:
                    flag = False
                    break
        assert flag
        print("The books are rearranged and displayed in ascending order of price. ")
