import { expect } from '@playwright/test';
import { App } from '../world/CustomWorld';
import {Given, When, Then} from '@cucumber/cucumber'

When("the user searches for {string}", async function (this: App, searchKey: string) {
    await this.homePage.searchProduct(searchKey);
});

Then(
    "the search results should be {string}",
    async function (this: App, result: string) {

        if (result === "found") {
            expect(
                await this.productPage.isProductAvailable("iPhone")
            ).toBeTruthy();
        } else {
            expect(
                await this.productPage.isProductAvailable("Nokia")
            ).toBeFalsy();
        }
    }
);