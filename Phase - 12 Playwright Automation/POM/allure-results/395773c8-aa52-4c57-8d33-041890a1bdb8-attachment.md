# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: LoginTest.test.ts >> Login Tests >> Valid Login Test
- Location: tests\LoginTest.test.ts:10:9

# Error details

```
TypeError: Cannot read properties of undefined (reading 'fill')
```

```
Error: page.goto: Test ended.
Call log:
  - navigating to "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", waiting until "domcontentloaded"

```

# Test source

```ts
  1  | import { LoginPage } from './../pages/LoginPage';
  2  | import {Page} from '@playwright/test'
  3  | 
  4  | export class LoginAction
  5  | {
  6  |     readonly page: Page;
  7  | 
  8  |     constructor(page: Page) {
  9  |         this.page = page;
  10 |     }
  11 | 
  12 |     async navigate() {
> 13 |         await this.page.goto("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", 
     |                         ^ Error: page.goto: Test ended.
  14 |             {'waitUntil' : 'domcontentloaded'}
  15 |         );
  16 |     }
  17 | 
  18 |     async login(username:string, password:string) {
  19 |         await LoginPage.username.fill(username);
  20 |         await LoginPage.password.fill(password);
  21 |         await LoginPage.loginButton.click();
  22 |     }
  23 | 
  24 |     async getLoginTitle() {
  25 |         return await LoginPage.loginTitle.textContent();
  26 |     }
  27 | 
  28 |     async getErrorMessage() {
  29 |         return await LoginPage.errorMessage.textContent();
  30 |     }
  31 | 
  32 | }
```