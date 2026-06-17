import pytest
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from utilities.excel_reader import get_data
from actions.login_action import LoginAction

@pytest.mark.regression
@pytest.mark.usefixtures("setup")
class TestLogin:


    @pytest.mark.parametrize("email,password",get_data("login_data.xlsx", "ValidLoginData"))
    def test_valid_login(self, email, password):
        self.la = LoginAction(self.driver)
        self.la.login(email, password)

        assert self.la.check_if_logged_in()

    @pytest.mark.parametrize("email,password,message",get_data("login_data.xlsx", "InvalidLoginData"))
    def test_invalid_login(self, email, password, message):
        self.la = LoginAction(self.driver)
        self.la.login(email, password)

        assert self.la.check_error_message(message)
