import { test, expect } from '@playwright/test';

test('Remove product from cart', async ({ page }) => {
    async function dismissAds() {
        await page.evaluate(() => {
            document.querySelectorAll(
                "iframe, .adsbygoogle, [id*='google_ads'], [id*='aswift']"
            ).forEach(el => el.remove());
        }).catch(() => {});
    }
    await page.goto('https://automationexercise.com/');
    await dismissAds();
    await page.locator("(//a[contains(text(),'Add to cart')])[1]").click();
    await page.locator("//u[normalize-space()='View Cart']").click();
    await dismissAds();
    const title = page.locator("//a[normalize-space()='Blue Top']");
    await expect(title).toBeVisible();
    console.log(await title.textContent());
    await page.locator("//i[@class='fa fa-times']").click();
    await expect(title).toHaveCount(0);
    console.log("Product removed");
});