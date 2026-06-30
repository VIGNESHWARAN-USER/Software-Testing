# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: DashboardTest.test.ts >> Dashboard Tests >> Check 'Time At Work' Visible
- Location: tests\DashboardTest.test.ts:15:9

# Error details

```
Error: expect(received).toBe(expected) // Object.is equality

Expected: "Time At Work"
Received: "Time at Work"
```

# Page snapshot

```yaml
- generic [ref=e4]:
  - generic [ref=e6]:
    - img "company-branding" [ref=e8]
    - generic [ref=e9]:
      - heading "Login" [level=5] [ref=e10]
      - generic [ref=e11]:
        - generic [ref=e13]:
          - paragraph [ref=e14]: "Username : Admin"
          - paragraph [ref=e15]: "Password : admin123"
        - generic [ref=e16]:
          - generic [ref=e18]:
            - generic [ref=e19]:
              - generic [ref=e20]: 
              - generic [ref=e21]: Username
            - textbox "Username" [active] [ref=e23]
          - generic [ref=e25]:
            - generic [ref=e26]:
              - generic [ref=e27]: 
              - generic [ref=e28]: Password
            - textbox "Password" [ref=e30]
          - button "Login" [ref=e32] [cursor=pointer]
          - paragraph [ref=e34] [cursor=pointer]: Forgot your password?
      - generic [ref=e35]:
        - generic [ref=e36]:
          - link [ref=e37] [cursor=pointer]:
            - /url: https://www.linkedin.com/company/orangehrm/mycompany/
          - link [ref=e40] [cursor=pointer]:
            - /url: https://www.facebook.com/OrangeHRM/
          - link [ref=e43] [cursor=pointer]:
            - /url: https://twitter.com/orangehrm?lang=en
          - link [ref=e46] [cursor=pointer]:
            - /url: https://www.youtube.com/c/OrangeHRMInc
        - generic [ref=e49]:
          - paragraph [ref=e50]: OrangeHRM OS 5.8
          - paragraph [ref=e51]:
            - text: © 2005 - 2026
            - link "OrangeHRM, Inc" [ref=e52] [cursor=pointer]:
              - /url: http://www.orangehrm.com
            - text: . All rights reserved.
  - img "orangehrm-logo" [ref=e54]
```

# Test source

```ts
  1  | import {test, expect} from "../fixtures/BaseFixtures"
  2  | import login_data from "../test_data/login_data.json"
  3  | 
  4  | test.describe("Dashboard Tests", () => {
  5  | 
  6  |     test.beforeEach(async ({loginPage}) => {
  7  |         await loginPage.navigate();
  8  |         await loginPage.login(login_data.validUser.username, login_data.validUser.password);
  9  |     })
  10 | 
  11 |     test("Check 'Quick Launch' Visible", async ({dashboardPage}) => {
  12 |         expect(await dashboardPage.getQuickLaunchText()).toBe("Quick Launch");
  13 |     })
  14 | 
  15 |     test("Check 'Time At Work' Visible", async ({dashboardPage}) => {
> 16 |         expect(await dashboardPage.gettimeAtWorkText()).toBe("Time At Work");
     |                                                         ^ Error: expect(received).toBe(expected) // Object.is equality
  17 |     })
  18 | 
  19 |     test.afterEach(async ({dashboardPage}) => {
  20 |         await dashboardPage.logOut();
  21 |     })
  22 | 
  23 | })
```