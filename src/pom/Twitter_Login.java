package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Twitter_Login 
{
	@FindBy(xpath="//input[contains(@placeholder,'Phone, email or username')]")
	private WebElement username;
	
	@FindBy(xpath="(//input[contains(@type,'password')])[2]")
	private WebElement pwd;
	
	@FindBy(xpath="//button[contains(@class,'submit EdgeButton EdgeButton--primary EdgeButtom--medium')]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//input[contains(@class,'search-input')]")
	private WebElement search;
	
	@FindBy(xpath="(//span[.='Follow'])[2]")
	private WebElement follow;
	
	@FindBy(id="tweet-box-home-timeline")
	private WebElement tweet;
	
	@FindBy(xpath="(//button[contains(@type,'button')])[46]")
	private WebElement tweetbtn;

	/*@FindBy(xpath="//span[contains(@class,'Icon Icon--dm Icon--large')]")
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
	private WebElement send;*/
	
	@FindBy(xpath="(//a[contains(@class,'AdaptiveFiltersBar-target AdaptiveFiltersBar-target--link js-nav u-textUserColorHover ')])[5]")
	private WebElement video;
	
	public Twitter_Login(WebDriver driver) 
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
	public void search(String profile)
	{
		search.sendKeys(profile);
	}
	public void follow()
	{
		follow.click();
	}
	public void tweet(String twt)
	{
		tweet.sendKeys(twt);
	}
	public void tweetbtn()
	{
		tweetbtn.click();
	}
	public void video()
	{
		video.click();
	}
	

	/*public void send() 
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
	}*/

}
