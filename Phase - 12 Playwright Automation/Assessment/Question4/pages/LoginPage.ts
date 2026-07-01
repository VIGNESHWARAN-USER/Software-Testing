import {Locator, Page} from '@playwright/test'

export class LoginPage {
    
    readonly page: Page;
    readonly email: Locator;
    readonly password: Locator;
    readonly loginButton: Locator;
    readonly errorMessage: Locator;

    constructor(page: Page) {
        this.page = page;
        this.email = page.locator("//input[@name = 'email']");
        this.password = page.locator("//input[@name = 'password']")
        this.loginButton = page.locator("//input[@value = 'Login']")
        this.errorMessage = page.locator("//div[@class = 'alert alert-danger alert-dismissible']")
    }


    async login(email:string, password:string) {
       await this.email.fill(email);
       await this.password.fill(password);
       await this.loginButton.click();
    }   

    async getLoginFailureMessage() {
        return await this.errorMessage.textContent();
    }
}