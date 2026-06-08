from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import traceback

class CannotClickButtonException(Exception):

    pass


def close_google_vignette_if_present(driver):

    try:

        for frame in driver.find_elements(By.TAG_NAME, "iframe"):
            try:
                driver.switch_to.frame(frame)

                buttons = driver.find_elements(
                    By.XPATH,
                    "//*[contains(text(),'Close')]"
                )

                print(f"Found {len(buttons)} buttons")

                driver.switch_to.default_content()

            except Exception as e:
                print(type(e).__name__)
                print(str(e))
                traceback.print_exc()

            finally:
                driver.switch_to.default_content()

    except Exception:
        pass

    return False


def click(driver, locator, timeout=10):

    wait = WebDriverWait(driver, timeout)

    try:
        element = wait.until(
            EC.element_to_be_clickable(locator)
        )

        element.click()

    except Exception:

        ad_closed = close_google_vignette_if_present(driver)

        if ad_closed:

            try:
                element = wait.until(
                    EC.element_to_be_clickable(locator)
                )

                element.click()
                return

            except Exception:
                pass

        raise CannotClickButtonException(
            f"Unable to click element: {locator}"
        )