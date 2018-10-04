package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genric.Auto_Constant;
import genric.Basetest;
import genric.Excel;
import pom.Homepage;
import pom.Loginpage;
import pom.Productpage;



public class Productsize extends Basetest{
	@Test
	public void test() throws AWTException{
		driver.manage().window().maximize();
		String usn=Excel.abc(excelpath, "Sheet1", 0, 0);
		String passwd=Excel.abc(excelpath, "Sheet1", 1, 0);
		String srch=Excel.abc(excelpath, "Sheet1", 0, 1);
		Loginpage lp=new Loginpage(driver);
		driver.get("https://applefurniturestore.com");
		lp.loginpg();
		lp.emailid(usn);
		lp.pass(passwd);
		lp.loginbtn();
		Homepage hp=new Homepage(driver);
		hp.searchtb();
		hp.searchicon();
		hp.plink();
		Productpage pg=new Productpage(driver);
		pg.dropdown();
		pg.cart();
	}

}
