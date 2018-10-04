package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Message_POM 
{
	@FindBy(xpath="//input[contains(@placeholder,'Phone, email or username')]")
	private WebElement username;
	
	@FindBy(xpath="//input[contains(@class,'js-password-field')]")
	private WebElement pwd;
	
	@FindBy(xpath="//button[contains(@class,'submit EdgeButton EdgeButton--primary EdgeButtom--medium')]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(@class,'Icon Icon--dm Icon--large')]")
	private WebElement msgicon;
	
	@FindBy(xpath="//button[@class='DMInbox-toolbar DMComposeButton EdgeButton EdgeButton--small EdgeButton--primary dm-new-button js-initial-focus']")
	private WebElement newmsg;
	
	@FindBy(xpath="//textarea[@aria-autocomplete='list']")
	private WebElement receiver;
	
	@FindBy(xpath="(//button[contains(.,'Next')])[1]")
	private WebElement msgnext;
	
	@FindBy(xpath="//div[contains(@aria-label,'Narendra Modi')]")
	private WebElement typemsg;
	
	@FindBy(xpath="//span[.='Send']")
	private WebElement send;
	
	@FindBy(xpath="(//span[contains(@class,'Icon Icon--close Icon--medium')])[8]")
	private WebElement msgclose;
	
	public Message_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username(String email)
	{
		username.sendKeys(email);
	}
	public void pwd(String pswd)
	{
		pwd.sendKeys(pswd);
	}
	public void loginbtn()
	{
		loginbtn.click();
	}
	public void send() 
	{
		send.click();
	}
	
	public void typemsg(String type)
	{
		typemsg.sendKeys(type);
	}
	public void msgnext() 
	{
		msgnext.click();
	}
	public void receiver(String rcv)
	{
		receiver.sendKeys(rcv);
	}
	
	public void newmsg()
	{
		newmsg.click();
	}
	public void msgicon()
	{
		msgicon.click();
	}
	public void msgclose()
	{
		msgclose.click();
	}

}
