package Testngparameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParametersBrowserExample {

    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void testScript(String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\NEELAM\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\NEELAM\\edgedriver_arm64 \\msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("please select correct browser");
        }
    }

        @Parameters({"s1","s2"})
        @Test
        public void run1 (String s1,String s2)
        {
            driver.get("https://www.google.com");
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys(s1 + "" + s2);
            element.sendKeys(Keys.ENTER);

        }

        @Parameters({"s1","s2"})
        @Test
        public void run2 (String s1, String s2)
        {
            driver.get("https://www.google.com");
            WebElement element = driver.findElement(By.name("q"));
            element.sendKeys(s1 + "" + s2);
            element.sendKeys(Keys.ENTER);

        }
        @AfterMethod
        public void afterMethodExample()
        {
            driver.close();

        }
    }



