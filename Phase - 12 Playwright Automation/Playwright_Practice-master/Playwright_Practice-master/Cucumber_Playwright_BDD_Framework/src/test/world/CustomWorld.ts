import { setWorldConstructor, World } from "@cucumber/cucumber";
import { Browser,BrowserContext,Page } from "@playwright/test";
import { LoginPage } from "../pages/LoginPage";
import { DashboardPage } from "../pages/DashboardPage";
import { HomePage } from "../pages/HomePage";
export class CustomWorld extends World{
    browser!:Browser;
    context!:BrowserContext;
    page!:Page
    lp!:LoginPage;
    dp!:DashboardPage;
    hp!:HomePage;
}
setWorldConstructor(CustomWorld)