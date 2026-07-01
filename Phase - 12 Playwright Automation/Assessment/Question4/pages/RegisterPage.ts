import {Locator, Page} from '@playwright/test'

export class RegisterPage {
    
    readonly page: Page;
    readonly firstName: Locator;
    readonly lastName: Locator;
    readonly email: Locator;
    readonly telephone: Locator;
    readonly password: Locator;
    readonly confirm: Locator;
    readonly continueButton: Locator;
    readonly privacyPolicy: Locator;

    constructor(page: Page) {
        this.page = page;
        this.firstName = page.locator("//input[@name = 'firstname']")
        this.lastName = page.locator("//input[@name = 'lastname']") ;
        this.email = page.locator("//input[@name = 'email']");
        this.telephone = page.locator("//input[@name = 'telephone']")
        this.password = page.locator("//input[@name = 'password']")
        this.confirm = page.locator("//input[@name = 'confirm']")
        this.continueButton = page.locator("//input[@value = 'Continue']")
        this.privacyPolicy = page.locator("//input[@value = 1 and @type = 'checkbox']")
    }

    async register(firstName:string, lastName:string, email:string, telephone:string, password:string) {
        await this.firstName.fill(firstName);
        await this.lastName.fill(lastName);
        await this.email.fill(email);
        await this.telephone.fill(telephone);
        await this.password.fill(password);
        await this.confirm.fill(password);
        await this.privacyPolicy.click();
        await this.continueButton.click();
    }
}