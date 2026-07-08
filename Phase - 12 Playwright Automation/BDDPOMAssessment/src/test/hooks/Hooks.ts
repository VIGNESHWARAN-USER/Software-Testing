import { Before, After, BeforeAll, AfterAll, Status } from "@cucumber/cucumber";
import { Browser, chromium } from "@playwright/test";
import { CustomWorld } from "../worlds/CustomWorld";
import { LoginPage } from "../pages/LoginPage";
import { RegisterPage } from "../pages/RegisterPage";
import { SuccessPage } from "../pages/SuccessPage";
import { HomePage } from "../pages/HomePage";

let browser:Browser;

BeforeAll(async () => {
    browser = await chromium.launch({headless: false});
})

Before(async function(this: CustomWorld) {
    this.browser =  browser;
    this.context = await this.browser.newContext();
    this.page = await this.context.newPage()

    this.loginPage = new LoginPage(this.page);
    this.registerPage = new RegisterPage(this.page);
    this.successPage = new SuccessPage(this.page);
    this.homePage = new HomePage(this.page);
})

After(async function (this: CustomWorld, {pickle, result}) {

    if(result?.status === Status.FAILED) {
        const img = await this.page.screenshot({path: `reports/screenshots/${pickle.name}${Date.now()}.png`, type: 'png'})
        this.attach(img, 'image/png');
    }

    await this.page.close();
    await this.context.close();
})

AfterAll(async () => {
    if(browser) {
        await browser.close();
    }
})