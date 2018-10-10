import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class QATestasTest {

    private WebDriver browser;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindaugas\\Desktop\\Telesoftas QA\\Project\\apps\\chromedriver_win32\\chromedriver.exe");
        browser = new ChromeDriver();

//        browser = new FirefoxDriver();
        browser.manage().window().maximize();

    }

    @Test
    public void test() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) browser;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindaugas\\Desktop\\Telesoftas QA\\Project\\apps\\chromedriver_win32\\chromedriver.exe");
        browser.get("https://www.phptravels.net");
        WebElement header = browser.findElement(By.id("preloader"));
        assertTrue(header.isDisplayed());

//  Entering hotel search
        browser.findElement(By.linkText("HOTELS")).click();
        browser.findElement(By.linkText("Search by Hotel or City Name")).click();
        Thread.sleep(1000);
        browser.findElement(By.cssSelector(".select2-search input")).sendKeys("Singa");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/ul/li[1]/div/span")).click();
        Thread.sleep(1000);

//  Entering date and persons count
        browser.findElement(By.id("dpd1")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")).sendKeys("2018-12-01");
        Thread.sleep(1000);
        browser.findElement(By.id("dpd2")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"dpd2\"]/div/input")).sendKeys("2018-12-10");
        Thread.sleep(1000);
        browser.findElement(By.id("travellersInput")).click();
        Thread.sleep(1000);
        browser.findElement(By.id("adultPlusBtn")).click();
        Thread.sleep(1000);
        browser.findElement(By.id("adultPlusBtn")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[2]/div/form/div[5]/button")).click();
        Thread.sleep(1000);

//  Selecting Hotels
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr/td/div[3]/a/button")).click();
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div[3]/i")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div[3]/i")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div[2]/div/div/div[6]/div/div[1]/div[3]/div/div/a")).click();
        Thread.sleep(5000);

        browser.close();

    }
}