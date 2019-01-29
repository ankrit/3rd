package Com.VDOhire.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;



public class ScreenShotLib {
	
	
	public static String getScreenShotAs(WebDriver driver , String filename) throws IOException
	{
		EventFiringWebDriver event=new EventFiringWebDriver(driver);
		
		  File SrcFile = event.getScreenshotAs(OutputType.FILE);
		  
		  File DestFile=new File("C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\Screenshot"+filename+".png");
		  
		  
		FileUtils.copyFile(SrcFile, DestFile);
		
		
		return null;	
		
	}

}

/**
 * Note: make sure you should have this dependency for FileUtils class
 * 
 * <dependency>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-compiler-plugin</artifactId>
    <version>3.8.0</version>
</dependency>
 * 
 */
