package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genric.Auto_Constant;
import genric.Basetest;
import pom.Productpage;



public class Myaccount extends Basetest{
	@Test
	public void test()
	{
		driver.manage().window().maximize();
		driver.get("https://applefurniturestore.com");
		Productpage pg=new Productpage(driver);
		pg.MyAccount();
		pg.tv1();
		
		
	}
}
