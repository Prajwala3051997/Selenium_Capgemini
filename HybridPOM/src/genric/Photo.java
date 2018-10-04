package genric;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	public static String getphoto(WebDriver driver,String path,String folder,String testcasename)
	{
		String photopath="";
		try
		{
			Date d=new Date();
			String s = d.toString();
			String date = s.replace(":","-");
			photopath=date+folder+testcasename+".png";
			TakesScreenshot t=(TakesScreenshot) driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			FileUtils.copyFile(src, dest);
			
		}
		catch(Exception e)
		{
	}
	return photopath;

	}}
