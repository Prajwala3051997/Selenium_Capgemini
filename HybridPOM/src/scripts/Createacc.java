package scripts;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genric.Auto_Constant;
import genric.Basetest;
import genric.Excel;
import pom.CreateAccpage;

public class Createacc extends Basetest {
	@Test
		public void test()
		{
		driver.manage().window().maximize();
		String first=Excel.abc(excelpath, "Sheet1", 0, 2);
		String last=Excel.abc(excelpath, "Sheet1", 1, 1);
		String mail=Excel.abc(excelpath, "Sheet1", 0, 0);
		String no=Excel.abc(excelpath, "Sheet1", 2, 0);
		CreateAccpage cp=new CreateAccpage(driver);
		driver.get("https://applefurniturestore.com");
		cp.acc();
		cp.name(first);
		cp.name1(last);
		cp.emailid(mail);
		cp.tele(no);
		
	}
	}

