package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Twitter_Login;

public class Twitter_follow extends BaseTest
{
	@Test
	public void Twitter_follow() throws AWTException
	{
		String email = Excel.abc(excelpath, "Sheet1", 0, 0);
		String pswd = Excel.abc(excelpath, "Sheet1",0,1);
		String profile = Excel.abc(excelpath, "Sheet1",0,2);
		Twitter_Login folw = new Twitter_Login(driver);
		folw.username(email);
		folw.pwd(pswd);
		folw.loginbtn();
		folw.search(profile);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		folw.follow();
	}

}
