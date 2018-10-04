package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Auto_Constant
{
	public WebDriver driver;
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
	}

	}
