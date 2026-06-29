# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase6.test.ts >> Testcase 6 - Contact Us Form
- Location: tests\TestCase6.test.ts:3:5

# Error details

```
Error: page.waitForTimeout: Test ended.
```

# Test source

```ts
  1  | import { test,expect, Dialog } from '@playwright/test';
  2  | 
  3  | test("Testcase 6 - Contact Us Form",async({page})=>{
  4  | 
  5  |     await page.goto("https://automationexercise.com/")
  6  |     await expect(page).toHaveTitle("Automation Exercise")
  7  | 
  8  |     await page.click("//a[normalize-space()='Contact us']");
  9  | 
  10 |     await expect(page.locator("//h2[text() = 'Get In Touch']")).toBeVisible()
  11 | 
  12 |     await page.fill("//input[@name = 'name']", "Vigneshwaran");
  13 |     await page.fill("//input[@name = 'email']", "Vigneshwaran@gmail.com");
  14 |     await page.fill("//input[@name = 'subject']", "Sample Mail");
  15 |     await page.fill("//textarea[@id = 'message']", "Test message");
  16 |     page.setInputFiles("//input[@name = 'upload_file']",  "tests/TestCase5.test.ts")
  17 | 
> 18 |     page.waitForTimeout(100000);
     |          ^ Error: page.waitForTimeout: Test ended.
  19 |     
  20 | 
  21 |     page.on('dialog', async dialog => {
  22 |         console.log(dialog.message());
  23 |         await dialog.accept();
  24 |     });
  25 | 
  26 |     await page.click("//input[@data-qa  = 'submit-button']")
  27 | 
  28 |     await expect(page.locator("//div[@class = 'status alert alert-success']")).toBeVisible()
  29 | })
```