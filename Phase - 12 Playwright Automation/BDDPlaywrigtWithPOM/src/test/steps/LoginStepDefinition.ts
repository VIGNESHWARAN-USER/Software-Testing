import { Given, When, Then } from "@cucumber/cucumber";
import { expect } from "@playwright/test";
import { App } from "../world/CustomWorld";
import { getLoginData } from "../utils/CSVReader";

Given("the user launches the application", async function (this: App) {
    await this.loginPage.navigate();
});

Given("the user clicks the My Account Icon", async function (this: App) {
    await this.homePage.clickMyAcconuntButton();
});

Given("the user clicks the login button", async function (this: App) {
    await this.homePage.clickLoginButton();
});

When("the user enters the {string} login details", async function (this: App, testName: string) {

        this.loginData = getLoginData(testName);

        await this.loginPage.fillDetails(
            this.loginData.email,
            this.loginData.password
        );
    }
);

When("click the Login button", async function (this: App) {
    await this.loginPage.clickLoginButton();
});

Then("the user navigates the success page", async function (this: App) {

    await expect(this.page).toHaveURL(/account/);
});

Then("the user should see the heading {string}",
    async function (this: App, expectedHeading: string) {

        expect(await this.successPage.getMyAccountText()).toBe(expectedHeading);
    }
);

Then("the user get the login error message", async function (this: App) {

        const actualMessage = await this.loginPage.getLoginFailureMessage();

        expect(actualMessage).toContain("");
    }
);