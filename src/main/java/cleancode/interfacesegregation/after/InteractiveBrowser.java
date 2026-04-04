package cleancode.interfacesegregation.after;

interface InteractiveBrowser {

    void clickElement(String locator);
    void sendKeysToElement(String locator, String input);
}
