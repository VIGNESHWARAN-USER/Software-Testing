import { Before,After,BeforeAll,AfterAll,Status } from "@cucumber/cucumber";
import { Browser, chromium } from "@playwright/test";
import { CustomWorld } from "../world/CustomWorld";
import { HomePage } from "../pages/HomePage";
import { LoginPage } from "../pages/LoginPage";
import { DashboardPage } from "../pages/DashboardPage";
import { logger } from "../utils/logger";
let browser:Browser;
BeforeAll(async() =>{
    browser=await chromium.launch({headless:false})
})
Before(async function(this:CustomWorld,scenario){
    this.browser=browser;
    logger.info("Browser created")
    this.context=await browser.newContext();
    this.page=await this.context.newPage();
    logger.info("Page created")
    this.hp=new HomePage(this.page);
    this.lp=new LoginPage(this.page)
    this.dp=new DashboardPage(this.page)
});
After(async function (this: CustomWorld, { pickle, result }) {
    console.log(result?.status);
    if (result?.status === Status.FAILED) {
        const img = await this.page.screenshot({
            path: `./test-result/screenshots/${pickle.name}.png`,
            type: "png",
        });
        await this.attach(img, "image/png");
    }
    await this.page.close();
    await this.context.close();
    await this.browser.close();
});
AfterAll(async()=>{
    logger.info("Browser closed")
    await browser.close();
})