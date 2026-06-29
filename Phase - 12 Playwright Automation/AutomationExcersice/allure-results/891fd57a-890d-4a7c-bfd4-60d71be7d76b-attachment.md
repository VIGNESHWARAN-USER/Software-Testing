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
  - waiting for locator('//span[text() = \'AI Mode\']')

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
      - /url: /search?sca_esv=2ab59e100257b972&q=FIFA+World+Cup+2026+bracket&oi=ddle&noiga=1&ct=516786401&hl=en-GB&stick=H4sIAAAAAAAC_-MQesSYwi3w8sc9YanoSWtOXmMM5ZIILsgvKikOyS8tykvMTc0rcSpKTM5OLSkWMuViDU7OL0gV0hHS4hKAKPNNLEnOcC_KLy0QEuNi80lNTC9NFeKR4uLi0M_VNzA2KDS3YtJg5FnEKu3m6eaoEJ5flJOi4FxaoGBkYGSmkAQxGgCMeSQmhwAAAA&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQPQgE
      - 'img "World Cup 2026: The art of the elástico" [ref=e25]'
    - button "Share" [ref=e27]:
      - generic "Share" [ref=e28] [cursor=pointer]:
        - img [ref=e32]
  - search [ref=e35]:
    - generic [ref=e37]:
      - generic [ref=e39]:
        - img [ref=e43]
        - combobox "Search" [expanded] [active] [ref=e46]:
          - text: Selenium
          - listbox [ref=e48]:
            - generic [ref=e49]:
              - img [ref=e51]
              - option "selenium" [ref=e54]:
                - generic [ref=e55]: selenium
            - generic [ref=e56]:
              - img [ref=e58]
              - option "selenium rich foods" [ref=e61]:
                - generic [ref=e62]: selenium rich foods
            - generic [ref=e63]:
              - img [ref=e65]
              - option "selenium download" [ref=e68]:
                - generic [ref=e69]: selenium download
            - generic [ref=e70]:
              - img [ref=e72]
              - option "selenium ide" [ref=e75]:
                - generic [ref=e76]: selenium ide
            - generic [ref=e77]:
              - img [ref=e79]
              - option "selenium interview questions" [ref=e82]:
                - generic [ref=e83]: selenium interview questions
            - generic [ref=e84]:
              - img [ref=e86]
              - option "selenium testing" [ref=e89]:
                - generic [ref=e90]: selenium testing
            - generic [ref=e91]:
              - img [ref=e93]
              - option "selenium sulfide shampoo" [ref=e96]:
                - generic [ref=e97]: selenium sulfide shampoo
            - generic [ref=e98]:
              - img [ref=e100]
              - option "selenium automation testing" [ref=e103]:
                - generic [ref=e104]: selenium automation testing
            - generic [ref=e105]:
              - img [ref=e107]
              - option "selenium java" [ref=e110]:
                - generic [ref=e111]: selenium java
            - generic [ref=e112]:
              - img [ref=e114]
              - option "selenium ide download" [ref=e117]:
                - generic [ref=e118]: selenium ide download
      - generic [ref=e119]:
        - generic [ref=e123]:
          - button "Google Search" [ref=e124] [cursor=pointer]
          - button "I'm Feeling Lucky" [ref=e125] [cursor=pointer]
        - button "Report inappropriate predictions" [ref=e126] [cursor=pointer]:
          - generic [ref=e127]: Report inappropriate predictions
      - generic [ref=e129]:
        - button "Google Search" [ref=e130] [cursor=pointer]
        - button "I'm Feeling Lucky" [ref=e131] [cursor=pointer]
  - generic [ref=e134]:
    - text: "Google offered in:"
    - link "हिन्दी" [ref=e135]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCCg
    - link "বাংলা" [ref=e136]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=bn&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCCk
    - link "తెలుగు" [ref=e137]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=te&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCCo
    - link "मराठी" [ref=e138]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCCs
    - link "தமிழ்" [ref=e139]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=ta&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCCw
    - link "ગુજરાતી" [ref=e140]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=gu&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCC0
    - link "ಕನ್ನಡ" [ref=e141]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=kn&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCC4
    - link "മലയാളം" [ref=e142]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=ml&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCC8
    - link "ਪੰਜਾਬੀ" [ref=e143]:
      - /url: https://www.google.com/setprefs?sig=0_LR6etNjWQz0X8pNTRYWX8JknhAk%3D&hl=pa&source=homepage&sa=X&ved=0ahUKEwi95s7U-KuVAxXrR2cHHX5GPIQQ2ZgBCDA
  - contentinfo [ref=e145]:
    - generic [ref=e146]: India
    - generic [ref=e147]:
      - generic [ref=e148]:
        - link "Advertising" [ref=e149]:
          - /url: https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1
        - link "Business" [ref=e150]:
          - /url: https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1
        - link "How Search works" [ref=e151]:
          - /url: https://google.com/search/howsearchworks/?fg=1
      - generic [ref=e152]:
        - link "Privacy" [ref=e153]:
          - /url: https://policies.google.com/privacy?hl=en-IN&fg=1
        - link "Terms" [ref=e154]:
          - /url: https://policies.google.com/terms?hl=en-IN&fg=1
        - button "Settings" [ref=e158] [cursor=pointer]:
          - generic [ref=e159]: Settings
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
  15 |             await page.goto("https://www.google.com");
  16 |             await page.fill("//textarea[@class = 'gLFyf']", data.key);
> 17 |             await page.click("//span[text() = 'AI Mode']");
     |                        ^ Error: page.click: Test timeout of 30000ms exceeded.
  18 | 
  19 |         })
  20 |         
  21 |     }
  22 | })
```