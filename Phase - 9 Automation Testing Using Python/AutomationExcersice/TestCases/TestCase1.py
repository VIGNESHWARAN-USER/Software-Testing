from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome();
driver.maximize_window();
driver.get("https://automationexercise.com/")

page_title = "Automation Exercise"
org_title = driver.title

if(org_title == page_title):
    print("Home page is reached.")

    driver.find_element(By.XPATH, "//a[@href = \"/login\"]").click()
    if(driver.find_element(By.XPATH, "//h2[text() = \"New User Signup!\"]").is_displayed()):
        print("Sign up text is verified")
        nameInput = driver.find_element(By.XPATH, "//input[@name = \"name\"]").send_keys("Vignesh")
        mailInput = driver.find_element(By.XPATH, "//input[@data-qa = \"signup-email\"]").send_keys("vigneshwaran.coder@gmail.com3")
        driver.find_element(By.XPATH, "//button[@data-qa = \"signup-button\"]").click()

        if(driver.find_element(By.XPATH, "//b[text() = \"Enter Account Information\"]").is_displayed()):
            driver.find_element(By.XPATH, "//input[@data-qa = \"password\"]").send_keys("1234")
            driver.find_element(By.XPATH, "//input[@name = \"newsletter\"]").click()
            driver.find_element(By.XPATH, "//input[@name = \"optin\"]").click()
            driver.find_element(By.XPATH, "//input[@data-qa = \"first_name\"]").send_keys("Vigneshwaran")
            driver.find_element(By.XPATH, "//input[@data-qa = \"last_name\"]").send_keys("M")
            driver.find_element(By.XPATH, "//input[@data-qa = \"address\"]").send_keys("Salem")
            driver.find_element(By.XPATH, "//input[@data-qa = \"city\"]").send_keys("Salem")
            driver.find_element(By.XPATH, "//input[@data-qa = \"state\"]").send_keys("Tamil Nadu")
            driver.find_element(By.XPATH, "//input[@data-qa = \"zipcode\"]").send_keys("637501")
            driver.find_element(By.XPATH, "//input[@data-qa = \"mobile_number\"]").send_keys("9092174486")
            driver.find_element(By.XPATH, "//button[@data-qa = \"create-account\"]").click()


            if(driver.find_element(By.XPATH, "//b[text() = \"Account Created!\"]")):
                driver.find_element(By.XPATH, "//a[text() = \"Continue\"]").click()

                if(driver.find_element("//b").text == "VIGNESHWARAN"):
                    print("Login Successfull")
                    driver.find_element(By.XPATH, "//a[@href = \"/delete_account\"]").click()

                    if(driver.find_element("//b[text() = \"Account Deleted!\"]").is_displayed()):
                        print("Account deleted successfully.")
                    else:
                        print("Cannot delete account.")
                else:
                    print("Cannot login")

    else:
        print("Sign up message is not available.")
else:
    print("Home page is not reached.")