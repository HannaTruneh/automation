import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void openGoogle() throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-headless"); // לוודא שלא headless

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        Thread.sleep(5000); // כדי שתראה את הדפדפן 5 שניות

        System.out.println("Title is: " + driver.getTitle());

        driver.quit();
    }
}