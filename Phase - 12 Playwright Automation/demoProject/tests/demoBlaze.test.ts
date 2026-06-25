import {chromium, test, expect} from '@playwright/test'

test("Login Test", async () => {
    const browser = await chromium.launch();
    const context = await browser.newContext();
    const page = await context.newPage();

    await page.goto('https://demoblaze.com/');
    await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
    await page.getByRole('link', { name: 'Log in' }).click();
    await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
    await page.locator('#loginusername').fill('admin');
    await page.locator('#loginpassword').fill('admin');
    await page.getByRole('button', { name: 'Log in' }).click();
    await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
    await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
    expect(await page.title()).toContain('STORE');
    expect(await page.url()).toContain('https://demoblaze.com/');

    // const cartPage = await context.newPage();
    // await cartPage.goto("https://demoblaze.com/cart.html");
    // await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
    // await expect(page.locator('#nameofuser')).toContainText('Welcome admin');

    const newContext = await browser.newContext();
    const newCartPage = await newContext.newPage();
    await newCartPage.goto("https://demoblaze.com/cart.html");
    await expect(page.getByRole('link', { name: 'Log in' })).not.toBeVisible();

})