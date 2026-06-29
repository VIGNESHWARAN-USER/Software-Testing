import {test, expect} from '@playwright/test'
import {parse} from 'csv-parse';
import * as fs from 'fs'


const fileContent = fs.readFileSync("./data/login_data.xlsx")
const testData = parse(fileContent, {columns: true});

test.describe("Login", () => {
    
    for(const data of testData) {
        test(`Login Test with username: ${data.username} and password: ${data.password}  @login`, async ({page}) => {
            await page.goto('https://demoblaze.com/');
            await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
            await page.getByRole('link', { name: 'Log in' }).click();
            await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
            await page.locator('#loginusername').fill(data.username);
            await page.locator('#loginpassword').fill(data.password);
            await page.getByRole('button', { name: 'Log in' }).click();
            await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible({timeout: 100000});
            await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
            expect(await page.title()).toContain('STORE');
            expect(page.url()).toContain('https://demoblaze.com/');
        })
    }
})