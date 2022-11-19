package testngannotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeAfterClassAnnotationsExample {

    WebDriver driver;

    @BeforeClass
    public void beforeClassExample() {

        System.out.println("Before class Example");
    }

    @BeforeMethod
    public void beforeMethodExample() {
        System.setProperty("webdriver.chrome.driver", "C:\\NEELAM\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Before Method Example");

    }

    @Test
    public void run1() {
        driver.get("https://www.google.com");
        System.out.println("first test Example");
    }

    @Test
    public void run2() {
        driver.get("https://www.facebook.com");
        System.out.println("second test Example");
    }


    @AfterMethod
    public void afterMethodExample() {
        driver.close();
        System.out.println("After Method Example");

    }


    @AfterClass
    public void afterClassExample() {

        System.out.println("After class Example");
    }

}

