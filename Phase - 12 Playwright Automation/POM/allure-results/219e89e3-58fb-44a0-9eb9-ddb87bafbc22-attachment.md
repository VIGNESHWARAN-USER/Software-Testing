# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: LoginTest.test.ts >> Login Tests >> Valid Login Test
- Location: tests\LoginTest.test.ts:10:9

# Error details

```
Error: locator.click: Target page, context or browser has been closed
Browser logs:

<launching> C:\Users\vigne\AppData\Local\ms-playwright\firefox-1532\firefox\firefox.exe -no-remote -wait-for-browser -foreground -profile C:\Users\vigne\AppData\Local\Temp\playwright_firefoxdev_profile-QyHkb0 -juggler-pipe -silent
<launched> pid=32560
[pid=32560][err] JavaScript warning: resource://services-settings/Utils.sys.mjs, line 119: unreachable code after return statement
[pid=32560][out] 
[pid=32560][out] Juggler listening to the pipe
[pid=32560][out] console.error: "Warning: unrecognized command line flag" "-foreground"
[pid=32560][err] JavaScript error: chrome://juggler/content/Helper.js, line 82: NS_ERROR_FAILURE: Component returned failure code: 0x80004005 (NS_ERROR_FAILURE) [nsIWebProgress.removeProgressListener]
[pid=32560][out] console.error: "Error fetching remote settings base url from CDN. Falling back to https://firefox-settings-attachments.cdn.mozilla.net/" (new SyntaxError("XMLHttpRequest.open: '/' is not a valid URL.", (void 0), 126))
[pid=32560][out] console.error: services.settings: 
[pid=32560][out]   Message: EmptyDatabaseError: "main/nimbus-desktop-experiments" has not been synced yet
[pid=32560][out]   Stack:
[pid=32560][out]     EmptyDatabaseError@resource://services-settings/Database.sys.mjs:19:5
[pid=32560][out] list@resource://services-settings/Database.sys.mjs:96:13
[pid=32560][out] 
[pid=32560][out] console.warn: services.settings: #fetchAttachment: Forcing fallbackToDump to false due to Utils.LOAD_DUMPS being false
[pid=32560][out] console.error: (new NotFoundError("Could not find fa0fc42c-d91d-fca7-34eb-806ff46062dc in cache or dump", "resource://services-settings/Attachments.sys.mjs", 48))
[pid=32560][out] console.warn: "Unable to find the attachment for" "fa0fc42c-d91d-fca7-34eb-806ff46062dc"
Call log:
  - waiting for locator('//button')
    - locator resolved to <button type="submit" data-v-10d463b7="" data-v-0af708be="" class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button">…</button>
  - attempting click action
    - waiting for element to be visible, enabled and stable
    - element is visible, enabled and stable
    - scrolling into view if needed
    - done scrolling
    - performing click action

```