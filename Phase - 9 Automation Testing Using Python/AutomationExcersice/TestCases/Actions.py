from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import (
    TimeoutException,
    ElementClickInterceptedException
)
import traceback


class CannotClickButtonException(Exception):
    pass


def dismiss_ads(driver):
    try:
        driver.execute_script("""
            document.querySelectorAll(
                "iframe, .adsbygoogle, [id*='google_ads'], [id*='aswift']
            ).forEach(el => el.remove());
        """)
        print("[INFO] Ads removed")
        return True

    except Exception as e:
        print("[ERROR] Failed to remove ads")
        print(type(e).__name__)
        print(str(e))
        return False


def click(driver, locator, timeout=10):

    print(f"\n[INFO] Attempting click: {locator}")

    wait = WebDriverWait(driver, timeout)

    try:
        element = wait.until(
            EC.element_to_be_clickable(locator)
        )

        print("[INFO] Element located and clickable")

        element.click()

        print("[INFO] Click successful")

    except ElementClickInterceptedException as e:

        print("\n[WARNING] Click intercepted")
        print(type(e).__name__)
        print(str(e))

        dismiss_ads(driver)

        try:
            element = wait.until(
                EC.element_to_be_clickable(locator)
            )

            driver.execute_script(
                "arguments[0].scrollIntoView({block:'center'});",
                element
            )

            element.click()

            print("[INFO] Click successful after removing ads")

        except Exception as retry_error:

            print("\n[ERROR] Retry click failed")
            print(type(retry_error).__name__)
            print(str(retry_error))
            traceback.print_exc()

            raise CannotClickButtonException(
                f"Unable to click element after retry: {locator}"
            ) from retry_error

    except TimeoutException as e:

        print("\n[ERROR] Element not clickable within timeout")
        print(type(e).__name__)
        print(str(e))
        traceback.print_exc()

        raise

    except Exception as e:

        print("\n[ERROR] Unexpected exception during click")
        print(type(e).__name__)
        print(str(e))
        traceback.print_exc()

        raise