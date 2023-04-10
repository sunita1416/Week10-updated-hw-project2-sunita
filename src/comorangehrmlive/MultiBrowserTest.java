package comorangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();


        }else{
            System.out.println("Wrong Browser name");

        }
        driver.manage().window().maximize();
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
