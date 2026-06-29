# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: DownloadPDF.test.ts >> Download PDF
- Location: tests\DownloadPDF.test.ts:3:5

# Error details

```
Error: download.saveAs: ENOENT: no such file or directory, copyfile 'D:\EXPLEO SMARTCLIFF\Phase - 12 Playwright Automation\AutomationExcersice\test-results\.playwright-artifacts-0\d20975b8-91ed-4d99-a785-2aa1654b4162' -> 'D:\EXPLEO SMARTCLIFF\Phase - 12 Playwright Automation\AutomationExcersice\downloads\suggestedFilename() {
        return this._suggestedFilename;
      }'
```

# Test source

```ts
  1  | import {test, expect} from '@playwright/test'
  2  | 
  3  | test("Download PDF", async ({page}) => {
  4  | 
  5  |     await page.goto("https://qwikpdf.com/sample-pdf-with-text-and-images.html");
  6  | 
  7  |     const downloadPromise = page.waitForEvent('download');
  8  | 
  9  |     await page.click("//button[@id = 'btn-size-100kb']");
  10 | 
  11 |     const download  = await downloadPromise;
  12 | 
> 13 |     download.saveAs(`./downloads/${download.suggestedFilename}`);
     |              ^ Error: download.saveAs: ENOENT: no such file or directory, copyfile 'D:\EXPLEO SMARTCLIFF\Phase - 12 Playwright Automation\AutomationExcersice\test-results\.playwright-artifacts-0\d20975b8-91ed-4d99-a785-2aa1654b4162' -> 'D:\EXPLEO SMARTCLIFF\Phase - 12 Playwright Automation\AutomationExcersice\downloads\suggestedFilename() {
  14 | 
  15 | })
```