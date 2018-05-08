package toyota_scenarios;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class EbrochureTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 String s= driver.getTitle();
	 System.out.println(s);
	 //driver.switchTo().frame(1);
	  //driver.findElement(By.className("col-xs-12 col-sm-6 col-md-4 hidden-xs")).click();
	  
	 
	  driver.findElement(By.name("firstname")).sendKeys("Pushpa");
	  driver.findElement(By.name("surname")).sendKeys("vennapusa");
	  driver.findElement(By.name("email")).sendKeys("venn123@gmail.com");
	  driver.findElement(By.linkText("Miss")).click();
	  driver.findElement(By.id("checkbox-not_email-not_email")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.get("https://toyota.co.uk/brochures");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
