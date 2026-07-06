import { logger } from '../utils/Logger';
import { ENV } from './../../../config/env';
import { Locator, Page } from '@playwright/test';

export class BasePage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async navigate() {
        logger.info(`Launching website: ${ENV.baseUrl}`);
        await this.page.goto(ENV.baseUrl);
        logger.info("Website launched successfully");
    }

    async click(locator: Locator) {
        logger.info(`Clicking on element: ${await locator.toString()}`);
        await locator.click();
        logger.info("Element clicked successfully");
    }

    async fill(locator: Locator, data: string) {
        logger.info(`Entering value "${data}" into: ${await locator.toString()}`);
        await locator.fill(data);
        logger.info("Value entered successfully");
    }

    async getTextContent(locator: Locator): Promise<string | null> {
        logger.info(`Getting text from: ${await locator.toString()}`);
        const text = await locator.textContent();
        logger.info(`Retrieved text: "${text}"`);
        return text;
    }

    async getAllProducts(locator: Locator) {
        logger.info(`Getting all matching elements: ${await locator.toString()}`);
        const elements = await locator.all();
        logger.info(`Found ${elements.length} matching elements`);
        return elements;
    }
}