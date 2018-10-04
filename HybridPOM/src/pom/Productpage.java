package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import generic.Auto_constant;
import genric.Auto_Constant;

public class Productpage implements Auto_Constant{
	@FindBy(xpath="//select[contains(@name,'option')]")
	private WebElement size;
	
	@FindBy(xpath="//a[@id='button-cart']")
	private WebElement cartbtn;
	
	@FindBy(xpath=("//div[@class=\"compare\"]"))
	private WebElement compare;
	
	@FindBy(xpath=("(//a[@href=\"http://applefurniturestore.com/\"])[2]"))
	private WebElement home;
	
	@FindBy(xpath=("(//a[.=\"My Account\"])[4]"))
	private WebElement Account;
	
	public Productpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void dropdown() throws AWTException 
	{
		size.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	public void cart() 
	{
		cartbtn.click();
	}
	public void comparebtn() throws AWTException 
	{
		compare.click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.mouseRelease(KeyEvent.VK_BACK_SPACE);
	}
	public void tv1()
	{
		home.click();
	}
	public void MyAccount()
	{
		Account.click();
	}
}
