import {test, expect} from '@playwright/test'

const testData = [
    {key: "Playwright", expectedText: "Playwright"},
    {key: "Selenium", expectedText: "Selenium"},
    {key: "Cypress", expectedText: "Cypress"},
]

test.describe("Search Test", () =>{

    for(const data of testData) {

        test(`Search test for ${data.key}`, async ({page}) => {

            await page.goto("https://www.google.co.in");
            await page.fill("//textarea[@class = 'gLFyf']", data.key);
            await page.click("//span[@class = 'PD3zdc L0nkUd z1asCe']");

        })
        
    }
})