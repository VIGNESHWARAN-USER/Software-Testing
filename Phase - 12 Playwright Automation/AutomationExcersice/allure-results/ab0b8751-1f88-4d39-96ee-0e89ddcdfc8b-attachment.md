# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase1.test.ts >> Testcase 1 - Register User
- Location: tests\TestCase1.test.ts:3:5

# Error details

```
Error: expect(page).toHaveTitle(expected) failed

Expected: "Automation Exercise"
Received: ""

Call log:
  - Expect "toHaveTitle" with timeout 5000ms

```

# Test source

```ts
  1  | import { test,expect } from '@playwright/test';
  2  | 
  3  | test("Testcase 1 - Register User",async({page})=>{
  4  |    
  5  |     await page.goto("https://automationexercise.com/")
> 6  |     await expect(page).toHaveTitle("Automation Exercise")
     |                        ^ Error: expect(page).toHaveTitle(expected) failed
  7  | 
  8  |     await page.click("//a[normalize-space()='Signup / Login']");
  9  | 
  10 |     await page.fill("//input[@placeholder='Name']","Vignesh")
  11 |     await page.fill("//input[@data-qa='signup-email']","vignesh100@gmail.com")
  12 | 
  13 |     await page.click("//button[normalize-space()='Signup']")
  14 | 
  15 |     await page.fill("//input[@id='password']","1234")
  16 | 
  17 |     await page.fill("//input[@id='first_name']","Vigneshwaran")
  18 |     await page.fill("//input[@id='last_name']","M")
  19 | 
  20 |     await page.fill("//input[@id='state']","TamilNadu")
  21 |     await page.fill("//input[@id='city']","salem")
  22 | 
  23 |     await page.fill("//input[@id='address1']","address")
  24 |     await page.fill("//input[@id='zipcode']","611222104")
  25 | 
  26 |     await page.fill("//input[@id='mobile_number']","9092174486")
  27 | 
  28 |     await page.click("//button[normalize-space()='Create Account']")
  29 | 
  30 |     await expect("//b[normalize-space()='Account Created!']").toContain("Created")
  31 | 
  32 | });
```