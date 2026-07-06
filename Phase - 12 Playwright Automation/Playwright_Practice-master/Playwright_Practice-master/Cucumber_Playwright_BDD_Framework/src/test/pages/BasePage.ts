import {expect,Locator}from '@playwright/test';
export class BasePage{
    async click(locator:Locator){
        await locator.click();
    }
    async fill(locator:Locator,value:string){
        await locator.fill(value);
    }
}