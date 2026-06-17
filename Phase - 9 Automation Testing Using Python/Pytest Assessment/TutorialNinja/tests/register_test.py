import pytest
from utilities.config_reader import get_value
from actions.register_action import RegisterAction

@pytest.mark.smoke
@pytest.mark.usefixtures("setup")
class TestRegister:

    def test_valid_register(self):

        self.ra = RegisterAction(self.driver)

        first_name = get_value("config.ini", "register data", "first_name")
        last_name = get_value("config.ini", "register data", "last_name")
        phone = get_value("config.ini", "register data", "phone")
        email = get_value("config.ini", "register data", "email")
        password = get_value("config.ini", "register data", "password")
        self.ra.register(first_name, last_name, phone, email, password)

        assert self.ra.check_if_signed_up(), "Sign Up failed"
        print("Sign Up Successful")

