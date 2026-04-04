import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class MoreLocators {

    public static void main(String[] args){
        String name = "Archana";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");


        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button[class*='submit']")).click();

        By messageLocator = By.xpath("//p[text()='You are successfully logged in.']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(messageLocator));
        String message = element.getText();
        System.out.println(message);
        Assert.assertEquals(message, "You are successfully logged in.");

        //System.out.println(driver.findElement(By.tagName("p")).getText());
        //Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello " +name+",");
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.quit();
    }
}
