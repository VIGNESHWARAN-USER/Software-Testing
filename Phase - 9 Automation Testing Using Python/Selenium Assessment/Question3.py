from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

try:
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC")
    wait = WebDriverWait(driver, 10)

    wait.until(EC.element_to_be_clickable((By.XPATH, "//a[contains(@href ,\"register.htm\")]"))).click()
    driver.find_element(By.XPATH, "//input[@name = \"customer.firstName\"]").send_keys("Vigneshwaran")
    driver.find_element(By.XPATH, "//input[@name = \"customer.lastName\"]").send_keys("M")
    driver.find_element(By.XPATH, "//input[@name = \"customer.address.street\"]").send_keys("Gandhi Nagar")
    driver.find_element(By.XPATH, "//input[@name = \"customer.address.city\"]").send_keys("Salem")
    driver.find_element(By.XPATH, "//input[@name = \"customer.address.state\"]").send_keys("TN")
    driver.find_element(By.XPATH, "//input[@name = \"customer.address.zipCode\"]").send_keys("637501")
    driver.find_element(By.XPATH, "//input[@name = \"customer.phoneNumber\"]").send_keys("9092174486")
    driver.find_element(By.XPATH, "//input[@name = \"customer.ssn\"]").send_keys("100")
    driver.find_element(By.XPATH, "//input[@name = \"customer.username\"]").send_keys("vetri2")
    driver.find_element(By.XPATH, "//input[@name = \"customer.password\"]").send_keys("1234")
    driver.find_element(By.XPATH, "//input[@name = \"repeatedPassword\"]").send_keys("1234")
    driver.find_element(By.XPATH, "//input[@value = \"Register\"]").click()


    wait.until(EC.element_to_be_clickable((By.XPATH, "//a[@href = \"billpay.htm\"]"))).click()

    wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@name = \"payee.name\"]"))).send_keys("Vigneshwaran")
    driver.find_element(By.XPATH, "//input[@name = \"payee.address.street\"]").send_keys("Gandhi Nagar")
    driver.find_element(By.XPATH, "//input[@name = \"payee.address.city\"]").send_keys("Salem")
    driver.find_element(By.XPATH, "//input[@name = \"payee.address.state\"]").send_keys("TN")
    driver.find_element(By.XPATH, "//input[@name = \"payee.address.zipCode\"]").send_keys("637501")
    driver.find_element(By.XPATH, "//input[@name = \"payee.phoneNumber\"]").send_keys("9092174486")

    driver.find_element(By.XPATH, "//input[@name = \"payee.accountNumber\"]").send_keys("1234567890")
    driver.find_element(By.XPATH, "//input[@name = \"verifyAccount\"]").send_keys("1234567890")
    amount = "5"
    driver.find_element(By.XPATH, "//input[@name = \"amount\"]").send_keys(amount)
    driver.find_element(By.XPATH, "//input[@value = \"Send Payment\"]").click()
    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//h1[text() = \"Bill Payment Service\"]"))).is_displayed(), "Bill payment failed"
    print("Success message verified")
    displayed_amount = wait.until(EC.visibility_of_element_located((By.XPATH, "//span[@id = \"amount\"]"))).text
    amount = "$"+amount+".00"
    assert amount == displayed_amount, "Amount transfer failed"
    print("Test Case Passed")

except Exception as e:
    print(e)

finally:
    driver.quit()
