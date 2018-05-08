package Pushpa.Selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://fs2.formsite.com/meherpavan/form1/index.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("RESULT_FileUpload-9")).click();

		Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\chew-wga.log"); // Executes exe file

		driver.findElement(By.xpath("//*[@id='q21']/div/input[2]")).click();

	}

}
