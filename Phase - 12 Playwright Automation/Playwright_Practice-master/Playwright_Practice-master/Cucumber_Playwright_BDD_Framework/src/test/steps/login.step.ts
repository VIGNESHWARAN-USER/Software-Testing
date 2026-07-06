import { Given,When,Then } from "@cucumber/cucumber";
import { CustomWorld } from "../world/CustomWorld";
import { expect } from "@playwright/test";
import { logger } from "../utils/logger";

Given('user lanch the application', async function (this: CustomWorld) {
  // Write code here that turns the phrase above into concrete actions
    await this.hp.navigate();
    logger.info("URL launched")
});

When('user click myacclink', async function (this:CustomWorld) {
  // Write code here that turns the phrase above into concrete actions
  await this.hp.clickMyaccount();
  logger.info("Account clicked")
});

When('user click loginlink', async function (this:CustomWorld) {
  // Write code here that turns the phrase above into concrete actions
  await this.hp.clickLogin();
});

When('user enter the email', async function (this:CustomWorld) {
  // Write code here that turns the phrase above into concrete actions
  await this.lp.setUsername("tamilkumar@gmail.com")
});

When('user enter the tutorial password', async function (this:CustomWorld) {
  // Write code here that turns the phrase above into concrete actions
  await this.lp.setPassword("Kiot1234")
});

When('user click the login tutorial button', async function (this:CustomWorld) {
  // Write code here that turns the phrase above into concrete actions
  await this.lp.clickLogin();
});

Then('user should login success', async function (this:CustomWorld) {
  // Write code here that turns the phrase above into concrete actions
  await expect(this.dp.Mydashboard).toHaveText("My Account")
  logger.info("Login successfull")
});