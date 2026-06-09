from selenium import webdriver
import pytest

@pytest.fixture(params=["https://tutorialsninja.com/demo/"])
def driver(request):
    driver = webdriver.Chrome()
    driver.maximize_window()
    driver.implicitly_wait(5)
    print(request.param)
    driver.get(request.param)
    request.cls.driver = driver
    yield driver
    driver.quit()