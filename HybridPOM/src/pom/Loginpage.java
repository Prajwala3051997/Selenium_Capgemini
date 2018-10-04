package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath="(//a[contains(@href,'login')])[2]")
	private WebElement login;
	
	@FindBy(xpath=("//input[@name='email']"))
	private WebElement emailaddress;
	
	@FindBy(xpath=("//input[@name='password']"))
	private WebElement password;
	
	@FindBy(xpath=("(//a[contains(@class,'button')])[2]"))
	private WebElement signin;

	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void loginpg() 
	{
		login.click();
	}
	public void emailid(String us) 
	{
		emailaddress.sendKeys(us);
	}
	public void pass(String pwd) 
	{
		password.sendKeys(pwd);
	}
	public void loginbtn() 
	{
		signin.click();
	}
	
}
