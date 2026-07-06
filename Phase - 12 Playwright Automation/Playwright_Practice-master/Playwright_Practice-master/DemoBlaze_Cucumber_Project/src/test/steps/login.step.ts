import { Browser, chromium, Page,expect } from '@playwright/test';
import { Given,When,Then } from "@cucumber/cucumber";
let page:Page;
let browser:Browser
Given('User on the home page', async function () {
  // Write code here that turns the phrase above into concrete actions
  browser=await chromium.launch({
    headless:false
  })
  page =await browser.newPage();
  await page.goto("https://www.demoblaze.com/")
});

When('user the click the login link', async function () {
  // Write code here that turns the phrase above into concrete actions
  await page.locator("//a[@id='login2']").click();
});

When('The user enter the username as {string}', async function (string) {
  // Write code here that turns the phrase above into concrete actions
  await page.locator("#loginusername").fill(string)
});

When('The user enter the password as {string}', async function (string) {
  // Write code here that turns the phrase above into concrete actions
  await page.locator("#loginpassword").fill(string)
});

When('click the login Button', async function () {
  // Write code here that turns the phrase above into concrete actions
  await page.locator("//button[text()='Log in']").click()
});

Then('User their username in dashboard page', async function () {
  // Write code here that turns the phrase above into concrete actions
  await expect(await page.locator("//a[@id='nameofuser']")).toHaveText("Welcome TamilKumar")
  await browser.close();
});
