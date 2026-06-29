# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: parameterization.test.ts >> Search Test >> Search test for Playwright
- Location: tests\parameterization.test.ts:13:13

# Error details

```
Error: page.goto: Could not resolve hostname
Call log:
  - navigating to "https://www.google.co.in/", waiting until "load"

```

# Test source

```ts
  1  | import {test, expect} from '@playwright/test'
  2  | 
  3  | const testData = [
  4  |     {key: "Playwright", expectedText: "Playwright"},
  5  |     {key: "Selenium", expectedText: "Selenium"},
  6  |     {key: "Cypress", expectedText: "Cypress"},
  7  | ]
  8  | 
  9  | test.describe("Search Test", () =>{
  10 | 
  11 |     for(const data of testData) {
  12 | 
  13 |         test(`Search test for ${data.key}`, async ({page}) => {
  14 | 
> 15 |             await page.goto("https://www.google.co.in");
     |                        ^ Error: page.goto: Could not resolve hostname
  16 |             await page.fill("//textarea[@class = 'gLFyf']", data.key);
  17 |             await page.click("//span[@class = 'PD3zdc L0nkUd z1asCe']");
  18 | 
  19 |         })
  20 |         
  21 |     }
  22 | })
```