package Com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.ExpectedExceptions;

public class WaitStatementLib 
{
	
	public static void iSleep(int secs)
	{
		
		try 
		{
			
			Thread.sleep(secs*1000);
		}
		
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}


/*****************************************************************************************/
public static void iWaitForSecs(WebDriver driver,int secs)
{
	driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	
}
/**********************************************/
public static void eWaitForVisible(WebDriver driver,int secs,WebElement ele)
{
	
	WebDriverWait wait=new WebDriverWait(driver,secs);
	wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(ele)));
	
}

}







