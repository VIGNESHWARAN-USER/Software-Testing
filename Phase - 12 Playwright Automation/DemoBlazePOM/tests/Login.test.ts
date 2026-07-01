import { expect, test } from "../fixtures/BaseFixtures";
import { getData } from '../utils/ExcelReader';
import { LoginData } from '../types/LoginData';

const loginData = getData("login_data.xlsx", "LoginData") as LoginData[];

test.describe("Login Tests", () =>{

    test.beforeEach(async ({homePage}) => {
        await homePage.navigate();
        await homePage.openLoginPage();
    })
    
    for(const data of loginData) {
        
        test(`Login test with ${data.testName}`, async ({page, homePage, loginPage}) => {
            
            if(data.testResult === "Failure") {

                page.on("dialog", async (alert) => {
                    expect(alert.message()).toBe(data.expectedMessage);
                    await alert.accept();                    
                })
                await loginPage.login(data.username, data.password);
            }
            else {
                await loginPage.login(data.username, data.password);
                await expect(homePage.logoutNavOption).toHaveText("Log out");
                await expect(homePage.nameNavOption).toHaveText(`Welcome ${data.username}`)
            }
        })
    }
})