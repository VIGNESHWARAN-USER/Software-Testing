import {Given, When, Then, DataTable} from '@cucumber/cucumber'
import { App } from '../world/CustomWorld';
import { expect } from '@playwright/test';

Given('the user clicks the register button', async function (this: App) {
    await this.homePage.clickRegisterButton();
});

When("the user enters the following registration details", async function (this: App, dataTable: DataTable) {
        const data = dataTable.hashes()[0];
        await this.registerPage.fillDetails(data.firstName, data.lastName, data.email, data.telephone, data.password);
    }
);

When( "checks the privacy policy option", async function (this: App) {
        await this.registerPage.clickPrivacyPolicy();
    }
);

When("click the Continue button", async function (this: App) {
        await this.registerPage.clickContinueButton();
    }
);

Then( "the user get the registration success message", async function (this: App) {

        await expect(
            this.page.getByRole("heading")
        ).toHaveText("");
    }
);

Then("the user get the registration error message", async function (this: App) {

        await expect(
            this.page.locator(".alert-danger")
        ).toContainText("");
    }
);