import {Given, When, Then} from '@cucumber/cucumber'
import { CustomWorld } from '../worlds/CustomWorld';
import { Register } from '../types/Register';
import { expect } from '@playwright/test';

Given('click on the regiter button', async function (this: CustomWorld) {
    this.homePage.clickRegisterButton()
});

When('the user fills the personal details', async function (this: CustomWorld, dataTable) {
    const data = dataTable.hashes()[0] as Register;

    await this.registerPage.selectGender(data.gender);
    await this.registerPage.fillFirstName(data.firstName);
    await this.registerPage.fillLastname(data.lastName);
    await this.registerPage.fillEmail(data.email);
    await this.registerPage.fillPassword(data.password);
    await this.registerPage.fillConfirmPassword(data.password);

});

When('click on the register button', async function (this: CustomWorld) {
    this.registerPage.clickRegisterButton();
});

Then('the user navigates to the registration result page', async function (this: CustomWorld) {
    await expect(this.page).toHaveURL("https://demowebshop.tricentis.com/registerresult/1")
});

Then('the success message should be displayed as {string}', async function (this: CustomWorld, string) {
    expect(await this.successPage.verifySuccessMessage(string)).toBeTruthy();
});