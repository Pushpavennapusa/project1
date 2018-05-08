package Pushpa.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("pushpavenapusa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("chinnarama");
		driver.findElement(By.id("loginbutton")).click();

		while (driver.findElements(By.linkText("Sign Up")).size() < 1) {// 0<1
			Thread.sleep(500);// 0.5 sec wait
			System.out.println("wait for element************");
		}

	}
}
