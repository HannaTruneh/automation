package cleancode.interfacesegregation.befor;

public interface BrowserDriver {
    void navigateTo(String url);

    String getPageTitle();

    void clickElement(String locator);

    void sendKeysToElement(String locator, String input);

    void maximizeWindow();

    void minimizeWindow();

    void refreshPage();

    void closeBrowser();
}
