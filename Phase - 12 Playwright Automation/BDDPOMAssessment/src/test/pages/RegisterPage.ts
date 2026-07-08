import { BasePage } from "./BasePage";

export class RegisterPage extends BasePage {
    
    private firstNameInput = this.page.locator("//input[@id = 'FirstName']")
    private lastNameInput = this.page.locator("//input[@id = 'LastName']")
    private emailInput = this.page.locator("//input[@id = 'Email']")
    private passwordInput = this.page.locator("//input[@id = 'Password']")
    private confirmPasswordInput = this.page.locator("//input[@id = 'ConfirmPassword']")
    private registerButton = this.page.locator("//input[@value = 'Register']")

    async getGenderLocator(key: string) {
        const xpath = `//input[@value = '${key}']`;
        return this.page.locator(xpath);
    }

    async selectGender(value: string) {
        this.click(await this.getGenderLocator(value));
    }

    async fillFirstName(value: string) {
        await this.fill(this.firstNameInput, value)
    }

    async fillLastname(value: string) {
        await this.fill(this.lastNameInput, value)
    }

    async fillEmail(value: string) {
        await this.fill(this.emailInput, value)
    }

    async fillPassword(value: string) {
        await this.fill(this.passwordInput, value)
    }

    async fillConfirmPassword(value: string) {
        await this.fill(this.confirmPasswordInput, value)
    }
    
    async clickRegisterButton() {
        await this.click(this.registerButton);
    }


}