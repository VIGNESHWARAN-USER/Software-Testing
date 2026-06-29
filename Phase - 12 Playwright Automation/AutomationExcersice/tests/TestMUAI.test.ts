import { test, expect } from '@playwright/test';


test("Test Case 1", async ({ page }) => {

    await page.goto("https://www.testmuai.com/selenium-playground/simple-form-demo/",{
        waitUntil:'networkidle'

    });

    console.log(await page.locator("input#user-message").getAttribute("placeholder"));

    await page.locator("input#user-message").fill("VIGNESHWARAN");
 
    console.log(await page.locator("input#user-message").inputValue());

    await expect(page.locator("input#user-message")).toHaveValue("VIGNESHWARAN");

    await page.click("#showInput");

    await expect(page.locator("#message")).toHaveText("VIGNESHWARAN");

});

test("Test Case 2",async({page})=>{

    await page.goto("https://www.testmuai.com/selenium-playground/simple-form-demo/",{
        waitUntil:'networkidle'

    })

    const a=15
    const b=15

    const result=a+b

    await page.fill("//input[@id='sum1']",""+a)
    await page.fill("//input[@id='sum2']",""+b)

    await page.click("//*[@id='gettotal']/button")
    
    console.log(await page.locator("//*[@id='gettotal']/button").boundingBox())
    await expect(page.locator("//p[@id='addmessage']")).toHaveText(""+result,{ timeout: 5000 })

})

test("Test Case 3",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/",{
        waitUntil:'networkidle'

    })

    let actual=""

    page.once("dialog",async(alert)=>{
        console.log(alert.message())
        actual=alert.message()  
        alert.accept()
        console.log("Alert accepted")
    })

    await page.locator("button:has-text('Click Me')").nth(0).click()

    expect(actual,"I am an alert box!")
})


test("Test Case 4",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")

    let actual=""

    page.once("dialog",async(alert)=>{
        console.log(alert.message())
        actual=alert.message()  
        alert.accept()
        console.log("Alert accepted")
    })

    await page.locator("button:has-text('Click Me')").nth(1).click()

    expect(actual,"Press a button!")
    expect(page.locator("//p[@id = 'confirm-demo']")).toContainText("You pressed OK!")
})

test("Test Case 5",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")

    let actual=""

    page.once("dialog",async(alert)=>{
        console.log(alert.message())
        actual=alert.message()  
        alert.dismiss()
        console.log("Alert denied")
    })

    await page.locator("button:has-text('Click Me')").nth(1).click()

    expect(actual,"Press a button!")
    expect(page.locator("//p[@id = 'confirm-demo']")).toContainText("You pressed Cancel!")
})

test("Test Case 6",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/javascript-alert-box-demo/")

    let actual=""

    page.once("dialog",async(alert)=>{
        console.log(alert.message())
        actual=alert.message()  
        alert.accept("Vignesh")
        console.log("Alert accepted")
    })

    await page.locator("button:has-text('Click Me')").nth(2).click()

    expect(actual,"Press a button!")
    expect(page.locator("//p[@id = 'prompt-demo']")).toContainText("You have entered 'Vignesh' !")
})

test("Test Case 7",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/select-dropdown-demo/")

    await page.selectOption("#select-demo", {index: 3})

    expect(page.locator("//p[@class = 'selected-value text-size-14']")).toContainText("Tuesday")
})

test("Test Case 8",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/select-dropdown-demo/")

    await page.selectOption("#select-demo", {label: "Tuesday"})

    expect(page.locator("//p[@class = 'selected-value text-size-14']")).toContainText("Tuesday")
})

test("Test Case 9",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/select-dropdown-demo/")

    await page.selectOption("#select-demo", {value: "Tuesday"})

    expect(page.locator("//p[@class = 'selected-value text-size-14']")).toContainText("Tuesday")
})


test("Test Case 10",async({page})=>{
    await page.goto("https://www.testmuai.com/selenium-playground/select-dropdown-demo/")

    await page.selectOption("#multi-select", [
        {label : 'Florida'},
        {value : 'Texas'},
        {index: 6}
    ])

})

test("Test Case 11",async({page})=>{
    await page.goto("https://letcode.in/frame")
    const frames= page.frames()
    console.log("Frame count: "+ frames.length);

    const firstFrame = page.frame("firstFr");

    await firstFrame?.locator("input[name = 'fname']").fill("VIGNESHWARAN")
    await firstFrame?.locator("input[name = 'lname']").fill("M")

    expect(firstFrame?.locator("//p[@class = 'text-sm font-semibold text-center']")).toContainText("You have entered VIGNESHWARA")

    const innerFrame = firstFrame?.frameLocator("iframe[src='/innerframe']");
    await innerFrame?.locator("input[name='email']").fill('vignesh@gmail.com');
})

test("Test Case 12", async({page, context})=>{
    await page.goto("https://demoqa.com/browser-windows")
    
    console.log("First window URL: ", page.url())

    const [newWindow] = await Promise.all([
        context.waitForEvent("page"),
        page.locator("#windowButton").click()
    ])

    await newWindow.waitForLoadState();

    console.log("New Window Url : ", newWindow.url())

    await expect(newWindow.locator("//h1[@id='sampleHeading']")).toHaveText("This is a sample page")

    await newWindow.close()

})

test("Test Case 13", async({page, context})=>{
    await page.goto("https://demoqa.com/browser-windows")
    
    const [newTab] = await Promise.all([
        context.waitForEvent("page"),
        page.locator("#tabButton").click()
    ])

    await newTab.waitForLoadState();


    const [newWindow] = await Promise.all([
        context.waitForEvent("page"),
        page.locator("#windowButton").click()
    ])

    await newWindow.waitForLoadState();

    const pages = context.pages()

    console.log("Number of pages: ", pages.length)

    for(const p of pages){

        console.log("------------------------------")
        console.log("URL: ", p.url())
        console.log("Title: ", await p.title())
    }
})
