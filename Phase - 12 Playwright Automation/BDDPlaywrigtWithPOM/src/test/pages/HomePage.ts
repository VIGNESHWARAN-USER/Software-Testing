import {Locator, Page} from '@playwright/test'
import { BasePage } from './BasePage';

export class HomePage extends BasePage{
    
    readonly myAccountIcon: Locator;
    readonly registerButton: Locator;
    readonly loginButton: Locator;
    readonly searchInput: Locator;
    readonly searchButton: Locator;

    constructor(page: Page) {
        super(page);

        this.myAccountIcon = page.locator("//i[@class = 'fa fa-user']")
        this.registerButton = page.locator("//a[text() = 'Register']").first();
        this.loginButton = page.locator("//a[text() = 'Login']").first();
        this.searchInput = page.locator("//input[@name = 'search']");
        this.searchButton = page.locator("//button[@class = 'btn btn-default btn-lg']")
    }

    async clickMyAcconuntButton() {
       await this.click(this.myAccountIcon);
    }   

    async clickRegisterButton() {
        await this.click(this.registerButton);
    }

    async clickLoginButton() {
        await this.click(this.loginButton);
    }

    async searchProduct(key:string) {
        await this.fill(this.searchInput, key);
        await this.click(this.searchButton);
    }
}