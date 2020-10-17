package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement inputField = driver.findElement(By.cssSelector("_9c44d_3pyzl"));
        inputField.sendKeys("Mavic mini");
        inputField = driver.findElement(By.xpath("//*[@id=\"allegro.metrumHeader.search\"]/div/form/input/div/div/span"));
        inputField.sendKeys("Elektronika");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("_9c44d_3pyzl")));

        WebElement element = driver.findElement(By.className("#opbox-listing"));
        List<WebElement> elements = driver.findElements(By.className("#opbox-listing"));
        elements.get(0).getText();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
