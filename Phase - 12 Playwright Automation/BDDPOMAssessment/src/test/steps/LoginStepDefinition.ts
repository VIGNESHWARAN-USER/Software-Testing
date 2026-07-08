import { Login } from './../types/Login';
import {Given, When, Then} from '@cucumber/cucumber'
import { CustomWorld } from '../worlds/CustomWorld';
import { expect } from '@playwright/test';
import valid_login_data from '../data/valid_login_data.json';
import { getCSVData } from '../utils/CSVReader';

Given('the user launched the application', async function (this: CustomWorld) {
    await this.loginPage.navigate();
});

Given('clicks on the login button', async function (this: CustomWorld) {
    await this.homePage.clickLoginButton();
});

When('the user fills the {string} details', async function (this: CustomWorld, string) {
    
    if(string === "valid") {
        await this.loginPage.fillEmail(valid_login_data.email);
        await this.loginPage.fillPassword(valid_login_data.password);
    }
    else {
        const data: Login = getCSVData("invalid_login_data.csv", string);
        if(data != undefined)
        {
            if(data.email == undefined) data.email = "";
            if(data.password == undefined) data.password = "";
            await this.loginPage.fillEmail(data.email);
            await this.loginPage.fillPassword(data.password);
        }
    }
});

When('click on the login button', async function (this: CustomWorld) {
    await this.loginPage.clickLoginButton();
});

Then('the user navigates to the home page', async function (this: CustomWorld) {
    await expect(this.page).toHaveURL("https://demowebshop.tricentis.com");
});

Then('the email should be displayed in the navigation area', async function (this: CustomWorld) {
    expect(this.homePage.isAccountVisible).toBeTruthy();
});

Then('the logout button should be displayed in the navigation area', async function (this: CustomWorld) {
  expect(this.homePage.getlogoutVisible).toBeTruthy();
});

Then('the error message should be displayed as {string}', async function (this: CustomWorld, string) {
    expect(this.loginPage.verifyErrorMessage(string)).toBeTruthy();
});

