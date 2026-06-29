# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestMUAI.test.ts >> Test Case 1
- Location: tests\TestMUAI.test.ts:3:5

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: locator.inputValue: Test timeout of 30000ms exceeded.
Call log:
  - waiting for locator('input#user-message')

```

# Test source

```ts
  1   | import { test, expect } from '@playwright/test';
  2   | 
  3   | test("Test Case 1", async ({ page }) => {
  4   | 
  5   |     await page.goto("https://www.testmuai.com/selenium-playground/simple-form-demo/",{
  6   |         waitUntil:'networkidle'
  7   | 
  8   |     });
  9   | 
  10  |     console.log(await page.locator("input#user-message").getAttribute("placeholder"));
  11  | 
  12  |     await page.locator("input#user-message").fill("VIGNESHWARAN");
  13  |  
> 14  |     console.log(await page.locator("input#user-message").inputValue());
      |                                                          ^ Error: locator.inputValue: Test timeout of 30000ms exceeded.
  15  | 
  16  |     await expect(page.locator("input#user-message")).toHaveValue("VIGNESHWARAN");
  17  | 
  18  |     await page.click("#showInput");
  19  | 
  20  |     await expect(page.locator("#message")).toHaveText("VIGNESHWARAN");
  21  | 
  22  | });
  23  | 
  24  | test("Test Case 2",async({page})=>{
  25  | 
  26  |     await page.goto("https://www.testmuai.com/selenium-playground/simple-form-demo/",{
  27  |         waitUntil:'networkidle'
  28  | 
  29  |     })
  30  | 
  31  |     const a=15
  32  |     const b=15
  33  | 
  34  |     const result=a+b
  35  | 
  36  |     await page.fill("//input[@id='sum1']",""+a)
  37  |     await page.fill("//input[@id='sum2']",""+b)
  38  | 
  39  |     await page.click("//*[@id='gettotal']/button")
  40  |     
  41  |     console.log(await page.locator("//*[@id='gettotal']/button").boundingBox())
  42  |     await expect(page.locator("//p[@id='addmessage']")).toHaveText(""+result,{ timeout: 5000 })
  43  | 
  44  | })
  45  | 
  46  | test("Test Case 3",async({page})=>{
  47  |     await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/",{
  48  |         waitUntil:'networkidle'
  49  | 
  50  |     })
  51  | 
  52  |     let actual=""
  53  | 
  54  |     page.once("dialog",async(alert)=>{
  55  |         console.log(alert.message())
  56  |         actual=alert.message()  
  57  |         alert.accept()
  58  |         console.log("Alert accepted")
  59  |     })
  60  | 
  61  |     await page.locator("button:has-text('Click Me')").nth(0).click()
  62  | 
  63  |     expect(actual,"I am an alert box!")
  64  | })
  65  | 
  66  | 
  67  | test("Test Case 4",async({page})=>{
  68  |     await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")
  69  | 
  70  |     let actual=""
  71  | 
  72  |     page.once("dialog",async(alert)=>{
  73  |         console.log(alert.message())
  74  |         actual=alert.message()  
  75  |         alert.accept()
  76  |         console.log("Alert accepted")
  77  |     })
  78  | 
  79  |     await page.locator("button:has-text('Click Me')").nth(1).click()
  80  | 
  81  |     expect(actual,"Press a button!")
  82  |     expect(page.locator("//p[@id = 'confirm-demo']")).toContainText("You pressed OK!")
  83  | })
  84  | 
  85  | test("Test Case 5",async({page})=>{
  86  |     await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")
  87  | 
  88  |     let actual=""
  89  | 
  90  |     page.once("dialog",async(alert)=>{
  91  |         console.log(alert.message())
  92  |         actual=alert.message()  
  93  |         alert.dismiss()
  94  |         console.log("Alert denied")
  95  |     })
  96  | 
  97  |     await page.locator("button:has-text('Click Me')").nth(1).click()
  98  | 
  99  |     expect(actual,"Press a button!")
  100 |     expect(page.locator("//p[@id = 'confirm-demo']")).toContainText("You pressed Cancel!")
  101 | })
  102 | 
  103 | test("Test Case 6",async({page})=>{
  104 |     await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")
  105 | 
  106 |     let actual=""
  107 | 
  108 |     page.once("dialog",async(alert)=>{
  109 |         console.log(alert.message())
  110 |         actual=alert.message()  
  111 |         alert.accept("Vignesh")
  112 |         console.log("Alert accepted")
  113 |     })
  114 | 
```