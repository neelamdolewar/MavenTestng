package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTask {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\NEELAM\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://camposcoffee.com");
        driver.navigate().to("https://camposcoffee.com/shop/");

        WebElement DropDown = driver.findElement(By.id("sort"));
        Select select = new Select(DropDown);
        select.selectByValue("date");

        Thread.sleep(3000);

        driver.close();




    }
}
