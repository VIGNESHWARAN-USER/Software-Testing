import { LoginData } from './../types/LoginData';
import { Before, After, BeforeAll, AfterAll } from "@cucumber/cucumber";
import { Browser, chromium } from "@playwright/test";
import { App } from "../world/CustomWorld";
import { HomePage } from "../pages/HomePage";
import { LoginPage } from '../pages/LoginPage';
import { SuccessPage } from '../pages/SuccessPage';

let browser: Browser;

BeforeAll(async () => {
    browser = await chromium.launch({
        headless: false
    });
});

Before(async function (this: App) {
    this.browser = browser;
    this.context = await browser.newContext();
    this.page = await this.context.newPage();

    this.homePage = new HomePage(this.page);
    this.loginPage = new LoginPage(this.page);
    this.successPage = new SuccessPage(this.page);
});

After(async function (this: App) {
    await this.page.close();
    await this.context.close();
});

AfterAll(async () => {
    if (browser) {
        await browser.close();
    }
});