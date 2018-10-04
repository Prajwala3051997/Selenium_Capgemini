package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout
{
	
	@FindBy(linkText="Profile")
	private WebElement lout;
	
	
	@FindBy(xpath="//span[contains(@class,'glyphsSpriteSettings__outline__24__grey_9 u-__7')]")
	private WebElement options;
	
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void lout()
	{
		lout.click();
	}
	public void options()
	{
		options.click();
	}
}

