# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase1.test.ts >> Testcase 1 - Register User
- Location: tests\TestCase1.test.ts:3:5

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: page.fill: Test timeout of 30000ms exceeded.
Call log:
  - waiting for locator('//input[@id=\'password\']')

```

# Page snapshot

```yaml
- generic [active] [ref=e1]:
  - banner [ref=e2]:
    - generic [ref=e5]:
      - link "Website for automation practice" [ref=e8]:
        - /url: /
        - img "Website for automation practice" [ref=e9]
      - list [ref=e12]:
        - listitem [ref=e13]:
          - link " Home" [ref=e14]:
            - /url: /
            - generic [ref=e15]: 
            - text: Home
        - listitem [ref=e16]:
          - link " Products" [ref=e17]:
            - /url: /products
            - generic [ref=e18]: 
            - text: Products
        - listitem [ref=e19]:
          - link " Cart" [ref=e20]:
            - /url: /view_cart
            - generic [ref=e21]: 
            - text: Cart
        - listitem [ref=e22]:
          - link " Signup / Login" [ref=e23]:
            - /url: /login
            - generic [ref=e24]: 
            - text: Signup / Login
        - listitem [ref=e25]:
          - link " Test Cases" [ref=e26]:
            - /url: /test_cases
            - generic [ref=e27]: 
            - text: Test Cases
        - listitem [ref=e28]:
          - link " API Testing" [ref=e29]:
            - /url: /api_list
            - generic [ref=e30]: 
            - text: API Testing
        - listitem [ref=e31]:
          - link " Video Tutorials" [ref=e32]:
            - /url: https://www.youtube.com/c/AutomationExercise
            - generic [ref=e33]: 
            - text: Video Tutorials
        - listitem [ref=e34]:
          - link " Contact us" [ref=e35]:
            - /url: /contact_us
            - generic [ref=e36]: 
            - text: Contact us
  - generic [ref=e39]:
    - generic [ref=e41]:
      - heading "Login to your account" [level=2] [ref=e42]
      - generic [ref=e43]:
        - generic: tXZzl3xwWdyxphJZBmYf1WMSsyJwYy8eg5OXqwIGrojy0uXz3OyC0z5LT4dcHXsP
        - textbox "Email Address" [ref=e44]
        - textbox "Password" [ref=e45]
        - button "Login" [ref=e46] [cursor=pointer]
    - heading "OR" [level=2] [ref=e48]
    - generic [ref=e50]:
      - heading "New User Signup!" [level=2] [ref=e51]
      - generic [ref=e52]:
        - generic: tXZzl3xwWdyxphJZBmYf1WMSsyJwYy8eg5OXqwIGrojy0uXz3OyC0z5LT4dcHXsP
        - textbox "Name" [ref=e53]: Vignesh
        - textbox "Email Address" [ref=e54]: vignesh@gmail.com
        - generic: signup
        - paragraph [ref=e55]: Email Address already exist!
        - button "Signup" [ref=e56] [cursor=pointer]
  - contentinfo [ref=e57]:
    - generic [ref=e62]:
      - heading "Subscription" [level=2] [ref=e63]
      - generic [ref=e64]:
        - textbox "Your email address" [ref=e65]
        - button "" [ref=e66] [cursor=pointer]:
          - generic [ref=e67]: 
        - paragraph [ref=e68]:
          - text: Get the most recent updates from
          - text: our site and be updated your self...
    - paragraph [ref=e72]: Copyright © 2021 All rights reserved
  - text: 
  - insertion [ref=e73]:
    - iframe [ref=e76]:
      - iframe [ref=f61e1]:
        - generic [active]:
          - generic [ref=f64e1]:
            - generic [ref=f64e2]:
              - generic:
                - img [ref=f64e6] [cursor=pointer]
                - button [ref=f64e8] [cursor=pointer]:
                  - img [ref=f64e9]
            - insertion [ref=f64e17]:
              - generic [ref=f64e18]:
                - link "Click Here" [ref=f64e19]:
                  - /url: https://googleads.g.doubleclick.net/dbm/clk?sa=L&ai=C86F02lg9atbAB6Lw4dkPp6iugQOuq9T0hwGPkMLfqRWhpvjz0B0QASD9tJ6VAWDlgoCA2A6gAYviiqAByAEJqAMByAObBKoEiQJP0EJ93hFNSg0pdWZedSrr95DVkeEnhQXXnESh7k5b7Il_6IhDXcKPfFccO51ftDB4dnMDjzVGoKxKTXsjXJ6_0tqbrp8orxR-wCe674j9wB9ZH5EMYyUrM6zChz_1oJphM0NAo8Bx6ORAqysn5QydSXgQ5dpqde4ThkiXtnslQVyTwBZtKCQ13f511P00_zfKDS58e4P3KYS2CUQ1Da7nyJVv5U6RiZZdwKWEg4teQm4636WzKU5O6wz8nRQdsVUldvLoLIqZdThri7CUcV55AZOEGm9uvlRzC8GVsV_YYhzeB4MpdUeIVhfvNIsXgI4HZiTDGQQZ1StRMPR4LOLz1UXQDYHQnB1uwATt9N3p8wTgBAOIBc-V8vRRkAYBoAZNgAfdnfXfAqgHp8yxAqgHpr4bqAfMzrECqAfz0RuoB5bYG6gHqpuxAqgHjs4bqAeT2BuoB_DgG6gH7paxAqgH_p6xAqgHr76xAqgH1ckbqAfZtrECqAeaBqgH_56xAqgH35-xAqgH-MKxAqgH-8KxAqgH59exAtgHANIIMwiAYRABGJ8DMgiKgoCAgICACDoPgECAwICAgICogAKog4AQSL39wTpY_MmXqOmilQNgAYAKAZgLAcgLAYAMAaoNAklO6g0TCNCbmajpopUDFSJ4OAUdJ5QrMPANAYgOCbATkNj4ItATANgTDYgUAdgUAdAVAcoWAgoA-BYBgBcBshcEGAJQBrIYCRICnWMYTSIBANAZAQ&ae=1&num=1&cid=CAQSnwIAEQoqgWgPuCZHWKNK9MboAAMwIq-xOnC79_0ms4cxsoGd3KUXodT6p8oNjxxAUh4A_inesXtFW-APaU80h5dZ7ybq9s4FQqhgc6edx8X2ctDYEXI3cmG-gzRxmP7Cdam_5Fa6E8a4VqFks8P4Pp_LRn0c5g3jG9cxLKVxNs-6UxWu_Brm2vnKajHevPJioA4yFcWVxL0huOmqH53voXYmEhqP8cNhp8j5YwK2RvLgC6Rz6iwBLnTLJCuPUwufUWuJdz0CrMJ1NLwZ1h_-XUEkWDjQMjlpEnor9TYtMdXClC2sceMegRfQUD8M6bPj_PIo9GQeS8bDVQ2bkt5JVnZWRLdw7UX_6anHW8ULIwuNzSseM4VgfIIPe7DcyNzJkhgB&sig=AOD64_2ga7VgPGECwAzwikk3qQXjGOykdQ&client=ca-pub-1677597403311019&dbm_c=AKAmf-ARAXDNkvlqSwIL7_7GQ992pQ3AEKZWyqsC8S-Lo-94xepjB46CFMFLGn7jDVe1daoDoKGB-D0dvuDrX1eBWE3MPFwT3PAvpeWfPgXVM8z5-Rr0NxKhFj8Qwl2xYX0cpDOlnhe5EhbEVHvRBbBWzDOqESR1XiQcVD1aQiKNh2ZljSv2WfzLxWWXRN7iiDiVVaH8zgyRTdqUw6__Zp-mlTe4CIg00yKqYjZv5JAj92pCUfPBncog5ZhJXn0PRO8cIB3bz_rUrmU6EoaPWpVnDQdxi7hAcw2nImVPGIFEmY41Bwgu91U&cry=1&dbm_d=AKAmf-BUjIKX3SqwH1utBwv2kCUsIXAAOcnk0vo2jhk6tP4-og3lYsCO5-Xjzq35nIciYArp35Uy-Ljh-bmMH54nNXYUw87FYcmvvD7CIrQhxqZkFBLyozMaOaFgddJS07BujTunOAtVkgsUD-bbALfPhN8J71MVNMYeOhwvJMAobtDKkzrv1hrXNgAavTcVS85y5NvFYfUezweRs3ri4k0N-hQ_4ifyxp0W5p2cJd3GZ4v-FH3lDADryz3rjm81mfm2y51hkCLXAvo_eAGDkWfidcUrhBO3xZDsoLmz109hVOVQmAiO7Ac_58akMifG3PnpB3DsR6Kj3wnT20g1WDwEngZgDFapQmT1Rc9JIbTYlera2sonbR5-km0-VAlKInzgQ9MSY0PR0BG-eszlDKmhWnjaIHkD-NJBE9FG3_TAatvtEFicnJgMwYmZ2JJgDyA0RDRPJTplOYnIszdk4_sYdVWNqOt5HEOz39F51NmNy-lKUWjsEJqEetxuZDHCiUCRI3CrNr2sb_rAOnjAJ1QUK6EgHWRAf78jVu5Qg9M5F4AOvQKxCmJH1qkq4AmGrpoOqULfm-DOkCEFuvG8EguzPMhNkcbmikKiPe6yEF83qpwySH7aL-S-fbmld5GB4D1WCr29lRaAJplf52ivPs6Ok9KyZPyKuAnlELBfA2IDgwOPcVsiSxe4v-NSOBxYfPjMPYB3J-jnfS5NkpDwUQI81z6CZVEI5A&adurl=https://servedby.flashtalking.com/click/7/296969;10263616;6173714;210;0/?us_privacy=!!US_PRIVACY!&ft_partnerimpid=ABAjH0ghC6uFU4Yf26T9sEl440Ft&ft_impID=B02EFC5B-14F7-3828-B05F-FB2481230F1E&ft_section=21988412111&g=675080B9913D15&random=487655.250881965&ft_width=728&ft_height=90&url=https://www.adobe.com/in/creativecloud.html?sdid=PC1PQ9XF&mv=display&mv2=display
                  - img "Click Here" [ref=f64e20]
                - link "AdChoices arrow" [ref=f64e22]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img "AdChoices arrow" [ref=f64e23]
                - link "Privacy Notification" [ref=f64e25]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img [ref=f64e26]
                - link "Privacy Notification" [ref=f64e28]:
                  - /url: https://www.flashtalking.com/consumer-privacy
                  - img [ref=f64e29]
          - iframe
```

# Test source

```ts
  1  | import { test,expect } from '@playwright/test';
  2  | 
  3  | test("Testcase 1 - Register User",async({page})=>{
  4  |    
  5  |     await page.goto("https://automationexercise.com/")
  6  |     await expect(page).toHaveTitle("Automation Exercise")
  7  | 
  8  |     await page.click("//a[normalize-space()='Signup / Login']");
  9  | 
  10 |     await page.fill("//input[@placeholder='Name']","Vignesh")
  11 |     await page.fill("//input[@data-qa='signup-email']","vignesh@gmail.com")
  12 | 
  13 |     await page.click("//button[normalize-space()='Signup']")
  14 | 
> 15 |     await page.fill("//input[@id='password']","1234")
     |                ^ Error: page.fill: Test timeout of 30000ms exceeded.
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