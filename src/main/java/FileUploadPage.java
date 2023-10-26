import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage extends MyFilesUtils {

    @FindBy(id = "file-upload")
    private WebElement fileInputPath;

    @FindBy(id = "file-submit")
    private WebElement submitButton;

    @FindBy(id = "uploaded-files")
    private WebElement extractedFileName;

    @FindBy(linkText = MyFile)
    private WebElement fileInList;

    public FileUploadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fileAttaching(String fullPath) {
        fileInputPath.sendKeys(fullPath);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public String checkUploadedFile() {
        return extractedFileName.getText();
    }

    public void checkFileInList() {
        fileInList.isDisplayed();
    }

}
