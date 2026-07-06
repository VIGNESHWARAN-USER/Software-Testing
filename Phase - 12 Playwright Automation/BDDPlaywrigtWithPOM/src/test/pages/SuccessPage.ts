import {Locator, Page} from '@playwright/test'
import { BasePage } from './BasePage';

export class SuccessPage extends BasePage{
    
    readonly registerSuccessMessage: Locator;
    readonly myAccount: Locator;

    constructor(page: Page) {
        super(page);
        this.registerSuccessMessage = page.locator("//h1[text() = 'Your Account Has Been Created!']");
        this.myAccount = page.locator("//h2[text() = 'My Account']")
    }

    async getRegisterSuccessMessage() {
        return await this.getTextContent(this.registerSuccessMessage);
    }

    async getMyAccountText() {
        return await this.getTextContent(this.myAccount);
    }
}