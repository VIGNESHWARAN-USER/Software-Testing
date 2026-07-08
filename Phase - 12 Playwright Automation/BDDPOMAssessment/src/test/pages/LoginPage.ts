import { BasePage } from "./BasePage";

export class LoginPage extends BasePage {
    
    private emailInput = this.page.locator("//input[@id = 'Email']");
    private passwordInput = this.page.locator("//input[@id = 'Password']");
    private loginButton = this.page.locator("//input[@value = 'Log in']");
    private errorMessage = this.page.locator("//div[@class  = 'validation-summary-errors']/ul/li");


    async fillEmail(value: string) {
        await this.fill(this.emailInput, value)
    }

    async fillPassword(value: string) {
        await this.fill(this.passwordInput, value)
    }
    
    async clickLoginButton() {
        await this.click(this.loginButton);
    }

    async verifyErrorMessage(expectedMessage:string) {
        const actualMessage = await this.getTextContent(this.errorMessage);
        return actualMessage?.includes(expectedMessage); 
    }

}