import {test, expect} from '@playwright/test'

test("Bing Test", async ({page}) => {
    await page.goto("https://www.bing.com/")

    const title = await page.title();
    const url = await page.url();

    console.log("Title: ", title);
    console.log("URL: ", url);

    await expect(page).toHaveTitle("Search - Microsoft Bing")
    await expect(page).toHaveURL("https://www.bing.com/")

    const copilot = page.getByText("Copilot").first();
    console.log("Inner test of copilot element: ",await copilot.innerText());

    const inputBox = page.getByPlaceholder("Search the web");
    const placehoder = await inputBox.getAttribute('placeholder');
    console.log("Placeholder attribute of search input is :", placehoder);

    await inputBox.fill("Playwright");
    await inputBox.press("Enter");

    

    const [newPage] = await Promise.all([
        page.context().waitForEvent("page"),
        page.locator("//a[text()='Installation | Playwright']").click()
    ]);

    await newPage.waitForLoadState();

    await expect(newPage).toHaveTitle("Installation | Playwright")
})
