package Com.actitime.generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenshotLib 
{
	public void takeScreenshot(WebDriver driver,String scriptName)
	{
		EventFiringWebDriver efw=new EventFiringWebDriver(driver);
		
		
		 File srcFile = efw.getScreenshotAs(OutputType.FILE);
		 
		 //WaitStatementLib.iSleep(200);
		 
		 
		 
		// String filepath="";
		 //File file=new File(filepath);
		 
		File destFile= new File("./screenshot/"+scriptName+".png");
		try
		{
			FileUtils.copyFile(srcFile, destFile);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
		
	}

}
