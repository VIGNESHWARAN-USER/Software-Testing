import {test,expect} from '../fixtures/baseFixtures'
import loginData from '../test-data/loginData.json'
test.describe("Dashboard tests",() =>{
    test.beforeEach(async({lp,dp})=>{
        await lp.navigate()
        await lp.login(loginData.validUser.username,loginData.validUser.password);
    })
    test("Quick launch",async({dp})=>{
        await expect(dp.quickLaunch).toHaveText("Quick Launch");
    })
    test("Time at work @smoke",async({dp})=>{
        await expect(dp.timeatwork).toHaveText("Time at Work");
    })
    test.afterEach(async ({},testInfo) => {
    console.log("Test completed");
    console.log("Title:", testInfo.title);
    console.log("Duration: ",testInfo.duration);
});
})