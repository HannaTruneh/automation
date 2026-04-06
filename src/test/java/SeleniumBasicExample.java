import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;

public class SeleniumBasicExample {

    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");

    }

    @Test
    @DisplayName("בדיקה")
    public void testFormSubmission() throws InterruptedException {
        WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", elementsButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elementsButton);

        WebElement textBoxButton = driver.findElement(By.xpath("//span[text()='Text Box']"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", textBoxButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", textBoxButton);

        WebElement fullNameInput = driver.findElement(By.id("userName"));
        fullNameInput.sendKeys("Hanna");

        WebElement submitButton = driver.findElement(By.id("submit"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", submitButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);

        Thread.sleep(2000);

    }

    @AfterAll
    public static void tearDown() {

        driver.quit();
    }
}
