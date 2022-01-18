package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class BasePage  {
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void implicitWait(long timeWait){
        driver.manage().timeouts().implicitlyWait(timeWait, TimeUnit.SECONDS);
    }
}
