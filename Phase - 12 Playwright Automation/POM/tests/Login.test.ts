import {test, expect} from '../fixtures/BaseFixtures';
import login_data from "../test_data/login_data.json";

test.describe("Login Tests", () => {
    
    test.beforeEach( async ({loginPage})=>{
        await loginPage.navigate();
    })

    test("Valid Login Test", async({loginPage, dashboardPage}) =>{
        await loginPage.login(login_data.validUser.username, login_data.validUser.password);

        expect(await dashboardPage.getPageTitle()).toBe("Dashboard");
    })

    test("Invalid Login Test", async({loginPage}) =>{
        await loginPage.login(login_data.invalidUser.username, login_data.invalidUser.password);

        expect(await loginPage.getErrorMessage()).toBe("Invalid credentials");
    })
    
})