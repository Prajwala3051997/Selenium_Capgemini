package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Auto_Constant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		
		System.setProperty(key,value);
	
		driver=new ChromeDriver();
		driver.get("https://applefurniturestore.com");
	}

	@AfterMethod
	public void closeapp(ITestResult r)
	{
		String name = r.getName();
		int status = r.getStatus();
		if(status==1)
		{
			Reporter.log("photo should be taken");
			Photo.getphoto(driver,photopath,"abc",name);
		}
		
		driver.close();
	}
	
}
