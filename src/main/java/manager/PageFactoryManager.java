package manager;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.NewsPage;
import pages.YourCoronavirusStoryPage;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver){
        this.driver = driver;
    }
    public HomePage getHomePage(){
        return new HomePage(driver);
    }
    public NewsPage getNewsPage(){
        return new NewsPage(driver);
    }
    public YourCoronavirusStoryPage getYourCoronavirusStoryPage(){
        return new YourCoronavirusStoryPage(driver);
    }
}
