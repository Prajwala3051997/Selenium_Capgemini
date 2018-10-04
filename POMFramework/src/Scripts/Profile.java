package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Auto_constant;
import Generic.Excel;
import POM.Loginpage;

public class Profile implements Auto_constant
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
				driver.findElement(By.xpath("//span[.='Activity Feed']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//span[.='Follow Requests']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[.='Approve']")).click();
				Thread.sleep(3000);
				
	}}
		

