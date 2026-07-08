import {Locator, Page} from '@playwright/test'

export class BasePage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page
    }

    async navigate() {
        await this.page.goto("https://demowebshop.tricentis.com", {waitUntil: 'load', timeout: 100000})
    }

    async click(locator: Locator) {
        await locator.click();
    }

    async fill(locator: Locator, value: string) {
        await locator.fill(value);
    }

    async getTextContent(locator: Locator) {
        return await locator.textContent();
    }

    async isVisible(locator: Locator) {
        return await locator.isVisible();
    }
}