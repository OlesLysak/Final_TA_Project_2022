package stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.NewsPage;
import pages.YourCoronavirusStoryPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DefinitionSteps {

    WebDriver driver;
    PageFactoryManager pageFactoryManager;
    HomePage homePage;
    NewsPage newsPage;
    YourCoronavirusStoryPage yourCoronavirusStoryPage;

    @Before
    public void testSetUp(){
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @Given("User open home page")
    public void userOpenHomePage() {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage();
    }
    @When("User click on the {string}")
    public void userClickOnTheNews(String ButtonName) {
        this.homePage.clickButton("ButtonName");
    }
    @Then("News page is opened")
    public void newsPageIsOpened() {
        newsPage.verifyNews();
    }

    @Then("Verify headline title")
    public void verifyHeadlineTitle() {

    }

    @And("User enter question")
    public void userEnterQuestion() {
        yourCoronavirusStoryPage.sendKeysQuestion();
    }

    @And("User enter name")
    public void userEnterName() {
        yourCoronavirusStoryPage.sendKeysUserName();
    }

    @And("User enter email")
    public void userEnterEmail() {
        yourCoronavirusStoryPage.sendKeysUserMail();
    }

    @And("User enter phone number")
    public void userEnterPhoneNumber() {
        yourCoronavirusStoryPage.sendKeysUserPhoneNumber();
    }

    @And("User enter location")
    public void userEnterLocation() {
        yourCoronavirusStoryPage.sendKeysUserLocation();
    }

    @And("User enter age")
    public void userEnterAge() {
        yourCoronavirusStoryPage.sendKeysUserAge();
    }
}

