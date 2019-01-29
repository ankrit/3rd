package Com.VDOhire.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStatementLib {
	
	public void implicitWaitForSecond(WebDriver driver,int duration)
	
	{
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		
	}
	
	public static void implicitWaitForMinutes(WebDriver driver, int duration)
	{
        driver.manage().timeouts().implicitlyWait(duration, TimeUnit.MINUTES);
	}
	
	public void getWaitStatementforExplicitclickble(WebDriver driver ,WebElement element,int duration)
	{
		WebDriverWait wait= new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void getWaitStatementforExplicitvisibility(WebDriver driver , WebElement element,int duration)
	
	{
		WebDriverWait wait=new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
	}
	
	
	
	
	
	

}
