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

import java.util.concurrent.TimeUnit;

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
    public void test() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mindaugas\\Desktop\\Telesoftas QA\\Project\\apps\\chromedriver_win32\\chromedriver.exe");

        JavascriptExecutor js = (JavascriptExecutor) browser;
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.get("https://www.phptravels.net");
        WebElement header = browser.findElement(By.id("preloader"));
        assertTrue(header.isDisplayed());


//  Entering hotel search
        browser.findElement(By.linkText("HOTELS")).click();
        browser.findElement(By.linkText("Search by Hotel or City Name")).click();
        browser.findElement(By.cssSelector(".select2-search input")).sendKeys("Singa");
        browser.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li[2]/ul/li[1]/div/span")).click();


//  Entering date and persons count
        browser.findElement(By.id("dpd1")).click();
        browser.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")).sendKeys("2018-12-01");
        browser.findElement(By.id("dpd2")).click();
        browser.findElement(By.xpath("//*[@id=\"dpd2\"]/div/input")).sendKeys("2018-12-10");
        browser.findElement(By.id("travellersInput")).click();
        browser.findElement(By.id("adultPlusBtn")).click();
        browser.findElement(By.id("adultPlusBtn")).click();
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[2]/div/form/div[5]/button")).click();


//  Selecting Hotels
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr/td/div[3]/a/button")).click();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div[3]/i")).click();
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div[3]/i")).click();
        browser.findElement(By.xpath("//*[@id=\"body-section\"]/div[5]/div/div[2]/div[2]/div/div/div[6]/div/div[1]/div[3]/div/div/a")).click();


//        browser.close();

    }
}