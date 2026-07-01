import {Locator, Page} from '@playwright/test'

export class SuccessPage {
    
    readonly page: Page;
    readonly registerSuccessMessage: Locator;
    readonly myAccount: Locator;

    constructor(page: Page) {
        this.page = page;
        this.registerSuccessMessage = page.locator("//h1[text() = 'Your Account Has Been Created!']");
        this.myAccount = page.locator("//h2[text() = 'My Account']")
    }

    async getRegisterSuccessMessage() {
        return await this.registerSuccessMessage.textContent();
    }

    async getMyAccountText() {
        return await this.myAccount.textContent();
    }
}