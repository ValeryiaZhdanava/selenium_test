import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/valeryiazhdanava/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            driver.get("http://computer-database.gatling.io/computers?p=6&n=10&s=name&d=asc");

//          List<WebElement> xpath = driver.findElements(By.className("ctr-p"));

            // by name
            WebElement search = driver.findElement(By.name("q"));
            search.sendKeys("Automation");
            search.sendKeys(Keys.ENTER);
            wait.until(presenceOfElementLocated(By.id("result-stats")));


            WebElement xpath = driver.findElement(By.xpath("//input[@name='q']"));
            xpath.sendKeys("Automation");
            xpath.sendKeys(Keys.ENTER);
            WebElement resultsPage = wait.until(presenceOfElementLocated(By.id("result-stats")));

            //List elements.
//            List<WebElement> xpath = driver.findElements(By.className("ctr-p"));
//            xpath.get(1).sendKeys(Keys.ENTER);


            search.sendKeys("Automation");
            search.sendKeys(Keys.ENTER);
            WebElement resultsPaga = wait.until(presenceOfElementLocated(By.id("result-stats")));
            System.out.println(resultsPage.getAttribute("textContent"));
        } finally {
            driver.quit();
        }
    }
}
