package com.example;

/**
 * Hello world!
 *
 */
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("login_field")).sendKeys("bitcsec3@gmail.com");
      	driver.findElement(By.id("password")).sendKeys("@bitcse6cdev");
      	driver.findElement(By.className("btn")).click();
    }
}
