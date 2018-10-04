package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Auto_constant;
import Generic.Excel;
import POM.Loginpage;
import POM.Logout;

public class Login implements Auto_constant
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./SoftwarePOM/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		String us = Excel.abc(excelpath,"Sheet1",0,0);
		String pass = Excel.abc(excelpath,"Sheet1",1,0);
		//String name = Excel.abc(excelpath,"Sheet1",1,2);
		
		
		WebDriver driver=new ChromeDriver();
		Logout lout = new Logout(driver);
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		Loginpage l=new Loginpage(driver);

		l.emailaddtb(us);
		l.passwordtb(pass);
		l.login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Not Now']")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lout.options();
		
		/*Homepage h=new Homepage(driver);
		h.searchtb(name);
		h.searchbtn();
		Productpage p=new Productpage(driver);
		p.dressbtn();
		Cartpage c=new Cartpage(driver);
		c.cartbtn();*/
		
		lout.lout();
		

	}

}
