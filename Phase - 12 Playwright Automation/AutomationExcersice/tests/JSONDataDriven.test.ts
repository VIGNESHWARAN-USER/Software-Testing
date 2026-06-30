import {test, expect} from '@playwright/test'
import loginData from "../data/login_data.json";

interface LoginData {
    testName: string;
    username: string;
    password: string;
    expectedResult: "Success" | "Failure";
    expectedMessage: string;
}

const data = loginData as LoginData[];
console.log(data)

for(const record of data) {

    console.log(record);
    test(`${record.testName} @login`, async ({page}) => {
            await page.goto('https://demoblaze.com/');
            await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
            await page.getByRole('link', { name: 'Log in' }).click();
            await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
            await page.locator('#loginusername').fill(record.username);
            await page.locator('#loginpassword').fill(record.password);
            await page.getByRole('button', { name: 'Log in' }).click();
            
            if(record.expectedResult == "Success") {
                await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible({timeout: 100000});
                await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
                expect(await page.title()).toContain('STORE');
                expect(page.url()).toContain('https://demoblaze.com/');
            }
            else {

                page.once("dialog", (alert) => {
                    expect(alert.message()).toBe(record.expectedMessage);
                    alert.accept();
                })  
            }
        })
}