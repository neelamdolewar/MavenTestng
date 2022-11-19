package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\NEELAM\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement fileUpload = driver.findElement(By.id("file-upload"));

        fileUpload.sendKeys("C:\\NEELAM");

        Thread.sleep(3000);

        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(3000);

        WebElement fileUploaded = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        if (fileUploaded.getText().equals("uploaded-files")) {
            System.out.println("File Uploaded succeessfully!");
        }else {
            System.out.println("File is not Uploaded");
        }
        
        driver.close();
    }
}
