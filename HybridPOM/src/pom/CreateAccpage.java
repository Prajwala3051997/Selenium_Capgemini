package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccpage {
	@FindBy(xpath="(//a[contains(@href,'/register')])[2]")
	private WebElement account;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement email;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement telephone;
	
	@FindBy(xpath="//span[.='Continue']")
	private WebElement submit;
	
	public CreateAccpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void acc() 
	{
		
		account.click();
	}
	public void name(String first) 
	{
		firstname.sendKeys(first);
	}
	public void name1(String last) 
	{
		lastname.sendKeys(last);
	}
	public void emailid(String mail) 
	{
		email.sendKeys(mail);
	}
	public void tele(String no) 
	{
		telephone.sendKeys(no);
	}
	public void sub() 
	{
		submit.click();
	}
	
}
