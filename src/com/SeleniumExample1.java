package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumExample1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/NEELAM/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    }
}
