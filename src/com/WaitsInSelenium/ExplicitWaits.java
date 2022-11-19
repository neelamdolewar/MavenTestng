package com.WaitsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaits {

    public static void main(String[] args) {
        System.setProperty("webdriver.microsoftedge.driver", "C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
    }
}
