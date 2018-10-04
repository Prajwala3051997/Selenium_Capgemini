package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
 static
  {
   System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
  }
	
 public static void main(String[] args) 
  {
	//launch the browser
	WebDriver driver=new ChromeDriver();
		
	//enter the URL
	driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/register?referer=https://www.myntra.com/");
	
	  
	//get valid username
    driver.findElement(By.name("email")).sendKeys("ankitdas333@ymail.com");
    
    //get valid password
    driver.findElement(By.name("password")).sendKeys("9098787727");
    
  //click on login button
    driver.findElement(By.xpath("//button[text()='Log in']")).click();
    
  
  //Displaying title of the page
    String myn = driver.getTitle();  
	System.out.println(myn);
	
  //URL of the page
	String umyn=driver.getCurrentUrl();
	System.out.println(umyn);
    
	  
  //Verification
	  if(myn.equals("Login"))
	   {
		  System.out.println("Myntra test passed");
	   }
	  else
	   {
		  System.out.println("Myntra test failed");
	   }    
	    
	  driver.close();
  }
	
}

