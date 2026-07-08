import { BasePage } from "./BasePage";

export class SuccessPage extends BasePage {

    private registrationSuccessMessage = this.page.locator("//div[contains(text() , 'Your registration completed')]")

    async verifySuccessMessage(expectedMessage : string) {
        const actualMessage:string = "" + await this.getTextContent(this.registrationSuccessMessage);
        return actualMessage.includes(expectedMessage);
    }

}