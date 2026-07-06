import { Locator, Page } from '@playwright/test';
import { BasePage } from './BasePage';
import { logger } from '../utils/Logger';

export class HomePage extends BasePage {

    readonly myAccountIcon: Locator;
    readonly registerButton: Locator;
    readonly loginButton: Locator;
    readonly searchInput: Locator;
    readonly searchButton: Locator;

    constructor(page: Page) {
        super(page);

        this.myAccountIcon = page.locator("//i[@class='fa fa-user']");
        this.registerButton = page.locator("//a[text()='Register']");
        this.loginButton = page.locator("//a[text()='Login']");
        this.searchInput = page.locator("//input[@name='search']");
        this.searchButton = page.locator("//button[@class='btn btn-default btn-lg']");
    }

    async clickMyAcconuntButton() {
        logger.info("Opening My Account menu");
        await this.click(this.myAccountIcon);
        logger.info("My Account menu opened");
    }

    async clickRegisterButton() {
        logger.info("Navigating to Register page");
        await this.click(this.registerButton);
        logger.info("Register page opened");
    }

    async clickLoginButton() {
        logger.info("Navigating to Login page");
        await this.click(this.loginButton);
        logger.info("Login page opened");
    }

    async searchProduct(key: string) {
        logger.info(`Searching for product: ${key}`);

        await this.fill(this.searchInput, key);
        await this.click(this.searchButton);

        logger.info(`Search completed for product: ${key}`);
    }
}