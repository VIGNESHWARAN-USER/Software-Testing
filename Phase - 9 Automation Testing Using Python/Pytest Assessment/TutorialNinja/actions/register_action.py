from actions.base_action import BaseAction
import pages.home_page as hp
import pages.register_page as rp
from utilities.config_reader import get_value

class RegisterAction(BaseAction):

    def __init__(self, driver):
        super().__init__(driver)
        self.rp = rp.RegisterPage()
        self.hp = hp.HomePage()

    def set_first_name(self, first_name):
            self.send_keys(self.rp.first_name, first_name)

    def set_last_name(self, last_name):
                self.send_keys(self.rp.last_name, last_name)

    def set_phone(self, phone):
                self.send_keys(self.rp.phone, phone)

    def set_email(self, email):
        self.send_keys(self.rp.email_input, email)

    def set_password(self, password):
        self.send_keys(self.rp.password_input, password)

    def set_confirm_password(self, password):
            self.send_keys(self.rp.confirm_password_input, password)

    def click_continue_button(self):
         self.click(self.rp.continue_button)

    def click_my_account_icon(self):
        self.click(self.hp.my_account_icon)

    def click_register_option(self):
        self.click(self.hp.register_button)

    def click_privacy_policy(self):
            self.click(self.rp.privacy_policy)

    def get_success_message(self):
        return self.get_text(self.rp.success_message)

    def check_if_signed_up(self):
        return self.get_success_message() == get_value("config.ini", "register data", "success_message")


    def register(self, first_name, last_name, phone, email, password):
        self.click_my_account_icon()
        self.click_register_option()
        self.set_first_name(first_name)
        self.set_last_name(last_name)
        self.set_phone(phone)
        self.set_email(email)
        self.set_password(password)
        self.set_confirm_password(password)
        self.click_privacy_policy()
        self.click_continue_button()    

    