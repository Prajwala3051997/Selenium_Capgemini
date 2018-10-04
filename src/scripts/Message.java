package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Message_POM;
import pom.Twitter_Login;

public class Message extends BaseTest
{
	@Test
	public void Message() throws AWTException, InterruptedException
	{
		
		String email = Excel.abc(excelpath, "Sheet1", 0, 0);
		String pswd = Excel.abc(excelpath, "Sheet1",0,1);
		String rcv=  Excel.abc(excelpath, "Sheet1",2,0);
		String type =  Excel.abc(excelpath, "Sheet1",3,0);
		Message_POM icon = new Message_POM(driver);
		icon.username(email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		icon.pwd(pswd);
		icon.loginbtn();
		icon.msgicon();
		icon.newmsg();
		icon.receiver(rcv);
		Thread.sleep(4000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		icon.msgnext();
		icon.typemsg(type);
		icon.send();
		Thread.sleep(2000);
		icon.msgclose();
	}

}
