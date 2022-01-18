//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
//import static org.testng.AssertJUnit.assertTrue;
//
//public class Task2_Part2 {
//
//    private WebDriver driver;
//
//    @BeforeTest
//    public void profileSetUp() {
//        chromedriver().setup();
//    }
//
//    @BeforeMethod
//    public void testSetUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.bbc.com/");
//    }
//
//    @Test (priority = 1)
//    public void userCheckCanSendQuestionBBC(){
//        driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[text()='News']")).click();
//        driver.findElement(By.xpath("//li[contains(@class,'gs-o-list-ui__item--flush ge')]//span[text()='Coronavirus']/..")).click();
//        driver.findElement(By.xpath("//li[contains(@class,'gs-o-list-ui__item--flush ge')]//span[text()='Your Coronavirus Stories']/..")).click();
//        driver.findElement(By.xpath("//h3[contains(text(),'Your questions')]")).click();
//        driver.findElement(By.xpath("//textarea")).sendKeys("How not to get coronavirus?");
//        driver.findElement(By.xpath("//input[@aria-label='Name']")).sendKeys("Oles");
//        driver.findElement(By.xpath("//input[@aria-label='Email address']")).sendKeys("oles10081999@gmail.com");
//        driver.findElement(By.xpath("//input[@aria-label='Contact number']")).sendKeys("+380983643673");
//        driver.findElement(By.xpath("//input[@aria-label='Location ']")).sendKeys("Ukraine, Kyiv");
//        driver.findElement(By.xpath("//input[@aria-label='Age']")).sendKeys("22");
//        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//        driver.findElement(By.xpath("//div[@class='button-container']")).click();
//    }
//    // Тут зробити ще 2 таких самих приклада тільки, щоб була помилка десь в другому місці
//
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }
//}
