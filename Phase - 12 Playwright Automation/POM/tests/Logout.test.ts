import {test, expect} from "../fixtures/BaseFixtures"
import login_data from "../test_data/login_data.json"


test("Logout Test" , async ({loginPage, dashboardPage}) => {
    await loginPage.navigate();
    await loginPage.login(login_data.validUser.username, login_data.validUser.password);
    expect(await dashboardPage.getPageTitle()).toBe("Dashboard");

    await dashboardPage.logOut();
    expect(await loginPage.getLoginTitle()).toBe("Login");
})
