import {Locator, Page} from '@playwright/test'
import { BasePage } from './BasePage';

export class LoginPage extends BasePage{
    
    readonly email: Locator;
    readonly password: Locator;
    readonly loginButton: Locator;
    readonly errorMessage: Locator;

    constructor(page: Page) {
        super(page);

        this.email = page.locator("//input[@name = 'email']");
        this.password = page.locator("//input[@name = 'password']")
        this.loginButton = page.locator("//input[@value = 'Login']")
        this.errorMessage = page.locator("//div[@class = 'alert alert-danger alert-dismissible']")
    }   


    async clickLoginButton() {
       await this.click(this.loginButton);
    } 
    
    async fillDetails(email:string, password:string) {
        await this.fill(this.email ,email);
       await this.fill(this.password, password);
    }

    async getLoginFailureMessage() {
        return await this.getTextContent(this.errorMessage);
    }
}