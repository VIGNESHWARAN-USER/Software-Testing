import { Page,Locator } from "@playwright/test";
import { BasePage } from "./BasePage";
export class DashboardPage extends BasePage{
    readonly page:Page;
    readonly Mydashboard:Locator;
    constructor(page:Page){
        super();
        this.page=page;
        this.Mydashboard=page.locator("//h2[normalize-space()='My Account']")
    }
}
