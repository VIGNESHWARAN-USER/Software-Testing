import { test, expect } from '@playwright/test';

test('Update product quantity and verify cart', async ({ page }) => {
    async function dismissAds() {
        await page.evaluate(() => {
            document.querySelectorAll(
                "iframe, .adsbygoogle, [id*='google_ads'], [id*='aswift']"
            ).forEach(el => el.remove());
        }).catch(() => {});
    }
    await page.goto('https://automationexercise.com/');
    await dismissAds();
    await page.locator("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]").click();
    await dismissAds();
    const quantity = page.locator("//input[@id='quantity']");
    await quantity.fill('4');
    await page.locator("//button[@type='button']").click();
    await page.locator("//u[normalize-space()='View Cart']").click();
    await dismissAds();
    const updatedQuantity = page.locator("//td[@class='cart_quantity']/button");
    await expect(updatedQuantity).toHaveText('4');
    console.log(await updatedQuantity.textContent());
});