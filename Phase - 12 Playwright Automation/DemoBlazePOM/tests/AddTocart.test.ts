import { test, expect } from '../fixtures/BaseFixtures';

test.describe('Add Product To Cart', () => {

    test('Add Samsung Galaxy S6 to cart', async ({homePage,productPage,page}) => {

        await homePage.navigate();

        await homePage.openCategory("Phones");
        await homePage.openProduct("Samsung galaxy s6")

        page.once('dialog', async dialog => {
            expect(dialog.message()).toBe('Product added');
            await dialog.accept();
        });

        await productPage.addToCart();
    });
});