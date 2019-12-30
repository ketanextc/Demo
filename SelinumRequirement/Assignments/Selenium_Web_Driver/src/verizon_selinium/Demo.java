package verizon_selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
 
   public static void main(String[] args) {
  
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\group015\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
  
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.verizonwireless.com/homepage/");
       
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("gnavAccountMenu"))).build().perform();
        driver.findElement(By.linkText("Sign In")).click();
   }
}