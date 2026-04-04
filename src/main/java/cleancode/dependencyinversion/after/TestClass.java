package cleancode.dependencyinversion.after;

public class TestClass {

    public void test(BrowserDriver driver) {

        driver.navigateTo("https://example.com");
        System.out.println("Title: " + driver.getPageTitle());
        driver.quit();
    }
}
