package loginScripts; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
public class Urban_ladder
{ 
static
{ 
System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe"); 
} 
public static void main(String[] args) 
{ 
//launch the browser 
WebDriver driver=new ChromeDriver(); 

//enter the URL of the application 
driver.get("https://www.Healthkart.in/login"); 

//enter the valid username 
driver.findElement(By.id("Health_user_email")).sendKeys("vishnuputture@gmail.com"); 

//enter the valid password 
driver.findElement(By.id("Health_user_password")).sendKeys("practice"); 

//click on login button 
driver.findElement(By.xpath("//input[contains(@value='Login')]")).click();

//to get title of the logged-in page 
String HLT = driver.getTitle(); 
System.out.println(HLT); 

//to get URL of the current application 
String user=driver.getCurrentUrl(); 
System.out.println(user); 

//Verification 
if(HLT.equals("Healthkart Lifestyle - HK")) 
{ 
System.out.println("HK test passed"); 
} 
else
{ 
System.out.println("HK test failed"); 
} 
//closing the application 
driver.close(); 
} 
}
