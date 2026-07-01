import {Locator, Page} from '@playwright/test'

export class HomePage {
    
    readonly page: Page;
    readonly myAccountIcon: Locator;
    readonly registerButton: Locator;
    readonly loginButton: Locator;
    readonly searchInput: Locator;
    readonly searchButton: Locator;

    constructor(page: Page) {
        this.page = page;
        this.myAccountIcon = page.locator("//i[@class = 'fa fa-user']")
        this.registerButton = page.locator("//a[text() = 'Register']").first();
        this.loginButton = page.locator("//a[text() = 'Login']").first();
        this.searchInput = page.locator("//input[@name = 'search']");
        this.searchButton = page.locator("//button[@class = 'btn btn-default btn-lg']")
    }

    async navigate() {
        await this.page.goto(process.env.BASE_URL!)
    }

    async clickMyAcconuntButton() {
       await this.myAccountIcon.click();
    }   

    async clickRegisterButton() {
        await this.registerButton.click();
    }

    async clickLoginButton() {
        await this.loginButton.click();
    }

    async searchProduct(key:string) {
        await this.searchInput.fill(key);
        await this.searchButton.click();
    }
}