import {Locator, Page} from '@playwright/test'
import { BasePage } from './BasePage';

export class ProductPage extends BasePage{
    
    readonly productList: Locator;

    constructor(page: Page) {
        super(page);
        this.productList = page.locator("//div[@class = 'caption']/h4/a")
    }

    async getProductList() {
        return this.getAllProducts(this.productList)
    }

    async isProductAvailable(key:string) {
        const products:Locator[] = await this.getProductList();

        for(const product of products) {
            const prodctName = await this.getTextContent(product);
            if(prodctName?.includes(key)) {
                return true
            }
        }
        return false;
    }
}