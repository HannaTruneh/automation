package cleancode.interfacesegregation.after;

interface BasicBrowser {

    void navigateTo(String url);
    String getPageTitle();
    void closeBrowser();

}
