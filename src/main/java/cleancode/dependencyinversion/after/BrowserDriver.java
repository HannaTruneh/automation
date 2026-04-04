package cleancode.dependencyinversion.after;

public interface BrowserDriver {

    void navigateTo(String url);

    String getPageTitle();

    void quit();
}
