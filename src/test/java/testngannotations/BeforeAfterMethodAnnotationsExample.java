package testngannotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotationsExample {



        WebDriver driver;

        @BeforeMethod
        public void beforeMethodExample() {
            System.setProperty("webdriver.chrome.driver", "C:\\NEELAM\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();

        }

        @Test(groups = "smoke")
        public void run1() {
            driver.get("https://www.google.com");
        }

        @Test(groups = "smoke")
        public void run2() {
            driver.get("https://www.facebook.com");
        }


        @AfterMethod
        public void afterMethodExample() {
            driver.close();

        }

    }

