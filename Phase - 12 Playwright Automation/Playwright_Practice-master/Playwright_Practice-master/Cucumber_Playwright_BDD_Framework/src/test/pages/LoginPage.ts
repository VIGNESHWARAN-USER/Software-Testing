import {Page,Locator} from '@playwright/test'
import { BasePage } from './BasePage';
export class LoginPage extends BasePage{
    readonly page:Page;
    readonly username:Locator;
    readonly password:Locator;
    readonly loginButton:Locator;
    readonly errorMessage:Locator;
    constructor(page:Page){
        super();
        this.page=page;
        this.username=page.locator("//input[@id='input-email']");
        this.password=page.locator("//input[@id='input-password']");
        this.loginButton=page.locator("//input[@value='Login']");
        this.errorMessage=page.locator("//div[@class='alert alert-danger alert-dismissible']")
    }
    async setUsername(username:string){
        await this.fill(this.username,username)
        
    }
    async setPassword(password:string){
        await this.fill(this.password,password)
    }
    async clickLogin(){
        await this.click(this.loginButton)
    }
}