# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: parameterization.test.ts >> Search Test >> Search test for Cypress
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
    32 × waiting for element to be visible, enabled and stable
       - element is not visible
     - retrying click action
       - waiting 500ms
    - waiting for element to be visible, enabled and stable

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
      - /url: /search?sca_esv=2ab59e100257b972&q=FIFA+World+Cup+2026+bracket&oi=ddle&noiga=1&ct=516786401&hl=en-GB&stick=H4sIAAAAAAAC_-MQesSYwi3w8sc9YanoSWtOXmMM5ZIILsgvKikOyS8tykvMTc0rcSpKTM5OLSkWMuViDU7OL0gV0hHS4hKAKPNNLEnOcC_KLy0QEuNi80lNTC9NFeKR4uLi0M_VNzA2KDS3YtJg5FnEKu3m6eaoEJ5flJOi4FxaoGBkYGSmkAQxGgCMeSQmhwAAAA&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQPQgG
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
          - text: Cypress
          - listbox [ref=e49]:
            - generic [ref=e50]:
              - img [ref=e52]
              - option "cypress" [ref=e55]:
                - generic [ref=e56]: cypress
            - generic [ref=e57]:
              - img [ref=e59]
              - option "cypress oil" [ref=e62]:
                - generic [ref=e63]: cypress oil
            - option "cypress tree" [ref=e67]:
              - generic [ref=e68]: cypress tree
              - generic [ref=e69]: Mediterranean cypress — Plant
            - generic [ref=e70]:
              - img [ref=e72]
              - option "cypress automation tool" [ref=e75]:
                - generic [ref=e76]: cypress automation tool
            - option "cypress vine" [ref=e80]:
              - generic [ref=e81]: Cypress vine
              - generic [ref=e82]: Plant
            - generic [ref=e83]:
              - img [ref=e85]
              - option "cypress testing" [ref=e88]:
                - generic [ref=e89]: cypress testing
            - generic [ref=e90]:
              - img [ref=e92]
              - option "cypress oil benefits" [ref=e95]:
                - generic [ref=e96]: cypress oil benefits
            - generic [ref=e97]:
              - img [ref=e99]
              - option "cypress vs playwright" [ref=e102]:
                - generic [ref=e103]: cypress vs playwright
            - option "cypress plant" [ref=e107]:
              - generic [ref=e108]: cypress plant
              - generic [ref=e109]: Cupressus
            - generic [ref=e110]:
              - img [ref=e112]
              - option "cypress meaning" [ref=e115]:
                - generic [ref=e116]: cypress meaning
        - link "AI Mode" [ref=e118] [cursor=pointer]:
          - generic [ref=e120]:
            - generic [ref=e121]: AI Mode
            - img [ref=e123]
      - generic [ref=e125]:
        - generic [ref=e129]:
          - button "Google Search" [ref=e130] [cursor=pointer]
          - button "I'm Feeling Lucky" [ref=e131] [cursor=pointer]
        - button "Report inappropriate predictions" [ref=e132] [cursor=pointer]:
          - generic [ref=e133]: Report inappropriate predictions
      - generic [ref=e135]:
        - button "Google Search" [ref=e136] [cursor=pointer]
        - button "I'm Feeling Lucky" [ref=e137] [cursor=pointer]
  - generic [ref=e140]:
    - text: "Google offered in:"
    - link "हिन्दी" [ref=e141]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCDs
    - link "বাংলা" [ref=e142]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=bn&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCDw
    - link "తెలుగు" [ref=e143]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=te&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCD0
    - link "मराठी" [ref=e144]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCD4
    - link "தமிழ்" [ref=e145]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=ta&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCD8
    - link "ગુજરાતી" [ref=e146]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=gu&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCEA
    - link "ಕನ್ನಡ" [ref=e147]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=kn&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCEE
    - link "മലയാളം" [ref=e148]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=ml&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCEI
    - link "ਪੰਜਾਬੀ" [ref=e149]:
      - /url: https://www.google.com/setprefs?sig=0_BpYJZmMi1nobmitVaMH1ZNmZP9I%3D&hl=pa&source=homepage&sa=X&ved=0ahUKEwj6sJS99quVAxWKR2wGHWLnKKIQ2ZgBCEM
  - contentinfo [ref=e151]:
    - generic [ref=e152]: India
    - generic [ref=e153]:
      - generic [ref=e154]:
        - link "Advertising" [ref=e155]:
          - /url: https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1
        - link "Business" [ref=e156]:
          - /url: https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1
        - link "How Search works" [ref=e157]:
          - /url: https://google.com/search/howsearchworks/?fg=1
      - generic [ref=e158]:
        - link "Privacy" [ref=e159]:
          - /url: https://policies.google.com/privacy?hl=en-IN&fg=1
        - link "Terms" [ref=e160]:
          - /url: https://policies.google.com/terms?hl=en-IN&fg=1
        - button "Settings" [ref=e164] [cursor=pointer]:
          - generic [ref=e165]: Settings
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