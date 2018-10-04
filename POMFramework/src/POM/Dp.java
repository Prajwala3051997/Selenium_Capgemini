package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Excel;

public class Dp implements Generic.Auto_constant
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
		Loginpage l=new Loginpage();

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
		driver.findElement(By.linkText("https://scontent-ort2-2.cdninstagram.com/vp/a8539c22ed9fec8e1c43b538b1ebfd1d/5C5A1A7A/t51.2885-19/11906329_960233084022564_1448528159_a.jpg")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("https://scontent-ort2-2.cdninstagram.com/vp/a8539c22ed9fec8e1c43b538b1ebfd1d/5C5A1A7A/t51.2885-19/11906329_960233084022564_1448528159_a.jpg")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("upload")).sendKeys("C:\\Users\\premk\\Desktop\\capgemini");
		Thread.sleep(2000);
	}
}
