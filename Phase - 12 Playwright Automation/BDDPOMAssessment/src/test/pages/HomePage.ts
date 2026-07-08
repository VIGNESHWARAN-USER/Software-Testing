import { BasePage } from "./BasePage";

export class HomePage extends BasePage {
    
    private registerButton = this.page.locator("//a[@href = '/register']");
    private loginButton = this.page.locator("//a[@href = '/login']");
    private account = this.page.locator("//a[@class = 'account']");
    private logoutButton = this.page.locator("//a[@href = '/logout']")
    
    async clickLoginButton() {
        await this.click(this.loginButton);
    }

    async clickRegisterButton() {
        await this.click(this.registerButton);
    }

    async isAccountVisible() {
        return await this.isVisible(this.account);
    }

    async getlogoutVisible() {
        return await this.isVisible(this.logoutButton);
    }
}