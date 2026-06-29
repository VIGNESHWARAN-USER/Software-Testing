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
    7 × waiting for element to be visible, enabled and stable
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
      - /url: /search?sca_esv=2ab59e100257b972&q=FIFA+World+Cup+2026+bracket&oi=ddle&noiga=1&ct=516786401&hl=en-GB&stick=H4sIAAAAAAAC_-MQesSYwi3w8sc9YanoSWtOXmMM5ZIILsgvKikOyS8tykvMTc0rcSpKTM5OLSkWMuViDU7OL0gV0hHS4hKAKPNNLEnOcC_KLy0QEuNi80lNTC9NFeKR4uLi0M_VNzA2KDS3YtJg5FnEKu3m6eaoEJ5flJOi4FxaoGBkYGSmkAQxGgCMeSQmhwAAAA&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQPQgG
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
            - generic [ref=e64]:
              - img [ref=e66]
              - option "cypress tree" [ref=e69]:
                - generic [ref=e70]: cypress tree
                - generic [ref=e71]: Mediterranean cypress — Plant
            - generic [ref=e72]:
              - img [ref=e74]
              - option "cypress automation tool" [ref=e77]:
                - generic [ref=e78]: cypress automation tool
            - generic [ref=e79]:
              - img [ref=e81]
              - option "cypress vine" [ref=e84]:
                - generic [ref=e85]: Cypress vine
                - generic [ref=e86]: Plant
            - generic [ref=e87]:
              - img [ref=e89]
              - option "cypress testing" [ref=e92]:
                - generic [ref=e93]: cypress testing
            - generic [ref=e94]:
              - img [ref=e96]
              - option "cypress oil benefits" [ref=e99]:
                - generic [ref=e100]: cypress oil benefits
            - generic [ref=e101]:
              - img [ref=e103]
              - option "cypress vs playwright" [ref=e106]:
                - generic [ref=e107]: cypress vs playwright
            - generic [ref=e108]:
              - img [ref=e110]
              - option "cypress plant" [ref=e113]:
                - generic [ref=e114]: cypress plant
                - generic [ref=e115]: Cupressus
            - generic [ref=e116]:
              - img [ref=e118]
              - option "cypress meaning" [ref=e121]:
                - generic [ref=e122]: cypress meaning
        - generic [ref=e123]:
          - button "Clear" [ref=e125] [cursor=pointer]:
            - img [ref=e127]
          - link "AI Mode" [ref=e129] [cursor=pointer]:
            - generic [ref=e131]:
              - generic [ref=e132]: AI Mode
              - img [ref=e134]
      - generic [ref=e136]:
        - generic [ref=e140]:
          - button "Google Search" [ref=e141] [cursor=pointer]
          - button "I'm Feeling Lucky" [ref=e142] [cursor=pointer]
        - button "Report inappropriate predictions" [ref=e143] [cursor=pointer]:
          - generic [ref=e144]: Report inappropriate predictions
      - generic [ref=e146]:
        - button "Google Search" [ref=e147] [cursor=pointer]
        - button "I'm Feeling Lucky" [ref=e148] [cursor=pointer]
  - generic [ref=e151]:
    - text: "Google offered in:"
    - link "हिन्दी" [ref=e152]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=hi&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCDk
    - link "বাংলা" [ref=e153]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=bn&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCDo
    - link "తెలుగు" [ref=e154]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=te&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCDs
    - link "मराठी" [ref=e155]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=mr&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCDw
    - link "தமிழ்" [ref=e156]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=ta&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCD0
    - link "ગુજરાતી" [ref=e157]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=gu&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCD4
    - link "ಕನ್ನಡ" [ref=e158]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=kn&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCD8
    - link "മലയാളം" [ref=e159]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=ml&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCEA
    - link "ਪੰਜਾਬੀ" [ref=e160]:
      - /url: https://www.google.com/setprefs?sig=0_wlQVnrjdwhnwcbm0oOY0tjSBgow%3D&hl=pa&source=homepage&sa=X&ved=0ahUKEwjjleCZ-KuVAxUbXmwGHb8HFvcQ2ZgBCEE
  - contentinfo [ref=e162]:
    - generic [ref=e163]: India
    - generic [ref=e164]:
      - generic [ref=e165]:
        - link "Advertising" [ref=e166]:
          - /url: https://www.google.com/intl/en_in/ads/?subid=ww-ww-et-g-awa-a-g_hpafoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpafooter&fg=1
        - link "Business" [ref=e167]:
          - /url: https://www.google.com/services/?subid=ww-ww-et-g-awa-a-g_hpbfoot1_1!o2&utm_source=google.com&utm_medium=referral&utm_campaign=google_hpbfooter&fg=1
        - link "How Search works" [ref=e168]:
          - /url: https://google.com/search/howsearchworks/?fg=1
      - generic [ref=e169]:
        - link "Privacy" [ref=e170]:
          - /url: https://policies.google.com/privacy?hl=en-IN&fg=1
        - link "Terms" [ref=e171]:
          - /url: https://policies.google.com/terms?hl=en-IN&fg=1
        - button "Settings" [ref=e175] [cursor=pointer]:
          - generic [ref=e176]: Settings
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
> 17 |             await page.click("//span[@class = 'PD3zdc L0nkUd z1asCe']");
     |                        ^ Error: page.click: Test timeout of 30000ms exceeded.
  18 | 
  19 |         })
  20 |         
  21 |     }
  22 | })
```