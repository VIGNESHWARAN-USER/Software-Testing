# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: TestCase6.test.ts >> Testcase 6 - Contact Us Form
- Location: tests\TestCase6.test.ts:3:5

# Error details

```
Error: ENOENT: no such file or directory, stat 'D:\EXPLEO SMARTCLIFF\Phase - 12 Playwright Automation\AutomationExcersice\TestCase5.test.ts'
```

```
Error: page.click: Test ended.
Call log:
  - waiting for locator('//input[@data-qa  = \'submit-button\']')
    - locator resolved to <input type="submit" name="submit" value="Submit" data-qa="submit-button" class="btn btn-primary pull-left submit_form"/>
  - attempting click action
    - waiting for element to be visible, enabled and stable

```

# Page snapshot

```yaml
- generic [ref=e1]:
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
  - generic [ref=e37]:
    - heading "Contact Us" [level=2] [ref=e41]:
      - text: Contact
      - strong [ref=e42]: Us
    - generic [ref=e43]:
      - generic [ref=e45]:
        - generic [ref=e46]:
          - text: "Note: Below contact form is for testing purpose."
          - link "Software testing tools" [ref=e47] [cursor=pointer]:
            - img [ref=e49]
            - text: Software testing tools
        - heading "Get In Touch" [level=2] [ref=e51]
        - generic [ref=e53]:
          - textbox "Name" [ref=e55]: Vigneshwaran
          - textbox "Email" [ref=e57]: Vigneshwaran@gmail.com
          - textbox "Subject" [ref=e59]: Sample Mail
          - textbox "Your Message Here" [active] [ref=e61]: Test message
          - button "Choose File" [ref=e63]
          - button "Submit" [ref=e65] [cursor=pointer]
      - generic [ref=e67]:
        - heading "Feedback For Us" [level=2] [ref=e68]
        - generic [ref=e69]:
          - paragraph [ref=e70]: We really appreciate your response to our website.
          - paragraph [ref=e71]:
            - text: Kindly share your feedback with us at
            - link "feedback@automationexercise.com" [ref=e72]:
              - /url: mailto:feedback@automationexercise.com
            - text: .
          - paragraph [ref=e73]: If you have any suggestion areas or improvements, do let us know. We will definitely work on it.
          - paragraph [ref=e74]: Thank you
  - insertion [ref=e76]:
    - generic [ref=e79]:
      - heading "These are topics related to the article that might interest you" [level=2] [ref=e81]: Discover more
      - link "Test case management" [ref=e82] [cursor=pointer]:
        - generic "Test case management" [ref=e83]
        - img [ref=e85]
      - link "Software testing courses" [ref=e87] [cursor=pointer]:
        - generic "Software testing courses" [ref=e88]
        - img [ref=e90]
      - link "Constitutional Law & Civil Rights" [ref=e92] [cursor=pointer]:
        - generic "Constitutional Law & Civil Rights" [ref=e93]
        - img [ref=e95]
  - contentinfo [ref=e97]:
    - generic [ref=e102]:
      - heading "Subscription" [level=2] [ref=e103]
      - generic [ref=e104]:
        - textbox "Your email address" [ref=e105]
        - button "" [ref=e106] [cursor=pointer]:
          - generic [ref=e107]: 
        - paragraph [ref=e108]:
          - text: Get the most recent updates from
          - text: our site and be updated your self...
    - paragraph [ref=e112]: Copyright © 2021 All rights reserved
  - text: 
  - insertion [ref=e113]:
    - iframe [ref=e116]:
      - generic [active] [ref=f23e1]:
        - generic [ref=f23e6]:
          - generic [ref=f23e7]:
            - generic "Google Chrome" [ref=f23e8]:
              - link "Download Chrome" [ref=f23e9] [cursor=pointer]:
                - /url: https://googleads.g.doubleclick.net/aclk?sa=l&ai=CLW9D2TRCaviTLuCd4dkPj_P56AjtsbmGiAHqiYmvwxWwkB8QASD9tJ6VAWDlmuiD2A6gAY6Q3LEoyAEBqAMByAPLBKoE-QFP0A7aF7E0k7O_8wC8qYgFFxfaisqON7Uegiva49HsccEUQPH6eb7o04Nle8bM1ia8lS8A_nbeAVHBhMjqJx4JUoKt3fgyNbCMgboTd-F55EFISav2qGzKoklCWpwK5Ub6pBEibTtQ2lHDi6JNbu_EmFtsJzx9xzAljYaivyp86vy-GGpGWrUHnz3FFi-rkbs40ZKVUirunUqd3oQq79QLVHCP0NmbyruElXboSE9Kks8x99SIBwkKbmgA9gq7l5dejPUT4Vw4yJnBwPFcE2cQ6I1roQMFd3IBz_d6LTaZYp2yDwU2zOPeZXKplzTKpxVRHxV1Hbo3-lDABN7qlMzWBYgFw6-KpleAB-OJzSKoB6fMsQKoB-LYsQKoB6a-G6gHzM6xAqgH89EbqAeW2BuoB6qbsQKoB47OG6gHk9gbqAfw4BuoB-6WsQKoB_6esQKoB6--sQKoB9XJG6gH2baxAqgHmgaoB_-esQKoB9-fsQKoB_jCsQKoB_vCsQKoB8LIsQLYBwHSCDMIgGEQARifAzIIioKAgICAgAg6D4BAgMCAgICAqIACqIOAEEi9_cE6WOqjvdeLrJUDYAGaCSpodHRwczovL3d3dy5nb29nbGUuY29tL2Nocm9tZS9kci9kb3dubG9hZC-xCUsuLQSyVgiCgAoByAsB4AsBogwlYhcKFWNvbS5nb29nbGUuY2hyb21lLmlvc2oCCgB4AYgBAZABAaoNAklOyA0B6g0TCLbovteLrJUDFeBOOAUdj3kejYgOCdgTDIgUBNAVAZgWAcoWAgoA-BYBgBcBshcEGAFQBroXAjgBshgJEgLeaBgBIgEA0BgB6BgBshkBL8IZAggB&gclid=EAIaIQobChMIuOS-14uslQMV4E44BR2PeR6NEAEYASAAEgKGwvD_BwE&num=1&cid=CAQShgIAEQoqgQDR_A4A1rftFTxZSYjj39IrcvC_vCRk3S_wByGN6oaIjlSZJ2chI4JdhjzBmmKdMW2QUtwAhgiEMpxxs5js-f4_qUktKlBuXEYfPlW0-RU5VqUskAod5oLH2c8GXa8rXf7V6QHz5gXRMeQHp4eSUfa2WX4lvPuU1XyRfS0hJmtwa-VE-wp1yrkn2C6XAwJsp0zi2kpbPSZlmPtj6C307oZvuCX3SRNUuwSptOx07WzsJgsBFrt4GOFjeUqQVGmH6hCkKmhTkxFppHO-92CqCENLzeDv1D4KJ_ErGe_lWEYF4zXXUq5Y_xXB782fvS61Fwg82kwleh7w1z02XnDjJ8oAGAE&sig=AOD64_1AN6fVT_94KRKCJz9LHaF3-v6DSg&client=ca-pub-1677597403311019&rf=1&nb=0&adurl=https://ad.doubleclick.net/ddm/trackclk/N5295.5087813DEMANDGEN/B34618049.437475499%3Bdc_trk_aid%3D629327307%3Bdc_trk_cid%3D246757563%3Bdc_lat%3D%3Bdc_rdid%3D%3Btag_for_child_directed_treatment%3D%3Btfua%3D%3Bgdpr%3D%24%7BGDPR%7D%3Bgdpr_consent%3D%24%7BGDPR_CONSENT_755%7D%3Bltd%3D%3Bdc_tdv%3D1%3Bdc_pubid%3D8%3Fgad_source%3D5%26gad_campaignid%3D23433746371
            - link "Browse securely with Chrome's built-in protection from malware, phishing, and other scams. Google Chrome" [ref=f23e11] [cursor=pointer]:
              - /url: https://googleads.g.doubleclick.net/aclk?sa=l&ai=CLW9D2TRCaviTLuCd4dkPj_P56AjtsbmGiAHqiYmvwxWwkB8QASD9tJ6VAWDlmuiD2A6gAY6Q3LEoyAEBqAMByAPLBKoE-QFP0A7aF7E0k7O_8wC8qYgFFxfaisqON7Uegiva49HsccEUQPH6eb7o04Nle8bM1ia8lS8A_nbeAVHBhMjqJx4JUoKt3fgyNbCMgboTd-F55EFISav2qGzKoklCWpwK5Ub6pBEibTtQ2lHDi6JNbu_EmFtsJzx9xzAljYaivyp86vy-GGpGWrUHnz3FFi-rkbs40ZKVUirunUqd3oQq79QLVHCP0NmbyruElXboSE9Kks8x99SIBwkKbmgA9gq7l5dejPUT4Vw4yJnBwPFcE2cQ6I1roQMFd3IBz_d6LTaZYp2yDwU2zOPeZXKplzTKpxVRHxV1Hbo3-lDABN7qlMzWBYgFw6-KpleAB-OJzSKoB6fMsQKoB-LYsQKoB6a-G6gHzM6xAqgH89EbqAeW2BuoB6qbsQKoB47OG6gHk9gbqAfw4BuoB-6WsQKoB_6esQKoB6--sQKoB9XJG6gH2baxAqgHmgaoB_-esQKoB9-fsQKoB_jCsQKoB_vCsQKoB8LIsQLYBwHSCDMIgGEQARifAzIIioKAgICAgAg6D4BAgMCAgICAqIACqIOAEEi9_cE6WOqjvdeLrJUDYAGaCSpodHRwczovL3d3dy5nb29nbGUuY29tL2Nocm9tZS9kci9kb3dubG9hZC-xCUsuLQSyVgiCgAoByAsB4AsBogwlYhcKFWNvbS5nb29nbGUuY2hyb21lLmlvc2oCCgB4AYgBAZABAaoNAklOyA0B6g0TCLbovteLrJUDFeBOOAUdj3kejYgOCdgTDIgUBNAVAZgWAcoWAgoA-BYBgBcBshcEGAFQBroXAjgBshgJEgLeaBgBIgEA0BgB6BgBshkBL8IZAggB&gclid=EAIaIQobChMIuOS-14uslQMV4E44BR2PeR6NEAEYASAAEgKGwvD_BwE&num=1&cid=CAQShgIAEQoqgQDR_A4A1rftFTxZSYjj39IrcvC_vCRk3S_wByGN6oaIjlSZJ2chI4JdhjzBmmKdMW2QUtwAhgiEMpxxs5js-f4_qUktKlBuXEYfPlW0-RU5VqUskAod5oLH2c8GXa8rXf7V6QHz5gXRMeQHp4eSUfa2WX4lvPuU1XyRfS0hJmtwa-VE-wp1yrkn2C6XAwJsp0zi2kpbPSZlmPtj6C307oZvuCX3SRNUuwSptOx07WzsJgsBFrt4GOFjeUqQVGmH6hCkKmhTkxFppHO-92CqCENLzeDv1D4KJ_ErGe_lWEYF4zXXUq5Y_xXB782fvS61Fwg82kwleh7w1z02XnDjJ8oAGAE&sig=AOD64_1AN6fVT_94KRKCJz9LHaF3-v6DSg&client=ca-pub-1677597403311019&rf=1&nb=7&adurl=https://ad.doubleclick.net/ddm/trackclk/N5295.5087813DEMANDGEN/B34618049.437475499%3Bdc_trk_aid%3D629327307%3Bdc_trk_cid%3D246757563%3Bdc_lat%3D%3Bdc_rdid%3D%3Btag_for_child_directed_treatment%3D%3Btfua%3D%3Bgdpr%3D%24%7BGDPR%7D%3Bgdpr_consent%3D%24%7BGDPR_CONSENT_755%7D%3Bltd%3D%3Bdc_tdv%3D1%3Bdc_pubid%3D8%3Fgad_source%3D5%26gad_campaignid%3D23433746371
              - text: Browse securely with Chrome's built-in protection from malware, phishing, and other
              - text: scams. Google Chrome
          - link "Download" [ref=f23e14] [cursor=pointer]:
            - /url: https://googleads.g.doubleclick.net/aclk?sa=l&ai=CLW9D2TRCaviTLuCd4dkPj_P56AjtsbmGiAHqiYmvwxWwkB8QASD9tJ6VAWDlmuiD2A6gAY6Q3LEoyAEBqAMByAPLBKoE-QFP0A7aF7E0k7O_8wC8qYgFFxfaisqON7Uegiva49HsccEUQPH6eb7o04Nle8bM1ia8lS8A_nbeAVHBhMjqJx4JUoKt3fgyNbCMgboTd-F55EFISav2qGzKoklCWpwK5Ub6pBEibTtQ2lHDi6JNbu_EmFtsJzx9xzAljYaivyp86vy-GGpGWrUHnz3FFi-rkbs40ZKVUirunUqd3oQq79QLVHCP0NmbyruElXboSE9Kks8x99SIBwkKbmgA9gq7l5dejPUT4Vw4yJnBwPFcE2cQ6I1roQMFd3IBz_d6LTaZYp2yDwU2zOPeZXKplzTKpxVRHxV1Hbo3-lDABN7qlMzWBYgFw6-KpleAB-OJzSKoB6fMsQKoB-LYsQKoB6a-G6gHzM6xAqgH89EbqAeW2BuoB6qbsQKoB47OG6gHk9gbqAfw4BuoB-6WsQKoB_6esQKoB6--sQKoB9XJG6gH2baxAqgHmgaoB_-esQKoB9-fsQKoB_jCsQKoB_vCsQKoB8LIsQLYBwHSCDMIgGEQARifAzIIioKAgICAgAg6D4BAgMCAgICAqIACqIOAEEi9_cE6WOqjvdeLrJUDYAGaCSpodHRwczovL3d3dy5nb29nbGUuY29tL2Nocm9tZS9kci9kb3dubG9hZC-xCUsuLQSyVgiCgAoByAsB4AsBogwlYhcKFWNvbS5nb29nbGUuY2hyb21lLmlvc2oCCgB4AYgBAZABAaoNAklOyA0B6g0TCLbovteLrJUDFeBOOAUdj3kejYgOCdgTDIgUBNAVAZgWAcoWAgoA-BYBgBcBshcEGAFQBroXAjgBshgJEgLeaBgBIgEA0BgB6BgBshkBL8IZAggB&gclid=EAIaIQobChMIuOS-14uslQMV4E44BR2PeR6NEAEYASAAEgKGwvD_BwE&num=1&cid=CAQShgIAEQoqgQDR_A4A1rftFTxZSYjj39IrcvC_vCRk3S_wByGN6oaIjlSZJ2chI4JdhjzBmmKdMW2QUtwAhgiEMpxxs5js-f4_qUktKlBuXEYfPlW0-RU5VqUskAod5oLH2c8GXa8rXf7V6QHz5gXRMeQHp4eSUfa2WX4lvPuU1XyRfS0hJmtwa-VE-wp1yrkn2C6XAwJsp0zi2kpbPSZlmPtj6C307oZvuCX3SRNUuwSptOx07WzsJgsBFrt4GOFjeUqQVGmH6hCkKmhTkxFppHO-92CqCENLzeDv1D4KJ_ErGe_lWEYF4zXXUq5Y_xXB782fvS61Fwg82kwleh7w1z02XnDjJ8oAGAE&sig=AOD64_1AN6fVT_94KRKCJz9LHaF3-v6DSg&client=ca-pub-1677597403311019&rf=1&nb=8&adurl=https://ad.doubleclick.net/ddm/trackclk/N5295.5087813DEMANDGEN/B34618049.437475499%3Bdc_trk_aid%3D629327307%3Bdc_trk_cid%3D246757563%3Bdc_lat%3D%3Bdc_rdid%3D%3Btag_for_child_directed_treatment%3D%3Btfua%3D%3Bgdpr%3D%24%7BGDPR%7D%3Bgdpr_consent%3D%24%7BGDPR_CONSENT_755%7D%3Bltd%3D%3Bdc_tdv%3D1%3Bdc_pubid%3D8%3Fgad_source%3D5%26gad_campaignid%3D23433746371
            - generic [ref=f23e17]:
              - generic [ref=f23e18]: Download
              - img [ref=f23e19]
        - img [ref=f23e24] [cursor=pointer]
        - button [ref=f23e26] [cursor=pointer]:
          - img [ref=f23e27]
        - iframe
```

# Test source

```ts
  1  | import { test,expect, Dialog } from '@playwright/test';
  2  | 
  3  | test("Testcase 6 - Contact Us Form",async({page})=>{
  4  | 
  5  |     await page.goto("https://automationexercise.com/")
  6  |     await expect(page).toHaveTitle("Automation Exercise")
  7  | 
  8  |     await page.click("//a[normalize-space()='Contact us']");
  9  | 
  10 |     await expect(page.locator("//h2[text() = 'Get In Touch']")).toBeVisible()
  11 | 
  12 |     await page.fill("//input[@name = 'name']", "Vigneshwaran");
  13 |     await page.fill("//input[@name = 'email']", "Vigneshwaran@gmail.com");
  14 |     await page.fill("//input[@name = 'subject']", "Sample Mail");
  15 |     await page.fill("//textarea[@id = 'message']", "Test message");
  16 |     page.setInputFiles("//input[@name = 'upload_file']", "./TestCase5.test.ts")
  17 | 
  18 |     page.waitForTimeout(100000);
  19 |     
  20 | 
  21 |     page.on('dialog', async dialog => {
  22 |         console.log(dialog.message());
  23 |         await dialog.accept();
  24 |     });
  25 | 
> 26 |     await page.click("//input[@data-qa  = 'submit-button']")
     |                ^ Error: page.click: Test ended.
  27 | 
  28 |     await expect(page.locator("//div[@class = 'status alert alert-success']")).toBeVisible()
  29 | })
```