import { test as base,expect}from '@playwright/test'
import { HomePage } from '../pages/HomePage';
import { LoginPage } from '../pages/LoginPage';
import { DashboardPage } from '../pages/DashboardPage';


type Fixtures= {
    hp:HomePage;
    lp:LoginPage;
    dp:DashboardPage;
   
}

export const test=base.extend<Fixtures>({
    hp:async({page},use)=>{
        await use(new HomePage(page));
    },
    lp:async({page},use)=>{
        await use(new LoginPage(page));
    },
    dp:async({page}, use)=>{
        await use(new DashboardPage(page))
    }
})
export {expect}