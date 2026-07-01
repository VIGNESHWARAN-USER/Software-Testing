# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Login.test.ts >> Login Tests >> Login test with Blank Username
- Location: tests\Login.test.ts:16:13

# Error details

```
Error: locator.click: Test ended.
Call log:
  - waiting for getByRole('button', { name: 'Log in' })
    - locator resolved to <button type="button" onclick="logIn()" class="btn btn-primary">Log in</button>
  - attempting click action
    - waiting for element to be visible, enabled and stable
    - element is visible, enabled and stable
    - scrolling into view if needed
    - done scrolling
    - performing click action

```

# Test source

```ts
  1  | import {Locator, Page} from '@playwright/test'
  2  | 
  3  | export class LoginPage {
  4  | 
  5  |     readonly page: Page;
  6  |     readonly username: Locator;
  7  |     readonly password: Locator;
  8  |     readonly loginButton: Locator;
  9  | 
  10 |     constructor(page : Page) {
  11 |         this.page = page;
  12 |         this.username = page.locator('#loginusername');
  13 |         this.password = page.locator('#loginpassword');
  14 |         this.loginButton = page.getByRole('button', { name: 'Log in' });
  15 |     }
  16 | 
  17 |     async login(username:string, password:string) {
  18 |         this.username.fill(username);
  19 |         this.password.fill(password);
> 20 |         this.loginButton.click()
     |                          ^ Error: locator.click: Test ended.
  21 |     }
  22 |     
  23 | }
```