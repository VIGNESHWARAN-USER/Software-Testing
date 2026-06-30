import {Page, Locator} from '@playwright/test';

export class DashboardPage {

    readonly page: Page;
    readonly dashboardTitle: Locator;
    readonly quickLaunch: Locator;
    readonly timeAtWork: Locator;
    readonly profilePicture: Locator;
    readonly logOutButton: Locator;

    constructor(page:Page) {
        this.page = page
        this.dashboardTitle = page.locator("//h6")
        this.quickLaunch = page.locator("//p[text() = 'Quick Launch']")
        this.timeAtWork =page.locator("//p[text() = 'Time at Work']")
        this.profilePicture = page.locator("//span/img[@alt = 'profile picture']")
        this.logOutButton = page.locator("//a[text() = 'Logout']")
    }

    async getPageTitle() {
        return await this.dashboardTitle.textContent()
    }

    async getQuickLaunchText() {
        return await this.quickLaunch.textContent()
    }

    async gettimeAtWorkText() {
        return await this.timeAtWork.textContent()
    }

    async logOut() {
        await this.profilePicture.click();
        await this.logOutButton.click();
    }

}