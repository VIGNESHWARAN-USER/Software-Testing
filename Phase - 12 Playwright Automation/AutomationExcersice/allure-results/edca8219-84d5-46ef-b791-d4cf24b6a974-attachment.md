# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: parameterization.test.ts >> Search Test >> Search test for Selenium
- Location: tests\parameterization.test.ts:13:13

# Error details

```
Test timeout of 30000ms exceeded.
```

```
Error: page.click: Test timeout of 30000ms exceeded.
Call log:
  - waiting for locator('//span[@class = \'PD3zdc L0nkUd z1asCe\']')
    - locator resolved to <span class="PD3zdc L0nkUd z1asCe">…</span>
  - attempting click action
    2 × waiting for element to be visible, enabled and stable
      - element is not visible
    - retrying click action
    - waiting 20ms
    2 × waiting for element to be visible, enabled and stable
      - element is not visible
    - retrying click action
      - waiting 100ms
    35 × waiting for element to be visible, enabled and stable
       - element is not visible
     - retrying click action
       - waiting 500ms

```

# Page snapshot

```yaml
- generic [ref=e2]:
  - navigation [ref=e3]:
    - link "About" [ref=e4]:
      - /url: https://about.google/?fg=1&utm_source=google-IN&utm_medium=referral&utm_campaign=hp-header
    - link "Store" [ref=e5]:
      - /url: https://store.google.com/IN?utm_source=hp_header&utm_medium=google_ooo&utm_campaign=GS100042&hl=en-IN
    - generic [ref=e7]:
      - generic [ref=e8]:
        - link "Gmail" [ref=e10]:
          - /url: https://mail.google.com/mail/&ogbl
        - link "Search for Images" [ref=e12]:
          - /url: https://www.google.com/imghp?hl=en&ogbl
          - text: Images
      - button "Google apps" [ref=e15] [cursor=pointer]:
        - img [ref=e16]
      - link "Sign in" [ref=e20]:
        - /url: https://accounts.google.com/ServiceLogin?hl=en&passive=true&continue=https://www.google.com/&ec=futura_exp_og_so_72776762_e
  - generic [ref=e22]:
    - 'link "World Cup 2026: The art of the elástico" [ref=e23]':
      - /url: /search?sca_esv=2ab59e100257b972&q=FIFA+World+Cup+2026+bracket&oi=ddle&noiga=1&ct=516786401&hl=en-GB&stick=H4sIAAAAAAAC_-MQesSYwi3w8sc9YanoSWtOXmMM5ZIILsgvKikOyS8tykvMTc0rcSpKTM5OLSkWMuViDU7OL0gV0hHS4hKAKPNNLEnOcC_KLy0QEuNi80lNTC9NFeKR4uLi0M_VNzA2KDS3YtJg5FnEKu3m6eaoEJ5flJOi4FxaoGBkYGSmkAQxGgCMeSQmhwAAAA&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQPQgG
      - 'img "World Cup 2026: The art of the elástico" [ref=e25]'
    - button "Share" [ref=e27]:
      - generic "Share" [ref=e28] [cursor=pointer]:
        - img [ref=e32]
  - search [ref=e35]:
    - generic [ref=e37]:
      - generic [ref=e39]:
        - button "Add files and tools" [ref=e42] [cursor=pointer]:
          - img [ref=e44]
        - combobox "Search" [expanded] [active] [ref=e47]:
          - text: Selenium
          - listbox [ref=e49]:
            - generic [ref=e50]:
              - img [ref=e52]
              - option "selenium" [ref=e55]:
                - generic [ref=e56]: selenium
            - generic [ref=e57]:
              - img [ref=e59]
              - option "selenium download" [ref=e62]:
                - generic [ref=e63]: selenium download
            - generic [ref=e64]:
              - img [ref=e66]
              - option "selenium testing" [ref=e69]:
                - generic [ref=e70]: selenium testing
            - generic [ref=e71]:
              - img [ref=e73]
              - option "selenium rich foods" [ref=e76]:
                - generic [ref=e77]: selenium rich foods
            - generic [ref=e78]:
              - img [ref=e80]
              - option "selenium interview questions" [ref=e83]:
                - generic [ref=e84]: selenium interview questions
            - generic [ref=e85]:
              - img [ref=e87]
              - option "selenium sulfide shampoo" [ref=e90]:
                - generic [ref=e91]: selenium sulfide shampoo
            - generic [ref=e92]:
              - img [ref=e94]
              - option "selenium maven dependency" [ref=e97]:
                - generic [ref=e98]: selenium maven dependency
            - generic [ref=e99]:
              - img [ref=e101]
              - option "selenium automation testing" [ref=e104]:
                - generic [ref=e105]: selenium automation testing
            - generic [ref=e106]:
              - img [ref=e108]
              - option "selenium ide download" [ref=e111]:
                - generic [ref=e112]: selenium ide download
            - generic [ref=e113]:
              - img [ref=e115]
              - option "selenium training in chennai" [ref=e118]:
                - generic [ref=e119]: selenium training in chennai
        - generic [ref=e120]:
          - button "Clear" [ref=e122] [cursor=pointer]:
            - img [ref=e124]
          - link "AI Mode" [ref=e126] [cursor=pointer]:
            - generic [ref=e128]:
              - generic [ref=e129]: AI Mode
              - img [ref=e131]
      - generic [ref=e133]:
        - generic [ref=e137]:
          - button "Google Search" [ref=e138] [cursor=pointer]
          - button "I'm Feeling Lucky" [ref=e139] [cursor=pointer]
        - button "Report inappropriate predictions" [ref=e140] [cursor=pointer]:
          - generic [ref=e141]: Report inappropriate predictions
      - generic [ref=e143]:
        - button "Google Search" [ref=e144] [cursor=pointer]
        - button "I'm Feeling Lucky" [ref=e145] [cursor=pointer]
  - generic [ref=e148]:
    - text: "Google offered in:"
    - link "हिन्दी" [ref=e149]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCDw
    - link "বাংলা" [ref=e150]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=bn&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCD0
    - link "తెలుగు" [ref=e151]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=te&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCD4
    - link "मराठी" [ref=e152]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCD8
    - link "தமிழ்" [ref=e153]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=ta&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCEA
    - link "ગુજરાતી" [ref=e154]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=gu&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCEE
    - link "ಕನ್ನಡ" [ref=e155]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=kn&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCEI
    - link "മലയാളം" [ref=e156]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=ml&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCEM
    - link "ਪੰਜਾਬੀ" [ref=e157]:
      - /url: https://www.google.com/setprefs?sig=0_jbN_-ZPnJ3MuQHV8C5BZ9w4G-2U%3D&hl=pa&source=homepage&sa=X&ved=0ahUKEwjnwsns9quVAxWHaHADHQ25KIYQ2ZgBCEQ
  - contentinfo [ref=e159]:
    - generic [ref=e160]: India
    - generic [ref=e161]:
      - generic [ref=e162]:
        - link "Advertising" [ref=e163]:
          - /url: https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1
        - link "Business" [ref=e164]:
          - /url: https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1
        - link "How Search works" [ref=e165]:
          - /url: https://google.com/search/howsearchworks/?fg=1
      - generic [ref=e166]:
        - link "Privacy" [ref=e167]:
          - /url: https://policies.google.com/privacy?hl=en-IN&fg=1
        - link "Terms" [ref=e168]:
          - /url: https://policies.google.com/terms?hl=en-IN&fg=1
        - button "Settings" [ref=e172] [cursor=pointer]:
          - generic [ref=e173]: Settings
```

# Test source

```ts
  1  | import {test, expect} from '@playwright/test'
  2  | 
  3  | const testData = [
  4  |     {key: "Playwright", expectedText: "Playwright"},
  5  |     {key: "Selenium", expectedText: "Selenium"},
  6  |     {key: "Cypress", expectedText: "Cypress"},
  7  | ]
  8  | 
  9  | test.describe("Search Test", () =>{
  10 | 
  11 |     for(const data of testData) {
  12 | 
  13 |         test(`Search test for ${data.key}`, async ({page}) => {
  14 | 
  15 |             await page.goto("https://www.google.co.in");
  16 |             await page.fill("//textarea[@class = 'gLFyf']", data.key);
> 17 |             await page.click("//span[@class = 'PD3zdc L0nkUd z1asCe']");
     |                        ^ Error: page.click: Test timeout of 30000ms exceeded.
  18 | 
  19 |         })
  20 |         
  21 |     }
  22 | })
```