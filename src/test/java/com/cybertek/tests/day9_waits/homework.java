package com.cybertek.tests.day9_waits;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;



    public class homework {


        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();

        }

        @Test
        public void testCase1() throws InterruptedException {
            driver.get("https://practice-cybertekschool.herokuapp.com");
            driver.findElement(By.xpath("//a[text()='Registration Form']")).click();
            Thread.sleep(6000);
            driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("wrong_dob");
            WebElement Message = driver.findElement(By.xpath("//small[text()='The date of birth is not valid']"));
            Assert.assertTrue(Message.isDisplayed(), "The date of birth is not valid");
            System.out.println(Message.getText());

        }

        @Test
        public void testCase2() throws InterruptedException {

            driver.get("https://practice-cybertekschool.herokuapp.com");
            driver.findElement(By.xpath("//a[text()='Registration Form']")).click();
            WebElement checkbox1 = driver.findElement(By.id("inlineCheckbox1"));
            System.out.println("checkbox1 .isSelected() = " + checkbox1.isSelected());
            checkbox1.click();
            WebElement checkbox2 = driver.findElement(By.id("inlineCheckbox2"));
            System.out.println("checkbox1.isSelect() = " + checkbox1.isSelected());
            checkbox2.click();
            WebElement checkbox3 = driver.findElement(By.id("inlineCheckbox3"));
            System.out.println("checkbox3.isSelected() = " + checkbox3.isSelected());
            checkbox3.click();


            Thread.sleep(6000);

        }


        @Test
public void testCase3() throws InterruptedException {

            driver.get("https://practice-cybertekschool.herokuapp.com");
            driver.findElement(By.xpath("//a[text()='Registration Form']")).click();
            driver.findElement(By.name("firstname")).sendKeys("n");
            String Massage = driver.findElement(By.xpath("INVALID") ).getText();
            // Massage2 = driver.findElement(By.xpath("help-block")).sendKeys("first name must be more than 2 and less than 64 characters long");
            Thread.sleep(6000);

        }


        @Test
        public void testCas4() throws InterruptedException {
            driver.get("https://practice-cybertekschool.herokuapp.com");
            driver.findElement(By.xpath("//a[text()='Registration Form']")).click();
            driver.findElement(By.name("lastname")).sendKeys("A");
            String Massage = driver.findElement(By.xpath("INVALID")).getText();
            Thread.sleep(6000);
        }

     @Test
     public void testCas5() throws InterruptedException {

         driver.get("https://practice-cybertekschool.herokuapp.com");

         driver.findElement(By.name("username")).sendKeys("eyben");
         driver.findElement(By.name("email")).sendKeys("eyben@gmail.com");
         driver.findElement(By.name("password")).sendKeys("777alp");
         driver.findElement(By.name("phone")).sendKeys("1236789987");
         WebElement female = driver.findElement(By.id("//a[text()='radio']"));
         System.out.println("female  .isSelected() = " + female.isSelected());
         female .click();

        }
    @Test
    public void testCas6() throws InterruptedException {




    }


    }



