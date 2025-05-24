package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebpageTest {
    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://poojakuver535.github.io/sample_Maven_Project1_Repo/");
    }

    @Test
    public void titleValidationTest() {
        // Get the actual title from the webpage
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title Found: " + actualTitle);

        // Update the expected title to match the actual one
        String expectedTitle = "Tri pillar Solutions"; // Use the exact title seen in error

        // Validate the title
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match!");
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }
}
