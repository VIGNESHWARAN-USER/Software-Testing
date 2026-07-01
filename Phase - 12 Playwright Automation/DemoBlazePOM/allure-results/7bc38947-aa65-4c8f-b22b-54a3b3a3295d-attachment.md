# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Login.test.ts >> Login Tests >> Login test with Blank Fields
- Location: tests\Login.test.ts:17:13

# Error details

```
Error: expect(received).toBe(expected) // Object.is equality

Expected: "Please fill out Username and Password"
Received: "Wrong password."
```

# Test source

```ts
  1  | import { expect, test } from "../fixtures/BaseFixtures";
  2  | import { getData } from '../utils/ExcelReader';
  3  | import { LoginData } from '../types/LoginData';
  4  | 
  5  | const loginData = getData("login_data.xlsx", "LoginData") as LoginData[];
  6  | 
  7  | test.describe("Login Tests", () =>{
  8  | 
  9  | 
  10 |     test.beforeEach(async ({homePage}) => {
  11 |         await homePage.navigate();
  12 |         await homePage.openLoginPage();
  13 |     })
  14 |     
  15 |     for(const data of loginData) {
  16 |         
  17 |         test(`Login test with ${data.testName}`, async ({page, homePage, loginPage}) => {
  18 |             
  19 |             if(data.testResult === "Failure") {
  20 | 
  21 |                 page.on("dialog", async (alert) => {
> 22 |                     expect(alert.message()).toBe(data.expectedMessage);
     |                                             ^ Error: expect(received).toBe(expected) // Object.is equality
  23 |                     await alert.accept();                    
  24 |                 })
  25 |                 await loginPage.login(data.username, data.password);
  26 |             }
  27 |             else {
  28 |                 await loginPage.login(data.username, data.password);
  29 |                 await expect(homePage.logoutNavOption).toHaveText("Log out");
  30 |                 await expect(homePage.nameNavOption).toHaveText(`Welcome ${data.username}`)
  31 |             }
  32 |         })
  33 |     }
  34 | })
```