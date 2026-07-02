import { UserFactory } from '../factories/UserFactory';
import {test, expect} from '../fixtures/BaseFixtures'
import { User } from '../types/User';

const data = UserFactory.createUser();
test.describe("Registration Tests @smoke", () => {

    test.beforeEach(async({homePage}) => {
        await homePage.navigate();
    })

    test("Registration Test", async({homePage, registerPage, successPage}) => {
        await homePage.clickMyAcconuntButton();
        await homePage.clickRegisterButton();
        await registerPage.register(data.firstName, data.lastName, data.email, data.phone, data.password);
        const message = await successPage.getRegisterSuccessMessage();
        expect(message).toBe("Your Account Has Been Created!");
    })
})