import {test as base, expect} from '@playwright/test'
import { HomePage } from '../pages/HomePage';
import { RegisterPage } from '../pages/RegisterPage';
import { SuccessPage } from '../pages/SuccessPage';
import { LoginPage } from '../pages/LoginPage';
import { ProductPage } from '../pages/ProductPage';

type Fixtures = {
    homePage: HomePage;
    registerPage: RegisterPage;
    successPage: SuccessPage;
    loginPage: LoginPage;
    productPage: ProductPage
}

export const test = base.extend<Fixtures>({
    homePage: async ({page}, use) => {
            use(new HomePage(page))      
    },

    registerPage: async ({page}, use) => {
        use(new RegisterPage(page))
    },

    successPage: async ({page}, use) => {
        use(new SuccessPage(page))
    },

    loginPage: async ({page}, use) => {
        use(new LoginPage(page))
    },

    productPage : async ({page}, use) => {
        use(new ProductPage(page))
    }
})

export {expect}
