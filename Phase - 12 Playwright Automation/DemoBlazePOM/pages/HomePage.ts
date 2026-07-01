import {Locator, Page} from '@playwright/test'
import dotenv from 'dotenv'

export class HomePage {

    readonly page: Page;
    readonly loginNavOption: Locator;
    readonly logoutNavOption: Locator;
    readonly nameNavOption: Locator;
    readonly contactNavOption: Locator;
    readonly samsungGalaxyS6: Locator;

    constructor(page: Page) {
        this.page = page;
        this.loginNavOption = page.getByRole('link', { name: 'Log in' });
        this.logoutNavOption = page.getByRole('link', { name: 'Log out' });
        this.nameNavOption = page.locator('#nameofuser')
        this.contactNavOption = page.locator('//a[text()="Contact"]');
        this.samsungGalaxyS6 = page.locator('//a[text()="Samsung galaxy s6"]');
    }

    async navigate() {
        await this.page.goto(process.env.BASE_URL!)
    }

    async openContactPage() {
        await this.contactNavOption.click();
    }
    
    async openLoginPage() {
        await this.loginNavOption.click();
    }

    async openSamsungGalaxyS6() {
        await this.samsungGalaxyS6.click();
    }

}