import { ProductPage } from './../pages/productPage';
import { ContactPage } from './../pages/contactPage';
import {test as base, expect} from '@playwright/test';
import { LoginPage } from '../pages/LoginPage';
import { HomePage } from '../pages/HomePage';

type Fixtures = {

    loginPage: LoginPage,
    homePage: HomePage,
    contactPage: ContactPage,
    productPage: ProductPage
}

export const test = base.extend<Fixtures> ({

    homePage: async ({page}, use) => {
        await use(new HomePage(page));
    },

    loginPage : async ({page}, use) => {
        await use(new LoginPage(page));
    },

    contactPage : async ({page}, use) => {
        await use(new ContactPage(page))
    },

    productPage : async ({page}, use) => {
        await use(new ProductPage(page));
    }
})

export {expect};