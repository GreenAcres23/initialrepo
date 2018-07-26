import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;

public class Autocomplete {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://att.decentrix.ws/#!/");

        WebElement nameField = driver.findElement(By.cssSelector("input[ng-model='username']"));
        nameField.click();
        nameField.sendKeys("dakers");

        WebElement passField = driver.findElement(By.cssSelector("input[ng-model='password']"));
        passField.click();
        passField.sendKeys("Silvert0n$23");

        WebElement checkBox = driver.findElement(By.cssSelector("input[type='checkbox']"));
        checkBox.click();

        driver.quit();

    }
}
