import { test, expect } from '@playwright/test';


test('DemoBlaze Navigation Test', async ({ page }) => {
  await page.goto('https://demoblaze.com/');
  await expect(page.getByRole('link', { name: 'Cart' })).toBeVisible();
  await page.getByRole('link', { name: 'Cart' }).click();
  
  await page.goBack();
  await expect(await page.url()).toContain("https://demoblaze.com")

  await page.goForward();
  await expect(await page.url()).toContain("https://demoblaze.com/cart.html")
});