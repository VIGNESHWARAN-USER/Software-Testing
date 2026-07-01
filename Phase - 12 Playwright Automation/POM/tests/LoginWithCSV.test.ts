import {test, expect} from '../fixtures/BaseFixtures';
import login_data from "../test_data/login_data.json";
import {readCSVData} from "../utils/CSVReader"

const testData = readCSVData("login_data.csv");

test.describe("Login Tests with CSV", () => {
    
    test.beforeEach( async ({loginPage})=>{
        await loginPage.navigate();
    })

    for(const data of testData) {
        test("Valid Login Test", async({loginPage, dashboardPage}) =>{
        await loginPage.login(login_data.validUser.username, login_data.validUser.password);

        expect(await dashboardPage.getPageTitle()).toBe("Dashboard");
    })

    test("Invalid Login Test", async({loginPage}) =>{
        await loginPage.login(login_data.invalidUser.username, login_data.invalidUser.password);

        expect(await loginPage.getErrorMessage()).toBe("Invalid credentials");
    })
    }
    
})