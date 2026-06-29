import {chromium, test, expect} from '@playwright/test'

test.describe("Login Group @tag", () => {
    test("Login Test @smoke", async ({page}) => {


    await page.goto('https://demoblaze.com/');
    await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
    await page.getByRole('link', { name: 'Log in' }).click();
    await expect(page.getByRole('heading', { name: 'Log out' })).toBeVisible();
    await page.locator('#loginusername').fill('admin');
    await page.locator('#loginpassword').fill('admin');
    await page.getByRole('button', { name: 'Log in' }).click();
    await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
    await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
    expect(await page.title()).toContain('STORE');
    expect(await page.url()).toContain('https://demoblaze.com/');
})

test("Login Test With Soft Assertion @smoke", async ({page}) => {


    await page.goto('https://demoblaze.com/');
    await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
    await page.getByRole('link', { name: 'Log in' }).click();
    await expect.soft(page.getByRole('heading', { name: 'Log out' })).toBeVisible();
    await page.locator('#loginusername').fill('admin');
    await page.locator('#loginpassword').fill('admin');
    await page.getByRole('button', { name: 'Log in' }).click();
    await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
    await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
    expect(await page.title()).toContain('STORE');
    expect(await page.url()).toContain('https://demoblaze.com/');
})

test.skip("Invalid Login Test", async ({page}) => {

    test.skip(true, "This test is under development")

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
})

})

test.describe("Login Group 2", () => {
    test("Login Test @smoke", async ({page}) => {


    await page.goto('https://demoblaze.com/');
    await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
    await page.getByRole('link', { name: 'Log in' }).click();
    await expect(page.getByRole('heading', { name: 'Log out' })).toBeVisible();
    await page.locator('#loginusername').fill('admin');
    await page.locator('#loginpassword').fill('admin');
    await page.getByRole('button', { name: 'Log in' }).click();
    await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
    await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
    expect(await page.title()).toContain('STORE');
    expect(await page.url()).toContain('https://demoblaze.com/');
})

test("Login Test With Soft Assertion @smoke", async ({page}) => {


    await page.goto('https://demoblaze.com/');
    await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
    await page.getByRole('link', { name: 'Log in' }).click();
    await expect.soft(page.getByRole('heading', { name: 'Log out' })).toBeVisible();
    await page.locator('#loginusername').fill('admin');
    await page.locator('#loginpassword').fill('admin');
    await page.getByRole('button', { name: 'Log in' }).click();
    await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
    await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
    expect(await page.title()).toContain('STORE');
    expect(await page.url()).toContain('https://demoblaze.com/');
})

test("Invalid Login Test @sanity", async ({page}) => {

    test.skip(true, "This test is under development")

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
})

})