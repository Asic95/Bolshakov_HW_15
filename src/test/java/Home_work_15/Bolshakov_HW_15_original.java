package Home_work_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bolshakov_HW_15_original extends BaseTestClass {

    @Test(priority = 1, testName = "Завантаження файлу")
    public void fileUpload() {
        driver.findElement(By.id("file-upload")).sendKeys(FileName.getAbsolutePath());
        driver.findElement(By.id("file-submit")).click();
        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText().trim(), FileName.getName());
    }

    @Test(priority = 2, testName = "Перевірка файлу в списку")
    public void isFileInTheList() {
        driver.get("https://the-internet.herokuapp.com/download");
        Assert.assertTrue(driver.findElement(By.linkText(FileName.getName())).isDisplayed());

    }
}