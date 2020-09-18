import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class FirstTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/valeryiazhdanava/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            driver.get("https://www.google.com/");
            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys("Automation");
            search.sendKeys(Keys.ENTER);
            WebElement resultsPaga = wait.until(presenceOfElementLocated(By.id("result-stats")));
            System.out.println(resultsPaga.getAttribute("textContent"));
        } finally {
            driver.quit();
        }
    }
}
