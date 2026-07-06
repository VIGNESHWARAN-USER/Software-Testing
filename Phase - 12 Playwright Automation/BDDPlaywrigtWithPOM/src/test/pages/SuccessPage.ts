import { Locator, Page } from '@playwright/test';
import { BasePage } from './BasePage';
import { logger } from '../utils/Logger';

export class SuccessPage extends BasePage {

    readonly registerSuccessMessage: Locator;
    readonly myAccount: Locator;

    constructor(page: Page) {
        super(page);

        this.registerSuccessMessage = page.locator(
            "//h1[text()='Your Account Has Been Created!']"
        );

        this.myAccount = page.locator(
            "//h2[text()='My Account']"
        );
    }

    async getRegisterSuccessMessage() {
        logger.info("Retrieving registration success message");

        const message = await this.getTextContent(
            this.registerSuccessMessage
        );

        logger.info(`Registration success message: ${message}`);

        return message;
    }

    async getMyAccountText() {
        logger.info("Retrieving My Account page heading");

        const text = await this.getTextContent(
            this.myAccount
        );

        logger.info(`My Account heading: ${text}`);

        return text;
    }
}