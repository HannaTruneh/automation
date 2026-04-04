package cleancode.dependencyinversion.after;

public class FirefoxBrowserDriver implements BrowserDriver {

    @Override
    public void navigateTo(String url) {
        System.out.println(url);
    }

    public String getPageTitle() {
        System.out.println("The title is: ");
        return "Firefox Page Title";
    }

    @Override
    public void quit() {
        System.out.println("Closing Chrome browser");
    }
}

