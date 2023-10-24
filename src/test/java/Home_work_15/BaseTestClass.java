package Home_work_15;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.time.Duration;

public class BaseTestClass {
    private static final String URL = "https://the-internet.herokuapp.com/upload";
    File FileName = new File("textExample.txt");
    public WebDriver driver;
    public WebDriverWait wait;
    String ActualResult = "";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(URL);
    }

    @AfterMethod
    public void pauseBetweenMethods() throws InterruptedException {
        Thread.sleep(3000);
    }


    @AfterClass
    public void closeBrowser() {
        driver.quit();
    }

}

