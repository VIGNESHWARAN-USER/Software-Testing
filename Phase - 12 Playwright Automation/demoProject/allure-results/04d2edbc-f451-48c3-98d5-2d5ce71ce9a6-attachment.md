# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: demoBlaze.test.ts >> Login Test
- Location: tests\demoBlaze.test.ts:3:1

# Error details

```
Error: expect(locator).not.toBeVisible() failed

Locator:  getByRole('link', { name: 'Log out' })
Expected: not visible
Received: visible
Timeout:  5000ms

Call log:
  - Expect "not toBeVisible" with timeout 5000ms
  - waiting for getByRole('link', { name: 'Log out' })
    13 × locator resolved to <a href="#" id="logout2" class="nav-link" onclick="logOut()">Log out</a>
       - unexpected value "visible"

```

```yaml
- link "Log out":
  - /url: "#"
```

# Test source

```ts
  1  | import {chromium, test, expect} from '@playwright/test'
  2  | 
  3  | test("Login Test", async () => {
  4  |     const browser = await chromium.launch({headless: false});
  5  |     const context = await browser.newContext();
  6  |     const page = await context.newPage();
  7  | 
  8  |     await page.goto('https://demoblaze.com/');
  9  |     await expect(page.getByRole('link', { name: 'Log in' })).toBeVisible();
  10 |     await page.getByRole('link', { name: 'Log in' }).click();
  11 |     await expect(page.getByRole('heading', { name: 'Log in' })).toBeVisible();
  12 |     await page.locator('#loginusername').fill('admin');
  13 |     await page.locator('#loginpassword').fill('admin');
  14 |     await page.getByRole('button', { name: 'Log in' }).click();
  15 |     await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
  16 |     await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
  17 | 
  18 |     const cartPage = await context.newPage();
  19 |     await cartPage.goto("https://demoblaze.com/cart.html");
  20 |     await expect(page.getByRole('link', { name: 'Log out' })).toBeVisible();
  21 |     await expect(page.locator('#nameofuser')).toContainText('Welcome admin');
  22 | 
  23 |     const newContext = await browser.newContext();
  24 |     const newCartPage = await newContext.newPage();
  25 |     await newCartPage.goto("https://demoblaze.com/cart.html");
> 26 |     await expect(page.getByRole('link', { name: 'Log out' })).not.toBeVisible();
     |                                                                   ^ Error: expect(locator).not.toBeVisible() failed
  27 |     await expect(page.locator('#nameofuser')).not.toContainText('Welcome admin');
  28 | 
  29 | })
```