package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic.Excel;

public class Like implements Generic.Auto_constant
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./SoftwarePOM/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		String us = Excel.abc(excelpath,"Sheet1",0,0);
		String pass = Excel.abc(excelpath,"Sheet1",1,0);

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
		Loginpage l=new Loginpage(driver);

		l.emailaddtb(us);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		l.passwordtb(pass);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		l.login();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Not Now']")).click();
		driver.findElement(By.xpath("//button[.='Not Now']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions a=new Actions(driver);
	driver.findElement(By.xpath("//div[@class='_9AhH0']"));
	a.doubleClick().perform();
	Thread.sleep(3000);
	}
}