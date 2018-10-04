package genric;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {
	public void element(WebDriver driver,WebElement element)
	{
		try{
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("elemnet is found");
		}
		catch(Exception e)
		{
			Reporter.log("elemnet is not found");
			Assert.fail();
		}
	}


	
}
