package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genric.Auto_Constant;
import genric.Basetest;
import pom.Homepage;
import pom.Productpage;



public class Specials extends Basetest{
	@Test
	public void test(){
		driver.manage().window().maximize();
		Homepage hp=new Homepage(driver);
		driver.get("https://applefurniturestore.com");
		hp.specl();
		Productpage pg=new Productpage(driver);
		pg.tv1();
	}

}
