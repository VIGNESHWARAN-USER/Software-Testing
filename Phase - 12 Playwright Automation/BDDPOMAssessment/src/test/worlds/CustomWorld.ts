import { setWorldConstructor, World } from "@cucumber/cucumber";
import { Browser, BrowserContext, Page } from "@playwright/test";
import { HomePage } from "../pages/HomePage";
import { LoginPage } from "../pages/LoginPage";
import { RegisterPage } from "../pages/RegisterPage";
import { SuccessPage } from "../pages/SuccessPage";

export class CustomWorld extends World {

    page!: Page;
    context!: BrowserContext;
    browser!: Browser;
    
    homePage!: HomePage;
    loginPage!: LoginPage;
    registerPage!: RegisterPage;
    successPage!: SuccessPage;
}

setWorldConstructor(CustomWorld);