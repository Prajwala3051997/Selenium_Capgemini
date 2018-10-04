
package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Swiggy{
	WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}

	
	@Test
	public void perform()
	{
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.className("x4bK8")).click();
		driver.findElement(By.id("mobile")).sendKeys("7259618246");
		driver.findElement(By.id("password")).sendKeys("raju@123456");
		driver.findElement(By.className("a-ayg")).click();
		
		
		String t=driver.getTitle();
		Reporter.log(t);
		SoftAssert s = new SoftAssert();
		String u=driver.getCurrentUrl();
		Reporter.log(u, true);
		s.assertAll();
		
}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
		
	}
}



