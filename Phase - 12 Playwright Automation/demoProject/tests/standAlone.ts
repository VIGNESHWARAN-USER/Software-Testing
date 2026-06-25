import { expect } from '@playwright/test';
import {firefox} from 'playwright'

(async () => {

    const browser = await firefox.launch({headless : false})
    const context = await browser.newContext()
    const page = await browser.newPage()

    await page.setViewportSize({width: 1920, height: 1080})
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
})