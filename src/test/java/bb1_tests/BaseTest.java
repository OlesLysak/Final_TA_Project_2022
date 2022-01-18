package bb1_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    private WebDriver driver;
    private static final String BBC_URL = "https://www.bbc.com/";

    @BeforeTest
    public void profileSetUp(){
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BBC_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
