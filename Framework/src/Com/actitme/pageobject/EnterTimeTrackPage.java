package Com.actitme.pageobject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class EnterTimeTrackPage extends BasePage {
	
	public  EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void verifyTitle(WebDriver driver)
	{
		String expTitle="actiTIME - Enter Time-Track";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle,expTitle);
		Reporter.log("home page title is verifyed",true);
		
	}

}
