import {test, expect} from '@playwright/test'

test("Login Test", async ({page}) =>{

    await page.goto(process.env.BASE_URL!);  
    await page.fill("#username", process.env.UNAME!);
    await page.fill("#password", process.env.PASSWORD!);
    await page.click(".radius")
    await expect(page.locator(".flash.success")).toBeVisible();
})


test('DemoBlaze Login Test', async ({ page }) => {
  await page.goto('https://demoblaze.com/');
  await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
  await page.getByRole('link', { name: 'Log in' }).click();
  await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
  await page.locator('#loginusername').click();
  await page.locator('#loginusername').fill('admin');
  await page.locator('#loginpassword').click();
  await page.locator('#loginpassword').fill('admin');
  await page.locator('#loginpassword').press('ControlOrMeta+a');
  await page.locator('#loginpassword').fill('admin');
  await page.getByRole('button', { name: 'Log in' }).click();
  await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
  await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
});