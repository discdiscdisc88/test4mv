package myTest1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Test1inTestNg1 {
	WebDriver driver;

	@BeforeMethod
	public void setUp() throws Exception {
	
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void test1() throws Exception {

		driver.navigate().to("http://google.com");
		System.out.println("Test2 "+driver.getTitle());
		AssertJUnit.assertEquals(driver.getTitle(), "Google");

	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Exit");
	}

}