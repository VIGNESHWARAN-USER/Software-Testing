import {Locator, Page} from '@playwright/test'

export class ProductPage {
    
    readonly page: Page;
    readonly productList: Locator;

    constructor(page: Page) {
        this.page = page;
        this.productList = page.locator("//div[@class = 'caption']/h4/a")
    }

    async getProductList() {
        return await this.productList.all();
    }

    async isProductAvailable(key:string) {
        const products:Locator[] = await this.getProductList();

        for(const product of products) {
            console.log(await product.textContent())
            const prodctName = await product.textContent();
            if(prodctName?.includes(key)) {
                return true
            }
        }
        return false;
    }
}