import { Locator, Page } from '@playwright/test';
import { BasePage } from './BasePage';
import { logger } from '../utils/Logger';

export class ProductPage extends BasePage {

    readonly productList: Locator;

    constructor(page: Page) {
        super(page);
        this.productList = page.locator("//div[@class='caption']/h4/a");
    }

    async getProductList() {
        logger.info("Retrieving product list from the search results");

        const products = await this.getAllProducts(this.productList);

        logger.info(`Retrieved ${products.length} products`);

        return products;
    }

    async isProductAvailable(key: string) {
        logger.info(`Verifying whether product "${key}" is available`);

        const products: Locator[] = await this.getProductList();

        for (const product of products) {
            const productName = await this.getTextContent(
                product
            );

            logger.info(`Checking product: ${productName}`);

            if (productName?.includes(key)) {
                logger.info(`Product "${key}" found`);
                return true;
            }
        }

        logger.warn(`Product "${key}" was not found`);
        return false;
    }
}