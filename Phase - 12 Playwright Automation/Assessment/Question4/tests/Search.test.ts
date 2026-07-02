import {test, expect} from '../fixtures/BaseFixtures'

test.describe("Search Tests @smoke", () => {

    test.beforeEach(async({homePage}) => {
        await homePage.navigate();
    })

    test("Search Test", async({homePage, productPage,}) => {
        await homePage.searchProduct(process.env.SEARCH_KEY!);
        expect(await productPage.isProductAvailable(process.env.SEARCH_KEY!)).toBe(true);
    })
})