import {test, expect} from '@playwright/test'

test("Download PDF", async ({page}) => {

    await page.goto("https://qwikpdf.com/sample-pdf-with-text-and-images.html");

    const downloadPromise = page.waitForEvent('download');

    await page.click("//button[@id = 'btn-size-100kb']");

    const download  = await downloadPromise;

    await download.saveAs(`./downloads/${download.suggestedFilename()}`);

})