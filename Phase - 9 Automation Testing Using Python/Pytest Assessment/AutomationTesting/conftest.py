import pytest
from selenium import webdriver

@pytest.fixture()
def setup_and_teardown(request):
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.get("https://practice.automationtesting.in/shop/")

    request.cls.driver = driver

    yield

    driver.quit()