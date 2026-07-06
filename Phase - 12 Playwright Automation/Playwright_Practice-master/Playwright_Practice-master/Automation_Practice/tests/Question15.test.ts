import { test, expect } from '@playwright/test';

test('Place Order: Register before Checkout', async ({ page }) => {
    async function dismissAds() {
        await page.evaluate(() => {
            document.querySelectorAll(
                "iframe, .adsbygoogle, [id*='google_ads'], [id*='aswift']"
            ).forEach(el => el.remove());
        }).catch(() => {});
    }
    const email = `tamil${Date.now()}@gmail.com`;
    await page.goto('https://automationexercise.com/');
    await dismissAds();
    await expect(page).toHaveTitle(/Automation Exercise/);
    await page.locator("//a[contains(text(),'Signup / Login')]").click();
    await page.locator("//input[@data-qa='signup-name']").fill("Tamil");
    await page.locator("//input[@data-qa='signup-email']").fill(email);
    await page.locator("//button[@data-qa='signup-button']").click();
    await page.locator("#id_gender1").check();
    await page.locator("#password").fill("Tamil@123");
    await page.locator("#days").selectOption("10");
    await page.locator("#months").selectOption("5");
    await page.locator("#years").selectOption("2000");
    await page.locator("#first_name").fill("Tamil");
    await page.locator("#last_name").fill("Kumar");
    await page.locator("#company").fill("ABC");
    await page.locator("#address1").fill("Chennai");
    await page.locator("#country").selectOption("India");
    await page.locator("#state").fill("Tamil Nadu");
    await page.locator("#city").fill("Chennai");
    await page.locator("#zipcode").fill("600001");
    await page.locator("#mobile_number").fill("9876543210");
    await page.locator("//button[@data-qa='create-account']").click();
    await expect(page.locator("//b[normalize-space()='Account Created!']")).toBeVisible();
    await page.locator("//a[@data-qa='continue-button']").click();
    await dismissAds();
    await expect(page.locator("//a[contains(text(),'Logged in as')]")).toBeVisible();
    await page.locator("(//a[contains(text(),'Add to cart')])[1]").click({ force: true });
    await page.locator("//button[@class='btn btn-success close-modal btn-block']").click();
    await page.locator("//a[contains(text(),'Cart')]").click();
    await expect(page.locator("#cart_info")).toBeVisible();
    await page.locator("//a[contains(text(),'Proceed To Checkout')]").click();
    await expect(page.locator("#address_delivery")).toBeVisible();
    await expect(page.locator("#cart_info")).toBeVisible();
    await page.locator("textarea[name='message']").fill("Please deliver as soon as possible.");
    await page.locator("//a[contains(text(),'Place Order')]").click();
    await page.locator("input[name='name_on_card']").fill("Tamil Kumar");
    await page.locator("input[name='card_number']").fill("4111111111111111");
    await page.locator("input[name='cvc']").fill("123");
    await page.locator("input[name='expiry_month']").fill("12");
    await page.locator("input[name='expiry_year']").fill("2030");
    await page.locator("#submit").click();
    await expect(page.locator("//p[contains(text(),'Congratulations! Your order has been confirmed!')]")).toBeVisible();
    await page.locator("//a[contains(text(),'Delete Account')]").click();
    await expect(page.locator("//b[contains(text(),'Account Deleted!')]")).toBeVisible();
    await page.locator("//a[@data-qa='continue-button']").click();
});