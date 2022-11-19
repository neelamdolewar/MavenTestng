package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenProgram1 {

    public void verifylogin()
        {
            System.setProperty("webdriver.chrome.driver", "C:\\NEELAM\\chromedriver_win32 (1)\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");
            //Thread.sleep(3000);
            driver.close();
    }



}
