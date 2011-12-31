package Com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseLib {
	public WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","testurl"})
	public void setUp(String browserName,String url)
	{
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			Reporter.log("Firefox launched",true);	
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("chrome launched",true);
			
		}
		driver.manage().window().maximize();
		WaitStatementLib.iWaitForSecs(driver, 20);
		driver.navigate().to(url);
		Reporter.log("url navigated",true);
		
	}
	
	@AfterMethod
	
	public void tearDown(ITestResult result)
	{
		String scriptName = result.getMethod().getMethodName();
		
		//ITestResult is responsible for script pass or fail.
		  if(result.isSuccess())
			
		  {
			System.out.println(scriptName+"script pass:)");
			
		  }
		  
		  else
		  {
			  
			System.out.println(scriptName+"script failed:(");
			ScreenshotLib slib=new ScreenshotLib();
			slib.takeScreenshot(driver, scriptName);
			Reporter.log("Screenshot has been taken", true);
			
		  }
	
		driver.close();
		Reporter.log("Browser closed",true);
		
	}
	}


