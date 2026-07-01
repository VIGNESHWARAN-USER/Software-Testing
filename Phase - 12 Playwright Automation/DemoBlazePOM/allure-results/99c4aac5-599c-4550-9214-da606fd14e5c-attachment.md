# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: Login.test.ts >> Login Tests >> Login test with Invalid Email
- Location: tests\Login.test.ts:17:13

# Error details

```
Error: expect(received).toContainEqual(expected) // deep equality

Expected value:  "User does not exist."
Received string: "User does not exist."
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
  18 |             console.log(data.testResult);
  19 |             if(data.testResult === "Failure") {
  20 |                 page.on("dialog", async (alert) => {
> 21 |                     expect(alert.message()).toContainEqual(data.expectedMessage);
     |                                             ^ Error: expect(received).toContainEqual(expected) // deep equality
  22 |                     await alert.accept();                    
  23 |                 })
  24 |                 await loginPage.login(data.username, data.password);
  25 |             }
  26 |             else {
  27 |                 await loginPage.login(data.username, data.password);
  28 |                 await expect(homePage.logoutNavOption).toHaveText("Log out", {timeout: 10000});
  29 |                 await expect(homePage.nameNavOption).toHaveText(`Welcome ${data.username}`, {timeout: 10000})
  30 |             }
  31 |         })
  32 |     }
  33 | })
```