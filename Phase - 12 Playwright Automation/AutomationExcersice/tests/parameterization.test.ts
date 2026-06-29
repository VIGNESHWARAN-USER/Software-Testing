import {test, expect} from '@playwright/test'

const testData = [
    {key: "Playwright", expectedText: "Playwright"},
    {key: "Selenium", expectedText: "Selenium"},
    {key: "Cypress", expectedText: "Cypress"},
]
test.describe("Search Test", () =>{
    test.setTimeout(60000);
    for(const data of testData) {   

        test(`Search test for ${data.key}`, async ({page}) => {

            await page.goto("https://www.google.com");
            await page.fill("//textarea[@class = 'gLFyf']", data.key);
            await page.click("//span[text() = 'AI Mode']");

        })
        
    }
})