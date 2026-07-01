import { ContactData } from './../types/ContactData';
import { test, expect } from '../fixtures/BaseFixtures';
import { getData } from '../utils/CSVReader';


const contacts : ContactData[] = getData("contact_data.csv") as ContactData[]

test.describe('Contact Tests', () => {
    console.log(contacts)
    for(const data of contacts) {
            test(data.testName, async ({homePage,contactPage,page}) => {

            await homePage.navigate();
            await homePage.openContactPage();

            await expect(contactPage.contactEmail).toBeVisible();

            await contactPage.fillContactForm(
                data.email,
                data.name,
                data.message
            );

            page.once('dialog', async dialog => {
                expect(dialog.message()).toBe('Thanks for the message!!');
                await dialog.accept();
            });

            await contactPage.sendMessage();
        });
    }

});