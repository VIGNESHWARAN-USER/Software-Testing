# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: ExcelDataDriven.test.ts >> Login >> Login Test with username: hlhl@gmail.com and password: admin  @login
- Location: tests\ExcelDataDriven.test.ts:13:13

# Error details

```
Error: expect(locator).toBeVisible() failed

Locator: getByRole('link', { name: 'Log out' })
Expected: visible
Timeout: 10000ms
Error: element(s) not found

Call log:
  - Expect "toBeVisible" with timeout 10000ms
  - waiting for getByRole('link', { name: 'Log out' })

```

```yaml
- dialog "Log in":
  - document:
    - heading "Log in" [level=5]
    - button "Close"
    - text: "Username:"
    - textbox
    - text: "Password:"
    - textbox: admin
    - button "Close"
    - button "Log in"
- navigation:
  - link "PRODUCT STORE":
    - /url: index.html
    - img
    - text: PRODUCT STORE
  - list:
    - listitem:
      - link "Home (current)":
        - /url: index.html
    - listitem:
      - link "Contact":
        - /url: "#"
    - listitem:
      - link "About us":
        - /url: "#"
    - listitem:
      - link "Cart":
        - /url: cart.html
    - listitem:
      - link "Log in":
        - /url: "#"
    - listitem
    - listitem
    - listitem:
      - link "Sign up":
        - /url: "#"
  - list:
    - listitem
    - listitem
    - listitem
  - img "Third slide"
  - button "Previous"
  - button "Next"
- link "CATEGORIES":
  - /url: ""
- link "Phones":
  - /url: "#"
- link "Laptops":
  - /url: "#"
- link "Monitors":
  - /url: "#"
- list:
  - listitem:
    - button "Previous"
  - listitem:
    - button "Next"
- heading "About Us" [level=4]
- paragraph: We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality.
- heading "Get in Touch" [level=4]
- paragraph: "Address: 2390 El Camino Real"
- paragraph: "Phone: +440 123456"
- paragraph: "Email: demo@blazemeter.com"
- heading "PRODUCT STORE" [level=4]:
  - img
  - text: PRODUCT STORE
- contentinfo:
  - paragraph: Copyright © Product Store
```

# Test source

```ts
  1  | import {test, expect} from '@playwright/test'
  2  | import * as XLSX from 'xlsx'
  3  | 
  4  | 
  5  | const workbook = XLSX.readFile("./data/login_data.xlsx")
  6  | const sheet = workbook.Sheets["ValidLoginData"]
  7  | 
  8  | const testData:any = XLSX.utils.sheet_to_json(sheet)
  9  | 
  10 | test.describe("Login", () => {
  11 |     
  12 |     for(const {username, password} of testData) {
  13 |         test(`Login Test with username: ${username} and password: ${password}  @login`, async ({page}) => {
  14 |             await page.goto('https://demoblaze.com/');
  15 |             await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
  16 |             await page.getByRole('link', { name: 'Log in' }).click();
  17 |             await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
  18 |             await page.locator('#loginusername').fill(username);
  19 |             await page.locator('#loginpassword').fill(password);
  20 |             await page.getByRole('button', { name: 'Log in' }).click();
> 21 |             await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
     |                                                                       ^ Error: expect(locator).toBeVisible() failed
  22 |             await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
  23 |             expect(await page.title()).toContain('STORE');
  24 |             expect(page.url()).toContain('https://demoblaze.com/');
  25 |         })
  26 |     }
  27 | })
```