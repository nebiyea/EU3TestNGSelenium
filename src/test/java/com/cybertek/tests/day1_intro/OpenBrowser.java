
package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();       //   we have to enter this line every time we want to open Chrome
        //   hey WebDriver can you make Chrome ready for me for automation

        //  WebDriver represent the browser
        //  We are creating driver for Chrome browser
        //  new ChromeDriver ---> This part will open Chrome browser
        WebDriver driver = new ChromeDriver();

        //  .get(url) method used for navigation to page
        driver.get("https://cybertekschool.com");

        //  This line will allow selenium to automate firefox browser
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver1 = new FirefoxDriver();

        driver1.get("https://www.facebook.com" );

    }

}
