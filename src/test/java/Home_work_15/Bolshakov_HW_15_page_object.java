package Home_work_15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bolshakov_HW_15_page_object extends BaseTestClass {

    @Test(priority = 1, testName = "Завантаження файлу")
    public void test_1() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.fileAttaching(FileName.getAbsolutePath());
        fileUploadPage.clickSubmitButton();
        ActualResult = fileUploadPage.checkUploadedFile();
        Assert.assertEquals(ActualResult, FileName.toString());
    }

    @Test(priority = 2, testName = "Перевірка файлу в списку")
    public void test_2() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        driver.get("https://the-internet.herokuapp.com/download");
        fileUploadPage.checkFileInList();
    }
}