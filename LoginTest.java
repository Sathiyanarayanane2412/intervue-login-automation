import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://intervue.io/company-login");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.className("AccessAccount-ColoredButton-Text"));

            emailField.sendKeys("neha@intervue.io");
            passwordField.sendKeys("Ps@neha@123");
            loginButton.click();

            Thread.sleep(3000);
            driver.get("https://intervue.io/company/interviews");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // driver.quit();
        }
    }
}
