package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.beust.jcommander.Strings;

public class Loginpage 
{
	/*@FindBy(linkText="Log in")
	private WebElement login;*/
	
	@FindBy(xpath="//input[@class='_2hvTZ pexuQ zyHYP']")
	private WebElement emailaddress;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log in']")
	private WebElement loginbtn;
	public static void main(Strings [] args)
	{
		public Loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
	}
	public void emailaddtb(String us) {
		// TODO Auto-generated method stub
		
	}
}

