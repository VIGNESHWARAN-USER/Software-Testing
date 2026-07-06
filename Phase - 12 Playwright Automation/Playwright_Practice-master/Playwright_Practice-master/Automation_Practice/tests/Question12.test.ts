import { test, expect } from '@playwright/test';

test('Add two products and verify cart', async ({ page }) => {
    async function dismissAds() {
        await page.evaluate(() => {
            document.querySelectorAll(
                "iframe, .adsbygoogle, [id*='google_ads'], [id*='aswift']"
            ).forEach(el => el.remove());
        }).catch(() => {});
    }
    await page.goto('https://automationexercise.com/');
    await dismissAds();
    await page.locator("(//a[contains(text(),'Add to cart')])[1]").click({ force: true });
    await page.locator("//button[contains(@class,'close-modal')]").click();
    await dismissAds();
    await page.locator("(//a[contains(text(),'Add to cart')])[3]").click({ force: true });
    await page.locator("//u[normalize-space()='View Cart']").click();
    await dismissAds();
    const table = page.locator("//table[@id='cart_info_table']");
    await expect(table).toBeVisible();
    const tableText = await table.textContent();
    console.log(tableText);
    expect(tableText?.trim()).not.toBe('');
});