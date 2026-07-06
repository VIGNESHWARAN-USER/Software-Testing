import { Locator, Page } from '@playwright/test';
import { BasePage } from './BasePage';
import { logger } from '../utils/Logger';

export class LoginPage extends BasePage {

    readonly email: Locator;
    readonly password: Locator;
    readonly loginButton: Locator;
    readonly errorMessage: Locator;

    constructor(page: Page) {
        super(page);

        this.email = page.locator("//input[@name='email']");
        this.password = page.locator("//input[@name='password']");
        this.loginButton = page.locator("//input[@value='Login']");
        this.errorMessage = page.locator("//div[@class='alert alert-danger alert-dismissible']");
    }

    async clickLoginButton() {
        logger.info("Submitting login form");
        await this.click(this.loginButton);
        logger.info("Login form submitted");
    }

    async fillDetails(email: string, password: string) {
        logger.info(`Entering login credentials for: ${email}`);

        await this.fill(this.email, email);
        await this.fill(this.password, password);

        logger.info("Login credentials entered successfully");
    }

    async getLoginFailureMessage() {
        logger.info("Retrieving login failure message");

        const message = await this.getTextContent(
            this.errorMessage
        );

        logger.info(`Login failure message: ${message}`);

        return message;
    }
}