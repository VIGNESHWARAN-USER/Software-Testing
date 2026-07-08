import { LoginData } from './../types/LoginData';
import {Page, BrowserContext, Browser} from "@playwright/test";
import {setWorldConstructor, World} from '@cucumber/cucumber'
import { HomePage } from '../pages/HomePage';
import { LoginPage } from '../pages/LoginPage';
import { ProductPage } from '../pages/ProductPage';
import { RegisterPage } from '../pages/RegisterPage';
import { SuccessPage } from '../pages/SuccessPage';

export class App extends World{

    browser!: Browser;
    context!: BrowserContext;
    page!: Page;

    loginPage! : LoginPage;
    homePage! : HomePage;
    productPage! : ProductPage;
    registerPage! : RegisterPage;
    successPage! : SuccessPage;
    loginData!: LoginData;

}

setWorldConstructor(App);