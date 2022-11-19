package Asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsExample {

    SoftAssert softAsserts = new SoftAssert();

    WebDriver driver;


    @BeforeMethod
    public void beforeMethodExample()
    {
        System.out.println("Before Method Example");
        System.setProperty("webdriver.chrome.driver", "C:\\NEELAM\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void run1(){

        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println(title);
        softAsserts.assertEquals(title, "Google", "title should be match");
        softAsserts.assertNotEquals(title,"google","String should be corrected");
        softAsserts.assertFalse(title.contains("google"),"string should be google");
        System.out.println(title);
        softAsserts.assertAll();
    }


    @AfterMethod
    public void afterMethodExample()
    {
        System.out.println("After Method Example");
        driver.close();
    }


}


