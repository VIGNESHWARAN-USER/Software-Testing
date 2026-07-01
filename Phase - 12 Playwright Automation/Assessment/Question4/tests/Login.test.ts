import {test, expect} from '../fixtures/BaseFixtures'
import { getData } from '../utils/CSVReader';
import { LoginData } from '../types/LoginData';

const login_data = getData("login_data.csv") as LoginData[];

test.describe("Login Tests @Regression", () => {

    test.beforeEach(async({homePage}) => {
        await homePage.navigate();
    })

    for(const data of login_data) {
        test(`Login Test with ${data.testName}` , async({homePage, loginPage, successPage}) => {
        await homePage.clickMyAcconuntButton();
        await homePage.clickLoginButton();
        await loginPage.login(data.email, data.password);
        
        if(data.expectedResult === "FAILURE") {
            const message = await loginPage.getLoginFailureMessage();
            expect(message).toBe("Warning: No match for E-Mail Address and/or Password.");
        }
        else{
            const message = await successPage.getMyAccountText();
            expect(message).toBe("My Account");
        }
    })
    }
})