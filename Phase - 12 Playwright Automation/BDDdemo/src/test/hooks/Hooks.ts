import { Before, After, Status } from "@cucumber/cucumber";
import { Browser, chromium } from "@playwright/test";
import { CustomWorld } from "./World";



Before(async function(this: CustomWorld)  {
    this.browser = await chromium.launch({
        headless: false
    });
    const context = await this.browser.newContext();
    const page = await context.newPage();
    this.page = page;
    this.page.setDefaultTimeout(60 * 1000);
});

After(async function (this: CustomWorld, {pickle, result})  {

    if(result?.status === Status.FAILED) {
        const img = await this.page.screenshot({path : `./reports/screenshots/${pickle.name}.png`, type:'png'})
        await this.attach(img, 'image/png');
    }
    
    await this.page.close();
    await this.browser.close();
});