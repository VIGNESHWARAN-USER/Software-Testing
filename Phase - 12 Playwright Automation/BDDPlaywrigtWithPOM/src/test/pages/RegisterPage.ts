import { Locator, Page } from '@playwright/test';
import { BasePage } from './BasePage';
import { logger } from '../utils/Logger';

export class RegisterPage extends BasePage {

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

        this.firstName = page.locator("//input[@name='firstname']");
        this.lastName = page.locator("//input[@name='lastname']");
        this.email = page.locator("//input[@name='email']");
        this.telephone = page.locator("//input[@name='telephone']");
        this.password = page.locator("//input[@name='password']");
        this.confirm = page.locator("//input[@name='confirm']");
        this.continueButton = page.locator("//input[@value='Continue']");
        this.privacyPolicy = page.locator("//input[@value=1 and @type='checkbox']");
    }

    async fillDetails(
        firstName: string,
        lastName: string,
        email: string,
        telephone: string,
        password: string
    ) {
        logger.info(`Filling registration details for email: ${email}`);

        await this.fill(this.firstName, firstName);
        await this.fill(this.lastName, lastName);
        await this.fill(this.email, email);
        await this.fill(this.telephone, telephone);
        await this.fill(this.password, password);
        await this.fill(this.confirm, password);

        logger.info("Accepting Privacy Policy");
        await this.click(this.privacyPolicy);

        logger.info("Submitting registration form");
        await this.click(this.continueButton);

        logger.info("Registration form submitted");
    }

    async clickPrivacyPolicy() {
        logger.info("Accepting Privacy Policy");

        await this.click(this.privacyPolicy);

        logger.info("Privacy Policy accepted");
    }

    async clickContinueButton() {
        logger.info("Clicking Continue button");

        await this.click(this.continueButton);

        logger.info("Continue button clicked");
    }
}