package scripts;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Twitter_Login;

public class M_Twitter_Login extends BaseTest
{
	@Test
	public void M_Twitter_Login()
	{
		String email = Excel.abc(excelpath, "Sheet1", 0, 0);
		String pswd = Excel.abc(excelpath, "Sheet1",0,1);
		Twitter_Login t = new Twitter_Login(driver);
		t.username(email);
		t.pwd(pswd);
		t.loginbtn();
		try {
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}