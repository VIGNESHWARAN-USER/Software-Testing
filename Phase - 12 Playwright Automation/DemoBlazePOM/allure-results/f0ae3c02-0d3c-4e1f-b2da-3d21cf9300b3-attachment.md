# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Login.spec.ts >> Login Tests >> Login test with Invalid Email
- Location: tests\Login.spec.ts:15:13

# Error details

```
Error: page.goto: url: expected string, got undefined
```

# Test source

```ts
  1  | import {Locator, Page} from '@playwright/test'
  2  | import dotenv from 'dotenv'
  3  | 
  4  | export class HomePage {
  5  | 
  6  |     readonly page: Page;
  7  |     readonly loginNavOption: Locator;
  8  |     readonly logoutNavOption: Locator;
  9  |     readonly nameNavOption: Locator;
  10 | 
  11 |     constructor(page: Page) {
  12 |         this.page = page;
  13 |         this.loginNavOption = page.getByRole('link', { name: 'Log in' });
  14 |         this.logoutNavOption = page.getByRole('link', { name: 'Log out' });
  15 |         this.nameNavOption = page.locator('#nameofuser')
  16 |     }
  17 | 
  18 |     async navigate() {
> 19 |         await this.page.goto(process.env.BASE_URL)
     |                         ^ Error: page.goto: url: expected string, got undefined
  20 |     }
  21 |     
  22 |     async openLoginPage() {
  23 |         await this.loginNavOption.click();
  24 |     }
  25 | 
  26 | }
```