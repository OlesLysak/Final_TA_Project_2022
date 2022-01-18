import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.testng.AssertJUnit.assertTrue;

//public class Task1_Part1<priority> {

//    private WebDriver driver;

//    @BeforeTest
//    public void profileSetUp(){
//        chromedriver().setup();
//  }

//    @BeforeMethod
//    public void testSetUp(){
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.bbc.com/");
//    }

//    @Test (priority = 1)
//    public void checkMainNews() {
//        driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[text()='News']")).click();
//        assertTrue(driver.findElement(By.xpath()).getText("тест який там написано"));
//    }

//    @Test (priority = 2)
//    public void checkUpToDateNews(){
//        driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[text()='News']")).click();
//        assertTrue(driver.findElement(By.xpath()).getText("текст який там написано"));
  //  }

//    @Test (priority = 3)
//    public void checkNameFirstArticleSpecifiedValue(){
//        driver.findElement(By.xpath("//div[@id='orb-nav-links']//a[text()='News']")).click();
//        //зберігаємо текст ссилки на категорію заголовку статті (наприклад UK або World)
//        driver.findElement(By.xpath("//input[@id='orb-search-q']")).sendKeys("Asia");
//        driver.findElement(By.xpath("//button[@id='orb-search-button']")).click();
//        assertTrue(driver.findElement(By.xpath()).getAttribute("Asia"));
//    }
//
//    @AfterMethod
//    public void tearDown(){
//        driver.quit();
//    }

//}
