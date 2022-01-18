package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCoronavirusStoryPage extends BasePage{

    public YourCoronavirusStoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//textarea")
    private WebElement questionLine;
    @FindBy(xpath = "//div[@class='input-threeup-leading ']")
    private WebElement userName;
    @FindBy(xpath = "//div[contains(@class,'input-threeup-following i')]")
    private WebElement userEmailAddress;
    @FindBy(xpath = "//div[@class='input-threeup-following ']")
    private WebElement userContactNumber;
    @FindBy(xpath = "//input[@aria-label='Location ']")
    private WebElement userLocation;
    @FindBy(xpath = "//input[@aria-label='Age']")
    private WebElement userAge;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement accept;
    @FindBy(xpath = "//div[@class='button-container']")
    private WebElement submit;

    public void sendKeysQuestion(){
        questionLine.sendKeys("How not to get coronavirus?");
    }
    public void sendKeysUserName(){
        userName.sendKeys("Oles");
    }
    public void sendKeysUserMail(){
        userEmailAddress.sendKeys("oles10081999@gmail.com");
    }
    public void sendKeysUserPhoneNumber(){
        userContactNumber.sendKeys("+380983643673");
    }
    public void sendKeysUserLocation(){
        userLocation.sendKeys("Kyiv");
    }
    public void sendKeysUserAge(){
        userAge.sendKeys("22");
    }
    public void clickAccept(){
        accept.click();
    }
    public void clickSubmit(){
        submit.click();
    }
}
