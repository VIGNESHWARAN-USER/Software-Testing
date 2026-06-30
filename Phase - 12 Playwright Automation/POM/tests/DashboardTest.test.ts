import {test, expect} from "../fixtures/BaseFixtures"
import login_data from "../test_data/login_data.json"

test.describe("Dashboard Tests", () => {

    test.beforeEach(async ({loginPage}) => {
        await loginPage.navigate();
        await loginPage.login(login_data.validUser.username, login_data.validUser.password);
    })

    test("Check 'Quick Launch' Visible", async ({dashboardPage}) => {
        expect(await dashboardPage.getQuickLaunchText()).toBe("Quick Launch");
    })

    test("Check 'Time At Work' Visible", async ({dashboardPage}) => {
        expect(await dashboardPage.gettimeAtWorkText()).toBe("Time at Work");
    })

    test.afterEach(async ({dashboardPage}) => {
        await dashboardPage.logOut();
    })

})