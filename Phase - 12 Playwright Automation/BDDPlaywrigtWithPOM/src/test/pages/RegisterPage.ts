import {Locator, Page} from '@playwright/test'
import { BasePage } from './BasePage';

export class RegisterPage extends BasePage{
    
    readonly firstName: Locator;
    readonly lastName: Locator;
    readonly email: Locator;
    readonly telephone: Locator;
    readonly password: Locator;
    readonly confirm: Locator;
    readonly continueButton: Locator;
    readonly privacyPolicy: Locator;

    constructor(page: Page) {
        super(page);

        this.firstName = page.locator("//input[@name = 'firstname']")
        this.lastName = page.locator("//input[@name = 'lastname']") ;
        this.email = page.locator("//input[@name = 'email']");
        this.telephone = page.locator("//input[@name = 'telephone']")
        this.password = page.locator("//input[@name = 'password']")
        this.confirm = page.locator("//input[@name = 'confirm']")
        this.continueButton = page.locator("//input[@value = 'Continue']")
        this.privacyPolicy = page.locator("//input[@value = 1 and @type = 'checkbox']")
    }

    async fillDetails(firstName:string, lastName:string, email:string, telephone:string, password:string) {
        await this.fill(this.firstName, firstName);
        await this.fill(this.lastName, lastName);
        await this.fill(this.email, email);
        await this.fill(this.telephone, telephone);
        await this.fill(this.password, password);
        await this.fill(this.confirm, password);
        await this.click(this.privacyPolicy);
        await this.click(this.continueButton);
    }

    async cliclPrivacyPolicy() {
        await this.click(this.privacyPolicy);
    }

    async clickContinueButton() {
        await this.click(this.continueButton);
    }
}