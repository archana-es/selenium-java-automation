package com.archana;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //WebDriver driver = new FirefoxDriver();


        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //Thread.sleep(10000);
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("inputUsername")).sendKeys("contact@rahulshettyacademy.com");
        driver.findElement(By.name("inputPassword")).sendKeys("admin123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Archana");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("archanaelavumkudy@gmail.com");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("1234567890");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[2]")).click();
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*=pass]")).sendKeys("rahulshettyacademy");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("chkboxOne"))).click();
        //WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("chkboxOne"))).click();
        // checkbox.click();
        //driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        //driver.quit();

    }
}