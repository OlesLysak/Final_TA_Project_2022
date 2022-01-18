package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsPage extends BasePage{

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//li[contains(@class,'gs-o-list-ui__item--flush ge')]//span[text()='Coronavirus']/..")
    private WebElement coronavirus;

    @FindBy(xpath = "//li[contains(@class,'gs-o-list-ui__item--flush ge')]//span[text()='Your Coronavirus Stories']/..")
    private WebElement yourCoronavirusStory;

    @FindBy(xpath = "//h3[contains(text(),'Your questions')]")
    private WebElement yourCoronavirusQuestion;

    @FindBy(xpath = "//div[@class='nw-c-news-navigation']")
    private WebElement verifyNewsPageOpened;

    public void verifyNews(){
        verifyNewsPageOpened.isDisplayed();
    }
}
