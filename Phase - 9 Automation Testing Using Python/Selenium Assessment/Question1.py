from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC

try:
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.get("https://automationexercise.com/")
    wait = WebDriverWait(driver, 10)

    def send_keys(element, value):
        driver.execute_script("arguments[0].value = arguments[1];",element,value)

    def click(element):
        driver.execute_script("arguments[0].click();",element)

    assert driver.find_element(By.XPATH, "//h1/span[text() = \"Automation\"]").is_displayed(), "Home page is not reached"
    print("Reached home page")
    signup_link = wait.until(EC.visibility_of_element_located((By.XPATH, "//a[@href = \"/login\"]")))
    click(signup_link)

    name = wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@data-qa = \"signup-name\"]")))
    email = wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@data-qa = \"signup-email\"]")))
    signup_button = wait.until(EC.visibility_of_element_located((By.XPATH, "//button[@data-qa = \"signup-button\"]")))

    send_keys(name, "Vigneshwaran")
    send_keys(email, "vigneshwaran@gmail.com2")
    click(signup_button)

    title = wait.until(EC.visibility_of_element_located((By.XPATH, "//input[@id = \"id_gender1\"]")))
    password = driver.find_element(By.XPATH, "//input[@data-qa = \"password\"]")
    newsletter = driver.find_element(By.XPATH, "//input[@id = \"newsletter\"]")
    optin = driver.find_element(By.XPATH, "//input[@id = \"optin\"]")
    first_name = driver.find_element(By.XPATH, "//input[@data-qa = \"first_name\"]")
    last_name = driver.find_element(By.XPATH, "//input[@data-qa = \"last_name\"]")
    company = driver.find_element(By.XPATH, "//input[@data-qa = \"company\"]")
    address = driver.find_element(By.XPATH, "//input[@data-qa = \"address\"]")
    address2 = driver.find_element(By.XPATH, "//input[@data-qa = \"address2\"]")
    state = driver.find_element(By.XPATH, "//input[@data-qa = \"state\"]")
    city = driver.find_element(By.XPATH, "//input[@data-qa = \"city\"]")
    zipcode = driver.find_element(By.XPATH, "//input[@data-qa = \"zipcode\"]")
    mobile_number = driver.find_element(By.XPATH, "//input[@data-qa = \"mobile_number\"]")
    submit_button = driver.find_element(By.XPATH, "//button[@data-qa = \"create-account\"]")

    click(title)
    send_keys(password, "1234")
    click(newsletter)
    click(optin)
    send_keys(first_name, "Vigneshwaran")
    send_keys(last_name, "M")
    send_keys(company, "Company")
    send_keys(address, "Salem")
    send_keys(address2, "Salem")
    send_keys(state, "TN")
    send_keys(city, "Salem")
    send_keys(zipcode, "637501")
    send_keys(mobile_number, "9092174486")

    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//b[text() = \"Account Created!\"]"))).is_displayed(), "Account creation failed."

    click_button = wait.until(EC.element_to_be_clickable((By.XPATH, "//a[text() = \"Continue\"]")))
    click(click_button)

    username = wait.until(EC.visibility_of_element_located((By.XPATH, "//b"))).text
    assert username == "Vigneshwaran", "Signup Failed."
    print("Account is created") 
    add_to_cart = wait.until(EC.visibility_of_element_located((By.XPATH, "//a[@data-product-id = \"1\"]")))
    click(add_to_cart)

    cart_button = wait.until(EC.visibility_of_element_located((By.XPATH, "//a[@href = \"/view_cart\"]")))
    click(cart_button)
    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//li[text() = \"Shopping Cart\"]"))).is_displayed(), "Cannot open shopping cart page."
    print("Shopping cart page is reached")

    proceed_to_checkout = wait.until(EC.visibility_of_element_located((By.XPATH, "//a[text() = \"Proceed To Checkout\"]")))

    first_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_delivery\"]/li[@class = \"address_firstname address_lastname\"]"))).text.split(" ")
    assert "Mr." == first_row[0] and "Vigneshwaran" == first_row[1] and "M" == first_row[2]
    second_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_delivery\"]/li[@class = \"address_address1 address_address2\"]"))).text
    assert "Salem" == second_row  
    third_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_delivery\"]/li[@class = \"address_city address_state_name address_postcode\"]"))).text.split(" ")
    assert "Salem" == third_row[0] and "Tamil Nadu" == third_row[1] and "637501" == third_row[2]
    fourth_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_delivery\"]/li[@class = \"address_country_name\"]"))).text
    assert "India" == fourth_row
    fourth_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_delivery\"]/li[@class = \"address_phone\"]"))).text
    assert "9092174486" == fourth_row
    print("Delivery Address verified")

    first_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_invoice\"]/li[@class = \"address_firstname address_lastname\"]"))).text.split(" ")
    assert "Mr." == first_row[0] and "Vigneshwaran" == first_row[1] and "M" == first_row[2]
    second_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_invoice\"]/li[@class = \"address_address1 address_address2\"]"))).text
    assert "Salem" == second_row  
    third_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_invoice\"]/li[@class = \"address_city address_state_name address_postcode\"]"))).text.split(" ")
    assert "Salem" == third_row[0] and "Tamil Nadu" == third_row[1] and "637501" == third_row[2]
    fourth_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_invoice\"]/li[@class = \"address_country_name\"]"))).text
    assert "India" == fourth_row
    fourth_row = wait.until(EC.visibility_of_element_located((By.XPATH, "//ul[@id = \"address_invoice\"]/li[@class = \"address_phone\"]"))).text
    assert "9092174486" == fourth_row
    print("Delivery Address verified")

    delete_button = wait.until(EC.element_to_be_clickable((By.XPATH, "//a[@href = \"/delete_account\"]")))
    click(delete_button)
    assert wait.until(EC.visibility_of_element_located((By.XPATH, "//b[text() = \"Account Deleted!\"]"))).is_displayed(), "Cannot delete account."
    print("Test Case Passed")
except Exception as e:
    print(e)

finally:
    driver.quit()
