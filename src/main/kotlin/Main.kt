package com.naftcom

import org.openqa.selenium.WebDriver
import org.openqa.selenium.edge.EdgeDriver
import org.testng.annotations.Test
import java.time.Duration

fun main() {
    println("Hello World!")
}

class MyTest {

    @Test
    fun launchBrow() {

        // Initiate Webdriver
        val driver: WebDriver = EdgeDriver();

        // adding implicit wait of 15 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // URL launch
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");

        // get browser title after browser launch
        System.out.println("Browser title: " + driver.title);
    }
}
