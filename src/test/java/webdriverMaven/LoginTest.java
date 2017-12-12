package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp (){
		
		System.setProperty("webdriver.chrome.driver","E:\\java\\Jar files\\chromedriver.exe");
		
		 driver = new ChromeDriver();
	}
	
	
	@Test
	public void dologin(){
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40l, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("ninad.krishna");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("7058063437");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	}
	
	@AfterTest
	public void teardown(){
		
		driver.quit();
	}
	

}
