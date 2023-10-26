package Tests_from_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YourTest {

    WebDriver driver;

    @Test
    public void test_FirefoxLogin() throws Exception{
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");
        LoginPage login = new LoginPage(driver);
        login.loginAs("tomsmith");
        Thread.sleep(3000);
        // Place assert statements here.
    }
}
