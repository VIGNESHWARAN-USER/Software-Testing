from selenium.webdriver.common.by import By

class RegisterPage:
    first_name = (By.ID, "input-firstname")
    last_name = (By.ID, "input-lastname")
    phone = (By.ID, "input-telephone")
    email_input = (By.ID, "input-email")
    password_input = (By.ID, "input-password")
    confirm_password_input = (By.ID, "input-confirm")
    privacy_policy = (By.XPATH, "//input[@name = \"agree\"]")
    continue_button = (By.XPATH,"//input[@value='Continue']")
    success_message = (By.XPATH, "//h1[text() = \"Your Account Has Been Created!\"]")
    