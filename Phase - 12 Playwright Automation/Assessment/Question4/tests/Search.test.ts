import {test, expect} from '../fixtures/BaseFixtures'

test.describe("Search Tests @smoke", () => {

    test.beforeEach(async({homePage}) => {
        await homePage.navigate();
    })

    test("Search Test", async({homePage, productPage,}) => {
        await homePage.searchProduct("Mac");
        expect(await productPage.isProductAvailable("Mac")).toBe(true);
    })
})