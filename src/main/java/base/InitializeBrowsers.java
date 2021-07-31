package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeBrowsers {
	
public static WebDriverManager chromemanager;
public static WebDriverManager Firefoxmanager;
public static WebDriver driver;

	
	public static void loadBrowsers (String name) {
		if (name.equalsIgnoreCase("Chrome")) {
			chromemanager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
				
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		if (name.equalsIgnoreCase("Firefox")) {
			Firefoxmanager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
				
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
	}
	
	public static void login (String username, String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@name='login']")).click();
							
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InitializeBrowsers IB = new InitializeBrowsers();
	}

}
