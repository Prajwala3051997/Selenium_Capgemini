package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import generic.BaseTest;
import generic.Excel;
import pom.Twitter_Login;

public class Like_video extends BaseTest
{
	@Test
	public void Like_video() throws AWTException, InterruptedException
	{
		JavascriptExecutor j = (JavascriptExecutor)driver;
		String email = Excel.abc(excelpath, "Sheet1", 0, 0);
		String pswd = Excel.abc(excelpath, "Sheet1",0,1);
		String profile = Excel.abc(excelpath, "Sheet1",0,2);
		Twitter_Login like=new Twitter_Login(driver);
		like.username(email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		like.pwd(pswd);
		like.loginbtn();
		like.search(profile);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		like.video();
		for(int i = 0 ; i< 9 ; i++)
		{
			j.executeScript("window.scrollBy(0,-100)");
		}
	}
}
