package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.Twitter_Login;

public class Tweet extends BaseTest
{
@Test
	public void Tweet()
	{
		Twitter_Login status= new Twitter_Login(driver);
		String email = Excel.abc(excelpath, "Sheet1", 0, 0);
		String pswd = Excel.abc(excelpath, "Sheet1",0,1);
		String profile = Excel.abc(excelpath, "Sheet1",0,2);
		String twt = Excel.abc(excelpath, "Sheet1",1,0);
		status.username(email);
		status.pwd(pswd);
		status.loginbtn();
		status.tweet(twt);
		status.tweetbtn();
		
	}
}
