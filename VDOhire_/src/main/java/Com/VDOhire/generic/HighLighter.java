package Com.VDOhire.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLighter {

	public static void highLightElement(WebDriver driver, WebElement username)
	{
	JavascriptExecutor js=(JavascriptExecutor)driver; 

	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", username);

	try 
	{
	Thread.sleep(500);
	} 
	catch (InterruptedException e) {

	System.out.println(e.getMessage());
	} 

	js.executeScript("arguments[0].setAttribute('style','border: solid 2px white');", username);
	

	}

	
	
	
	
	
	
	
	
	
	
}
