package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
       
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
        System.out.println("Test started");
        driver.get("https://www.facebook.com/");
        WebElement emailOrPhoneInput = driver.findElement(By.id("email")); 
        emailOrPhoneInput.sendKeys("shashikirankrpet@gmail.com");
        
        WebElement passwordInput = driver.findElement(By.id("pass")); 
        passwordInput.sendKeys("krpet@124");
        
        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

  
    }
}
