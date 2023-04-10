package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";

        // Set up Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);



        // Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Print the current RUL
        driver.getCurrentUrl();
        System.out.println("Current URL : "+ driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source : "+ driver.getPageSource());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Enter username to username field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("siya2016");

        // Enter password to password field

        driver.findElement(By.name("password")).sendKeys("march03");

        // Close the browser
        driver.close();



    }
}
