package cleancode.dependencyinversion.after;

public class ChromeBrowserDriver implements BrowserDriver {

    @Override
    public void navigateTo(String url) {
        System.out.println(url);
    }

    public String getPageTitle() {
        System.out.println("The title is: " );
        return "Chrome Page Title";
    }

    @Override
    public void quit() {
        System.out.println("Closing Chrome browser");
    }
}




