import { ENV } from './../../../config/env';
import {Locator, Page} from '@playwright/test'

export class BasePage {

    readonly page: Page;

    constructor(page: Page) {
        this.page = page;
    }

    async navigate() {
        await this.page.goto(ENV.baseUrl);
    }

    async click(locator: Locator) {
        await locator.click();
    }

    async fill(locator: Locator, data: string) {
        await locator.fill(data);
    }

    async getTextContent(locator: Locator)  {
        return await locator.textContent();
    }

    async getAllProducts(locator: Locator) {
        return await locator.all();
    }
}