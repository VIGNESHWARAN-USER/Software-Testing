from webbrowser import get

from selenium import webdriver
from ini_utility import get_data
import pytest

@pytest.fixture()
def driver(request):

    if get_data("./DemoBlaze/config.ini", "basic info", "browser") == "chrome":
        driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(5)
    driver.get(get_data("./DemoBlaze/config.ini", "basic info", "url"))
    request.cls.driver = driver

    yield driver

    driver.quit()