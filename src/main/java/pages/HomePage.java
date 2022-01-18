package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage{

    WebDriver driver;

    public void openHomePage() {
        driver.navigate().to("https://www.bbc.com/");
    }

    public void clickButton(String text) {
        $(By.xpath("//div[@id='orb-nav-links']//a[text()='" + text + "']")).click();
        //$(By.xpath("//input[@id='orb-search-q']")).sendKeys("");
        //$(By.xpath("//button[@id='orb-search-button']")).click();
    }
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@id='orb-nav-links']//a[text()='News']")
    private WebElement news;

    @FindBy(xpath = "//input[@id='orb-search-q']")
    private WebElement search;

    @FindBy(xpath = "//button[@id='orb-search-button']")
    private WebElement searchButton;

}
