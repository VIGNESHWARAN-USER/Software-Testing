import {Locator, Page} from '@playwright/test'
import dotenv from 'dotenv'

export class HomePage {

    readonly page: Page;
    readonly loginNavOption: Locator;
    readonly logoutNavOption: Locator;
    readonly nameNavOption: Locator;
    readonly contactNavOption: Locator;

    constructor(page: Page) {
        this.page = page;
        this.loginNavOption = page.getByRole('link', { name: 'Log in' });
        this.logoutNavOption = page.getByRole('link', { name: 'Log out' });
        this.nameNavOption = page.locator('#nameofuser')
        this.contactNavOption = page.locator('//a[text()="Contact"]');
    }

    async navigate() {
        await this.page.goto(process.env.BASE_URL!, 
            {waitUntil : 'domcontentloaded'}
        )
    }

    async openContactPage() {
        await this.contactNavOption.click();
    }
    
    async openLoginPage() {
        await this.loginNavOption.click();
    }

    async openCategory(categoryName:string) {
        this.page.locator(`//a[text() = ${categoryName}]`).click()
    }

    async openProduct(productName:string) {
        this.page.locator(`//a[text() = ${productName}]`).click()
    }

}