import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class FirstTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/valeryiazhdanava/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            driver.get("https://www.google.com/");
            //by id

            // by name
//            WebElement search = driver.findElement(By.name("q"));
//            search.sendKeys("Automation");
//            search.sendKeys(Keys.ENTER);
//            wait.until(presenceOfElementLocated(By.id("result-stats")));

            // by classname (click on gmail)
//            WebElement gmail = driver.findElement(By.className("gb_g"));
//            gmail.click();
//            wait.until(presenceOfElementLocated(By.linkText("Увійти")));


            // by linktext (click on gmail)
//            WebElement linkText = driver.findElement(By.linkText("Gmail"));
//            linkText.click();
//            wait.until(presenceOfElementLocated(By.linkText("Увійти")));



            // by cssSelector (enter to search)
//            WebElement cssSelector = driver.findElement(By.cssSelector("input[name='q']"));
//            cssSelector.sendKeys("Automation");
//            cssSelector.sendKeys(Keys.ENTER);
//            wait.until(presenceOfElementLocated(By.id("result-stats")));

            //by xpath
//            WebElement xpath = driver.findElement(By.xpath("//body/div/div[2]/form/div[2]/div/div/div/div[2]/input"));
            WebElement xpath = driver.findElement(By.xpath("//input[@name='q']"));
            xpath.sendKeys("Automation");
            xpath.sendKeys(Keys.ENTER);
            WebElement resultsPage = wait.until(presenceOfElementLocated(By.id("result-stats")));

//            List<WebElement> xpath = driver.findElements(By.className("ctr-p"));
//            xpath.get(1).sendKeys(Keys.ENTER);
//            xpath.sendKeys("Automation");
//            xpath.sendKeys(Keys.ENTER);
//            WebElement resultsPage = wait.until(presenceOfElementLocated(By.id("result-stats")));


//            search.sendKeys("Automation");
//            search.sendKeys(Keys.ENTER);
//            WebElement resultsPaga = wait.until(presenceOfElementLocated(By.id("result-stats")));
//            System.out.println(resultsPage.getAttribute("textContent"));
        } finally {
            driver.quit();
        }
    }
}
